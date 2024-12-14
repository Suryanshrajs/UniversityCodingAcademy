import "./dbConnection.js";
import connection1 from "./dbConnection.js";

connection1.query("CREATE DATABSE mysqlclassprojecttet1", (err, results) => {
    if (err) {
        console.log(err);
    }
    else {
        console.log(results);
    }
});

//create table for datbse mysqlclassprojecttet1
connection1.query("CREATE TABLE mysqlclassproject.uca_students (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), age INT, PRIMARY KEY (id))")

//     if (err) {
//         console.log(err);
//     }
//     else {
//         console.log(results);
//     }
// });

