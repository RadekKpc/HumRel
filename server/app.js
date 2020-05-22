var USER = "project"
var PASSWORD = "1234"

var express=require('express');

var app=express();

const neo4j = require('neo4j-driver');


const driver = neo4j.driver("bolt://localhost:7687", neo4j.auth.basic(USER,PASSWORD));

require('./router/main')(app,driver);

app.set('views',__dirname + '/views');

app.set('view engine', 'ejs');

app.engine('html', require('ejs').renderFile);

var server=app.listen(3000,() =>console.log("Express is running on port 3000"));
