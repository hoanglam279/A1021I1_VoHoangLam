<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
    <%--    <link rel="stylesheet" href="css/style.css">--%>
    <link rel="stylesheet" href="bootstrap-5.1.3-dist/css/bootstrap.min.css">
    <script src="bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/body.css">
</head>
<body>
<container>
    <h2>List Product</h2>
    <div class="head-top">
        <div class="add">
            <a href="form.jsp">Add new</a>
        </div>
        <form action="product?action=adfdfdfedfdf" method="post">
            <input name="name">
            <button>Search</button>
        </form>
    </div>
    <div class="head">
        <div class="head-id">
            Id
        </div>
        <div class="head-name">
            Product Name
        </div>
        <div class="head-price">
            Price
        </div>
        <div class="head-quantity">
            Quantity
        </div>
        <div class="head-color">
            Color
        </div>
        <div class="head-category">
            Category
        </div>
        <div class="head-action">
            Action
        </div>
    </div>

    <c:forEach var="p" items="${products}">
        <div class="publisher-item">
            <div class="head-id">
                    ${p.id}
            </div>
            <div class="head-name">
                    ${p.name}
            </div>
            <div class="head-price">
                    ${p.price}
            </div>
            <div class="head-quantity">
                    ${p.quantity}
            </div>
            <div class="head-color">
                    ${p.color}
            </div>
            <div class="head-category">
                    ${p.categoryName}
            </div>
            <div class="head-action">
                <a href="product?id=${p.id}" class="edit">Edit</a>
                <a href="#" onclick="openDeleteModal(${p.id})" class="delete">Delete</a>

            </div>
        </div>
    </c:forEach>
    <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form action="product" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Delete Product</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        Are you sure you want to delete this record?
                    </div>
                    <div class="modal-footer">
                        <input type="hidden" name="id" id="hdId"/>
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</container>
</body>
<script>
    function openDeleteModal(id) {
        document.getElementById("hdId").value = id;
        const deleteModal = new bootstrap.Modal(document.getElementById('deleteModal'), {
            keyboard: false
        })
        deleteModal.show();
    }
</script>
</html>
