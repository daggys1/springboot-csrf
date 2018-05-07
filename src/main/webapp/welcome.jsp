<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Travel Assist</title>

</head>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
#content,footer{
max-width: 700px;
margin-left: auto;
margin-right: auto;
text-align: center;
}


</style>
<body style="background-color:powderblue;">
<div id="content">
<h1 style="text-align:center;">Welcome to Your Travel Assist</h1>
<div>

        <form:form method = "POST" action="distance/s">
         <table>
            <tr>
               <td><form:label path = "origin">Origin</form:label></td>
               <td><form:input path = "origin" /></td>
            </tr>
            <tr>
               <td><form:label path = "destination">Destination</form:label></td>
               <td><form:input path = "destination" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>
         </form:form>


</div>
</div>
<footer  style="text-align:center;">
 <small>&copy; Copyright 2058, Yoga Inc</small>
</footer>
</body>
</html>
