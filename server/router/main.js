module.exports=function(app,driver)
{
    app.get('/',function(req,res){
        res.render('index.html')
        });

    app.get('/user',async function (req, res) {

        const session = driver.session()
        try {
        const result = await session.run(
            'MATCH (a) RETURN a'
        )
        // here prase to json and send to html
        result.records.forEach(element => {
            console.log(element.get(0))
        });
        console.log(node.properties)
        } finally {
        await session.close()
        }
        // on application exit:
        await driver.close()
        res.render('index2.html'); // so there is cool

    });

}
