package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.*;
import ru.javabegin.training.springlibrary.entities.Provider;

//@WebServlet("/s")
//@Controller
//@RequestMapping("kfc/brands")


//@RestController
@RequestMapping(value = "api/v1")
public class MyServlet extends HttpServlet {


    // @TODO (relk): convert to POST
    @RequestMapping(value = "/test", method = RequestMethod.GET)
   // @Transactional
    public int getTest() {
        Provider pr = new Provider();
        int tour = pr.getKodProvider();
        //System.out.print("tour = " + tour.getKodProvider());

        return tour;

//return pointDao.delete(2);

    }





/*    @RequestMapping(value="/{id1}", method = RequestMethod.GET)
    public int  getShopInJSON(@PathVariable int id1) {

        Provider pr = new Provider();
        pr.setKodProvider(id1);


        return pr.getKodProvider();

    }*/
/*

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

      }
    @RequestMapping(value = "/prov", method = RequestMethod.GET)
    public @ResponseBody Provider getProviderInJSON(@PathVariable int id1){
        Provider pr = new Provider();
        pr.setKodProvider(1);

        return pr;

    }*/



    /*public @ResponseBody Provider getProviderInJSON(@PathVariable int id1){
        Provider pr = new Provider();
        pr.setKodProvider(1);

        return pr;

    }*/

}
