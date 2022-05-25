<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Form</title>
    <link rel="stylesheet" href="css/body.css">
</head>
<body>
<div class="container">
    <h2>Add new product</h2>
    <form action="/product" method="post" class="form-add">
        <input type="hidden" name="id" value="${product.id}"/>
        <div>
            <label class="label">Name</label>
            <input name="name" value="${product.name}">
        </div>
        <div>
            <label class="label">Price</label>
            <input name="price" value="${product.price}">
        </div>
        <div>
            <label class="label">Quantity</label>
            <input name="quantity" value="${product.quantity}">
        </div>
        <div>
            <label class="label">Color</label>
            <input name="color" value="${product.color}">
        </div>
        <div>
            <label class="label">Description</label>
            <input name="description" value="${product.description}">
        </div>
        <div>
            <label class="label">Category</label>
            <select name="category" class="select-ca">
                <option ${product.categoryId == 1 ? 'selected' : ''} value="1">Phone</option>
                <option ${product.categoryId == 2 ? 'selected' : ''} value="2">TV</option>
                <option ${product.categoryId == 3 ? 'selected' : ''} value="3">Other</option>
            </select>
        </div>
        <button class="submit">Submit</button>
    </form>
</div>
</body>
</html>
