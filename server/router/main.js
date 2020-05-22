
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


    app.post('/login', (req, res) => {
        const { email, password } = req.body;
        const hashedPassword = getHashedPassword(password);

        //fiding user in db
        user = true

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

    app.post('/register', (req, res) => {
        const { email, firstName, lastName, password, confirmPassword } = req.body;

        // Check if the password and confirm password fields match
        if (password === confirmPassword) {

            const hashedPassword = getHashedPassword(password);
            // Store user into the database if you are using one
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
