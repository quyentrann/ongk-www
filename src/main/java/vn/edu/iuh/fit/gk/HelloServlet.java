package vn.edu.iuh.fit.gk;

import java.io.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.iuh.fit.connection.ConnectionDB;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.respository.CandidateRespository;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String action = request.getParameter("action");
        if (action!=null){
            long id = Long.parseLong(action);
//            Candidate candidate = new CandidateRespository().findOne();
        }

    }
}