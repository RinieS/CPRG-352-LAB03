
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 840979
 */
public class AgeCalculatorServlet extends HttpServlet {


  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
      
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        
        request.setAttribute("age", age);
        int entry;
        if (age == null || age.equals("")){
             request.setAttribute("message", "You must give your current age.");
              getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
        }
        else {
            try {
         entry = Integer.parseInt(age);
    } catch (NumberFormatException nonNumeric) {
        request.setAttribute("message", "You must enter a number.");
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
    }
        request.setAttribute("message", "Your age next birthday is " + (entry + 1));    
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
        }
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
