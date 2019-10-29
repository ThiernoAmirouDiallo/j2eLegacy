package servlet;


import entity.Person;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InscriptionServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

        /* Populating the DB if it is empty. */

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* Initialize some variables. */
        String redirectedUrl = "/inscription.jsp";

        String actionType = request.getParameter("actionType");
        if (actionType != null && actionType.equals("add")) {
            //make some controls and persist the person to the DB
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String email = request.getParameter("email");

            Person person = new Person(firstname, lastname, email);

            //render the view
            request.setAttribute("person", person);
            redirectedUrl = "/inscriptionOK.jsp";
        }

        getServletContext()
                .getRequestDispatcher(redirectedUrl)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // nothing.
        String redirectedUrl = "/inscription.jsp";
        getServletContext()
                .getRequestDispatcher(redirectedUrl)
                .forward(request, response);
    }
}
