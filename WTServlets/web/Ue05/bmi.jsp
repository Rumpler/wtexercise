<%-- 
    Document   : bmi
    Created on : 01.05.2017, 17:35:44
    Author     : Gerrit
--%>



<%@page contentType="text/html" pageEncoding="UTF-8" import="ue05.BMILogic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BMI with JSP</title>
    </head>
    <body>
        <a href="../index.html">Back to mainpage</a> <br>
        <a href="./bmi.html">Back to BMI</a> <br>
        
        <p>JSP incoming</p>
        
        <%!
            double bmi;
            double size, weight;
        %>
        <%
            try{
                size= Double.parseDouble(request.getParameter("sizeJSP"));
                weight= Double.parseDouble(request.getParameter("weightJSP"));
            }catch(Exception e){
                size= weight= 0;
                
            }
            bmi= BMILogic.computeBMI(size, weight);
            
        %>
        
        <p>You are <%=size %> m tall 
            and <%=weight%> kg heavy <br>
            Your BMI is: <%=(int)bmi%></p>
        
        
    </body>
</html>
