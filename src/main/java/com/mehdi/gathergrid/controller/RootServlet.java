package com.mehdi.gathergrid.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.mehdi.gathergrid.domain.models.Category;
import com.mehdi.gathergrid.repository.CategoryRepository;
import com.mehdi.gathergrid.service.CategoryService;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "rootServlet", value = "", loadOnStartup = 1)
public class RootServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        CategoryService service = new CategoryService();
        CategoryRepository repo = service.getCategoryRepository();
        Category cat = new Category("Sport", "this is great sport");
        Category cat1 = new Category("Music", "this is great Music");
        Category cat2 = new Category("Science", "this is great Science");
        repo.save(cat);
        repo.save(cat1);
        repo.save(cat2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String content = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <title>JSP - Hello World</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>Hello World!</h1>\n" +
                    "<br/>\n" +
                    "<a href=\"hello-servlet\">Hello Servlet</a>\n" +
                    "</body>\n" +
                    "</html>";
        PrintWriter out = resp.getWriter();
        out.println(content);
    }
}
