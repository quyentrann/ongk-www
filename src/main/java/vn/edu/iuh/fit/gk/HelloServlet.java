package vn.edu.iuh.fit.gk;

import java.io.*;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.iuh.fit.connection.ConnectionDB;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.Role;
import vn.edu.iuh.fit.respository.CandidateRespository;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String action = request.getParameter("action");
        if (action!=null){
            long id = Long.parseLong(action);
            Candidate candidate = new CandidateRespository().findOne(id);
            System.out.println(candidate);
            request.setAttribute("candidate",candidate);

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/candidate_detail.jsp");
            dispatcher.forward(request,response);
        } else if (request.getParameter("viewRole")!=null) {
            if (request.getParameter("role").equals("ALL")){
                request.setAttribute("dsCAN",new CandidateRespository().getAll());
            }else {
                Role role = Role.valueOf(request.getParameter("role"));
                List<Candidate> ds = new CandidateRespository().getCandidateByRole(role);
                request.setAttribute("dsCAN",ds);
            }

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/report1.jsp");
            dispatcher.forward(request,response);
        }

    }
}