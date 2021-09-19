<%-- 
    Document   : newjsp
    Created on : Apr 29, 2021, 11:32:29 PM
    Author     : Parva
--%>





<%@page import="test.connectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <%!  public static Connection con;%>

    <h1>Hello World!</h1> 
    <%  try {

        //driver class load
        con =connectionProvider.getConnection();

      } catch (Exception e) {
        e.printStackTrace();
      }
    %>
    <%= con%>
  </body>
</html>
