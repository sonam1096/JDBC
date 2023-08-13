<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Yahoo!!</title>
</head>
<body>
    hi <%=request.getAttribute("name")%>
    <p><font color="red"><%=request.getAttribute("errorMessage")%></font></p>
    
    <form action="login.do" method="post">
        Name : <input name="name" type="text"/>
        Password : <input name="password" type="password"/>
        <input type="submit"/>

    </form>   
</body>
</html>