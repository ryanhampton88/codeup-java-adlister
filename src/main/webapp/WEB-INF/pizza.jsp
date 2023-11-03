<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Codeup Pizza</title>
</head>
<body>

<form method="post" action="pizza-order">
  <label for="pizza">
  <select name="pizzaCrust" id="pizza">
    <option value="Thin">Thin</option>
    <option value="Hand Tossed">Hand-Tossed</option>
    <option value="Stuffed Crust">Stuffed Crust</option>
  </select>
  </label>

  <label for="sauce">
    <select name="pizzaSauce" id="sauce">
      <option value="Red Sauce">Red Sauce</option>
      <option value="Green Sauce">Green Sauce</option>
    </select>
  </label>

  <label for="size">
    <select name="size" id="size">
      <option value="12 inch">12 inch</option>
      <option value="16 inch">16 inch</option>
      <option value="18 inch">18 inch</option>
    </select>
  </label>

  <input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
  <label for="pepperoni">Pepperoni</label>
  <input type="checkbox" id="sausage" name="sausage" value="sausage">
  <label for="sausage">Pepperoni</label>
  <input type="checkbox" id="cheese" name="cheese" value="cheese">
  <label for="cheese">Cheese</label>

  <label for="address">Delivery Address</label>
  <textarea id="address" name="address" placeholder="enter your address"></textarea>

  <input type="submit">
</form>

</body>
</html>
