/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 840979
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "---";
         request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calculation = request.getParameter("calc");
       
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("calc", calculation);
        
        int firstNum;
        int secondNum;
        int res;
        
        if (first == null || first.equals("") || second == null || second.equals("")){
            request.setAttribute("result", "Invalid.");
              getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
            
        }
        else {
            try {
          firstNum = Integer.parseInt(first);
          secondNum = Integer.parseInt(second);
         
       
    } catch (NumberFormatException nonNumeric) {
        request.setAttribute("result", "Invalid.");
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
        }
      
    }
        if (calculation.equals("+")){
         
         res = firstNum + secondNum;
         request.setAttribute("result", res);    
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
    }
        else if (calculation.equals("-")){
         
         res = firstNum - secondNum;
         request.setAttribute("result", res);    
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
    }
         else if (calculation.equals("*")){
         
         res = firstNum * secondNum;
         request.setAttribute("result", res);    
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
    }
         else if (calculation.equals("%")){
         
         res = firstNum % secondNum;
         request.setAttribute("result", res);    
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;// Very important! Stop the code call.
    }
    }
}
 
   


