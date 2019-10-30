package servlet;


import entity.Person;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import util.HibernateUtil;

public class HomeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

        /* Populating the DB if it is empty. */
        System.out.println("Maven + Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = new Person();

        person.setFirstname("Thierno Amirou");
        person.setLastname("DIALLO");
        person.setEmail("thiernoamiroud@gmail.com");

        session.save(person);
        session.getTransaction().commit();
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
        init();
    }
}
