<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Student Registration Form</title>
    </head>
    <body>
        <h1>Student Registration Form</h1>
        <br/>
        <form action="/register.do" method="post">
            <p>User Name : <input name="name" type="text"/></p>
            <p>Password : <input name="password" type="password"/></p>
            <p>Student Name: <input type="text" name="sname"/></p>
            <p>Email: <input type="email" name="email"/></p>
            <p>Course: <input type="text" name="course"/></p>
            <p>Age: <input type="text" name="age"/></p>
            <p><input type="submit" name="register" value="Submit"/></p><br/><br/>
            
            <p>Name: <input type="text" name="search"/><input type="submit" name="searchbutton" value="Search"/></p>
        </form>
    </body>
    </html>