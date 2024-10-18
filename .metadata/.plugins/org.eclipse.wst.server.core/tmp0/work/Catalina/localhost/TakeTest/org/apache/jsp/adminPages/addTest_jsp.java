/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-09-25 13:18:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.adminPages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class addTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Add new test</title>\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        background-color: lightgray;\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        height: 100vh;\n");
      out.write("        margin: 0;\n");
      out.write("        font-size: 18px; /* Increased font size */\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .container {\n");
      out.write("        background-color: #ffffff;\n");
      out.write("        border-radius: 8px;\n");
      out.write("        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        padding: 20px;\n");
      out.write("        width: 400px;\n");
      out.write("        margin: 25px; /* Decreased margin */\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    h1 {\n");
      out.write("        text-align: center;\n");
      out.write("        margin-top: 0;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    form {\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    input[type=\"text\"],\n");
      out.write("    input[type=\"number\"],\n");
      out.write("    button[type=\"submit\"] {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        padding: 10px;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    button[type=\"submit\"] {\n");
      out.write("        background-color: #8080ff;\n");
      out.write("        color: white;\n");
      out.write("        cursor: pointer;\n");
      out.write("        transition: background-color 0.3s;\n");
      out.write("        transition: font-size 0.5s;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    button[type=\"submit\"]:hover {\n");
      out.write("        font-size: 18px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .dashboard-btn {\n");
      out.write("        float: right;\n");
      out.write("        background-color: #6643b5;\n");
      out.write("        color: white;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        padding: 10px 20px;\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        cursor: pointer;\n");
      out.write("        transition: background-color 0.3s;\n");
      out.write("        transition: font-size 0.5s;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .dashboard-btn:hover {\n");
      out.write("        font-size: 17px;\n");
      out.write("        background-color: #005f79;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        HttpSession session2 = request.getSession(false);
        if (session2 != null && session2.getAttribute("username") != null) {
    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Add new test</h1>\n");
      out.write("        <form action=\"../AddTest\" method=\"post\">\n");
      out.write("            <label for=\"test_tag\" style=\"font-size: 14px\">Enter Test Tag</label>\n");
      out.write("            <input type=\"text\" id=\"test_tag\" name=\"test_tag\" placeholder=\"Test Tag (Max 20 characters)\" required maxlength=\"20\">\n");
      out.write("            \n");
      out.write("            <label for=\"questions\" style=\"font-size: 14px; margin-top: 10px\">Enter Number of Questions</label>\n");
      out.write("            <input type=\"number\" id=\"questions\" name=\"questions\" placeholder=\"Questions (Max 50 ques)\" required max=\"50\" min = \"1\">\n");
      out.write("            \n");
      out.write("            <label for=\"pass_marks\" style=\"font-size: 14px; margin-top: 10px\"> Enter Pass Marks</label>\n");
      out.write("            <input type=\"number\" id=\"pass_marks\" name=\"pass_marks\" min=\"0\" placeholder=\"Pass marks (considering 1 mark for each question)\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"language\" style=\"font-size: 14px; margin-top: 10px\">Enter Language</label>\n");
      out.write("			<input type=\"text\" id=\"lang\" name=\"lang\" placeholder=\"Programming Language (Max 20 characters)\" required maxlength=\"20\">\n");
      out.write("			\n");
      out.write("			<label for=\"topics\" style=\"font-size: 14px; margin-top: 10px\">Enter Topics</label>\n");
      out.write("			<input type=\"text\" id=\"topic\" name=\"topic\" placeholder=\"Topic Name (Max 20 characters)\" required maxlength=\"20\">\n");
      out.write("			\n");
      out.write("			<label for=\"difficulty\" style=\"font-size: 14px; margin-top: 10px\">Select a difficulty</label>\n");
      out.write("			<select id=\"difficulty\" name=\"difficultyLevel\" required style=\"height: 30px\"> \n");
      out.write("			    <option value=\"\" selected disabled hidden>None</option>\n");
      out.write("			    <option value=\"easy\">Easy</option>\n");
      out.write("			    <option value=\"medium\">Medium</option>\n");
      out.write("			    <option value=\"hard\">Hard</option>\n");
      out.write("			</select>\n");
      out.write("			            \n");
      out.write("            <button type=\"submit\" style=\"margin-top: 10px;\">Add Test</button>\n");
      out.write("        </form>\n");
      out.write("        ");
 
            String error = request.getParameter("error");
            String toprint = "";
            if(error != null){
                if(error.equals("invalid_passing_marks")) toprint = "Pass marks should be between 0 and "+ request.getParameter("ques");
                else if(error.equals("try_again")) toprint = "Error.";
                else if(error.equals("invalid_ques")) toprint = "Invalid number of questions";
        
      out.write("\n");
      out.write("        <p style=\"font-size:16px;\">");
      out.print( toprint );
      out.write(". Try again.</p>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <button class=\"dashboard-btn\" onclick=\"redirectToDashboard()\">Back to Dashboard</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function redirectToDashboard() {\n");
      out.write("            window.location.href = '/TakeTest/AdminDashboard';\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("           ");

        } else response.sendRedirect("/TakeTest/adminPages/adminLogin.jsp");
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
