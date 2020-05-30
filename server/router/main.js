const dataBaseDriver = require("../components/dataBaseDriver.js")

const searchFriends = require("../components/searchFriend.js")

const crypto = require('crypto');

const getHashedPassword = (password) => {
    const sha256 = crypto.createHash('sha256');
    const hash = sha256.update(password).digest('base64');
    return hash;
}

const generateAuthToken = () => {
    return crypto.randomBytes(30).toString('hex');
}


const requireAuth = (req, res, next) => {
    if (req.user) {
        console.log(req.user)
        next();
    } else {
        res.render('login', {
            message: 'Please login to continue',
            messageClass: 'alert-danger'
        });
    }
};


module.exports=function(app,driver)
{

    db = new dataBaseDriver(driver)

    app.use((req, res, next) => {
        // Get auth token from the cookies
        const authToken = req.cookies['AuthToken'];

        // Inject the user to the request
        req.user = authTokens[authToken];

        next();
    });

    app.get('/', function (req, res) {
        res.render('home');
    });

    app.get('/login', (req, res) => {
        res.render('login');
    });

    const authTokens = {};

    app.get('/mainpage', requireAuth, (req, res) => {
        res.render('mainpage');
    });

    app.post('/logout', requireAuth, (req, res) => {
        res.cookie('AuthToken', null);
        res.redirect('/login');

    });


    app.post('/login',async function(req, res) {
        const { email, password } = req.body;
        const hashedPassword = getHashedPassword(password);
        console.log(email)
        console.log(hashedPassword)
        const session = driver.session()
        try {
        const result = await session.run(
            'MATCH (a:Person {password: "'+hashedPassword+'", mail: "'+email+'"}) RETURN a'
        )
        war = 0
        // here prase to json and send to html
        result.records.forEach(element => {
            war += 1
        });
        if(war != 0){
            result.records.forEach(element => {
                user = element.get(0)
            });
        }
        else{

            user = false

        }
    } finally {
        await session.close()
    }

        if (user) {
            const authToken = generateAuthToken();

            // Store authentication token
            authTokens[authToken] = user;

            // Setting the auth token in cookies
            res.cookie('AuthToken', authToken);

            // Redirect user to the protected page
            res.redirect('/mainpage');
        } else {
            res.render('login', {
                message: 'Invalid username or password',
                messageClass: 'alert-danger'
            });
        }
    });

    app.get('/register', (req, res) => {
        res.render('register');
    });

    app.post('/register',async function (req, res) {
        const { email, firstName, lastName, password, confirmPassword } = req.body;

        // Check if the password and confirm password fields match
        if (password === confirmPassword) {

            const hashedPassword = getHashedPassword(password);
            // Store user into the database if you are using one
            const session = driver.session()
            id = Math.random()* 1000000000;
            try {
            const result = await session.run(
                'CREATE (a:Person {id: "'+ id.toString() +'", mail: "'+ email +'" , password: "'+hashedPassword +'" , name: "'+ firstName + '", lastname: "' + lastName +'"})'
            )
            // here prase to json and send to html
            } finally {
            await session.close()
            }
            // on application exit:

            res.render('login', {
                message: 'Registration Complete. Please login to continue.',
                messageClass: 'alert-success'
            });

        } else {
            res.render('register', {
                message: 'Password does not match.',
                messageClass: 'alert-danger'
            });
        }
    });


    app.post('/mainpage/search', requireAuth,async  (req, res) => {
        const { search_string } = req.body;
        firends = []
        const words = search_string.split(' ');
        let query = "MATCH (m:Person) WHERE"
        words.forEach(e => {
            query += " m.name CONTAINS '"+ e +"' OR m.lastname CONTAINS '"+e +"' OR ";
        })
        query  = query.slice(0, -3)
        query += " RETURN {name: m.name, lastname: m.lastname, id: m.id}"

        const session = driver.session()
        try {
            const result = await session.run(query)
            result.records.forEach(element => {
                console.log(element)
                firends.push(element._fields[0])
            });
        }
        finally {
            await session.close()
        }
        console.log(firends)
        // firends.forEach(f =>
        //     console.log(f))

        res.render('mainpage',{
        friends: firends
    });

    });

    app.post('/mainpage/invite', requireAuth,async  (req, res) => {

        message ="Wysłano zaproszenie"
        messageClass = "alter alert-success"

        res.render('mainpage',{
        message: message,
        messageClass: messageClass
    });

    });

    // app.get('/user',async function (req, res) {

    //     const session = driver.session()
    //     try {
    //     const result = await session.run(
    //         'MATCH (a) RETURN a'
    //     )
    //     // here prase to json and send to html
    //     result.records.forEach(element => {
    //         console.log(element.get(0))
    //     });
    //     console.log(node.properties)
    //     } finally {
    //     await session.close()
    //     }
    //     // on application exit:
    //     await driver.close()
    //     res.render('index2.html'); // so there is cool

    // });

}
