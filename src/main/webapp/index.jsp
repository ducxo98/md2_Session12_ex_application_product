<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 19/07/2019
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/discount">
    <h3>Product Discount Calculator</h3>
    <label> Product description:</label>
    <input type="text" name="description" placeholder="product description"><br>
    <label>List Price:</label>
    <input type="text" name="price" placeholder="List price"><br>
    <label>Discount Percent:</label>
    <input type="text" name="discount" placeholder="Discount percent"><br>
    <input type="submit" id="sumit" value="Calculate Discount">


  </form>
  </body>
</html>
