package ru.gb.webapp.application;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "productServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {


    public void init() {   }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Tomato", 100));
        products.add(new Product(2, "Cheese", 101));
        products.add(new Product(3, "Fish", 102));
        products.add(new Product(4, "Chips", 103));
        products.add(new Product(5, "Cabbage", 104));
        products.add(new Product(6, "Pasta", 105));
        products.add(new Product(7, "Cucumber", 106));
        products.add(new Product(8, "Potato", 107));
        products.add(new Product(9, "Milk", 108));
        products.add(new Product(10, "Chocolate", 109));


        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Products</h1>");
        for(Product p : products){
            out.println("<h2>" + p.getTitle() + "</h2>");
            out.println("<p><font size=\"3\" face=\"Arial\"> Id: " + p.getId() + "</font></p>");
            out.println("<p><font size=\"3\" face=\"Arial\"> Cost: " + p.getCost() + "</font></p>");

        }
        out.println("</body></html>");

    }

    public void destroy() {
    }
}
