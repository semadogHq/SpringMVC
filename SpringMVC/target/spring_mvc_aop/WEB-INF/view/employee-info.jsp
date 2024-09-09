<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>
<h2>Employee Info</h2>
<br>

<form:form action="saveEmployee" modelAttribute="employee">


    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Departament <form:input path="departament"/>`
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    <input type="submit" value="OK">


</form:form>
</body>

</html>