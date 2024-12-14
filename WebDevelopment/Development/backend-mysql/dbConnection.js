import mysql2 from "mysql2";

const DB_CONNECTION_STRING1 = "mysql://root:12345678@localhost:3306/uca";

const connection1 = mysql2.createConnection(DB_CONNECTION_STRING1);

connection1.connect((err) => {
    if (err) {
        console.log(err);
    }
    else {
        console.log("Connected to Database 1");
    }
});

export default connection1;