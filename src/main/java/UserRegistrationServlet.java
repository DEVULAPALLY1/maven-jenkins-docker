import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserRegistrationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Success</title>");

        out.println("<style>");

        out.println("body {");
        out.println("display: flex;");
        out.println("justify-content: center;");
        out.println("align-items: center;");
        out.println("height: 100vh;");
        out.println("margin: 0;");
        out.println("font-family: Arial, sans-serif;");
        out.println("}");

        out.println(".message {");
        out.println("width: 350px;");
        out.println("text-align: center;");
        out.println("border: 1px solid #ccc;");
        out.println("border-radius: 10px;");
        out.println("padding: 30px;");
        out.println("}");

        out.println(".success {");
        out.println("color: green;");
        out.println("font-size: 24px;");
        out.println("font-weight: bold;");
        out.println("margin-bottom: 20px;");
        out.println("}");

        out.println(".details {");
        out.println("text-align: left;");
        out.println("}");

        out.println(".new-user {");
        out.println("display: block;");
        out.println("margin-top: 25px;");
        out.println("padding: 10px;");
        out.println("background-color: green;");
        out.println("color: white;");
        out.println("text-decoration: none;");
        out.println("border-radius: 5px;");
        out.println("}");

        out.println("</style>");
        out.println("</head>");

        out.println("<body>");

        out.println("<div class='message'>");

        out.println("<div class='success'>Registration Successful!</div>");

        out.println("<div class='details'>");

        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");

        out.println("</div>");

        out.println("<a class='new-user' href='index.html'>Add New User</a>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}