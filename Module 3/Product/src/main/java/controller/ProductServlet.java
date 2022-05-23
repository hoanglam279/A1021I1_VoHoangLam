package controller;

import bean.Product;
import service.ProductService;
import service.ProductServiceImpI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpI();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "update":
                update(request, response);
                break;
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {

    }
    private Product getProductFromVie(HttpServletRequest request) throws ServletException, IOException{
           String id =request.getParameter("id");
           String name =request.getParameter("name");
           String brand =request.getParameter("brand");
           String price =request.getParameter("price");
           String quantity =request.getParameter("quantity");
           String dateRelease =request.getParameter("dateRelease");

        return new Product(id,name,brand,price,quantity,dateRelease);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
