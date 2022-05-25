<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
  <title>The World Clock</title>
  <style type="text/css">
    select {
      width: 200px;
      height: 20px;
    }
  </style>
</head>
<body>
<h2>Sandwich Condiment</h2>
<form action="/sandwich", commandName = "sandwich" , method="post">
  <input type="checkbox"  name="condiments" value="lettuce">
  <label>Lettuce</label>
  <input type="checkbox"  name="condiments" value="tomato">
  <label>Tomato</label>
  <input type="checkbox"  name="condiments" value="mustard">
  <label>Mustard</label>
  <input type="checkbox"  name="condiments" value="sprouts">
  <label>Sprouts</label>
  <br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>