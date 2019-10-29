package servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {

        /* Populating the DB if it is empty. */

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* Initialize some variables. */
        String redirectedUrl = "/index.jsp";

        getServletContext()
                .getRequestDispatcher(redirectedUrl)
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // nothing.
    }
}
