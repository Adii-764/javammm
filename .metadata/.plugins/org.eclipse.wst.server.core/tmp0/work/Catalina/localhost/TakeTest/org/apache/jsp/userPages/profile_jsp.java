/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-09-25 13:39:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.userPages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.*;
import java.lang.*;
import dao.Result;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(7);
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.lang");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("dao.Result");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title> User Profile </title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    /* General styling */\n");
      out.write("    body {\n");
      out.write("      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("      background-color: #f0f0f0;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      min-height: 100vh;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container {\n");
      out.write("      max-width: 1100px;\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 20px;\n");
      out.write("      background-color: #fff;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);\n");
      out.write("      display: grid;\n");
      out.write("      grid-template-columns: 1fr 2fr;\n");
      out.write("      gap: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* User details styling */\n");
      out.write("    .user-details {\n");
      out.write("      background-color: #dbd8e3;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      padding: 20px;\n");
      out.write("      color: #333;\n");
      out.write("      box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);\n");
      out.write("      height: 170px; \n");
      out.write("      overflow-y: auto; \n");
      out.write("      font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .user-details h2 {\n");
      out.write("      margin-top: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Table styling */\n");
      out.write("    table {\n");
      out.write("      width: 100%;\n");
      out.write("      border-collapse: collapse;\n");
      out.write("      box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);\n");
      out.write("      background-color: #fff;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      max-height: 400px; \n");
      out.write("      overflow-y: auto; \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    th, td {\n");
      out.write("      padding: 12px;\n");
      out.write("      text-align: left;\n");
      out.write("      border-bottom: 1px solid #ddd;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    th {\n");
      out.write("      background-color:  #dbd8e3;\n");
      out.write("      color: #333;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Button styling */\n");
      out.write("    .button-container {\n");
      out.write("      text-align: right;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button {\n");
      out.write("      background-color: #333;\n");
      out.write("      color: #fff;\n");
      out.write("      padding: 10px 20px;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      cursor: pointer;\n");
      out.write("      transition: background-color 0.3s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button:hover {\n");
      out.write("      background-color: #555;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Responsive styling */\n");
      out.write("    @media (max-width: 768px) {\n");
      out.write("      .container {\n");
      out.write("        grid-template-columns: 1fr;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write(".header-buttons {\n");
      out.write("	margin-top: 5px;	\n");
      out.write("	display: flex;\n");
      out.write("	align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-buttons a {\n");
      out.write("	text-decoration: none;\n");
      out.write("	padding: 5px 10px;\n");
      out.write("	margin-left: 10px;\n");
      out.write("	border-radius: 5px;	\n");
      out.write("	background-color: #333;\n");
      out.write("    color: #fff;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: background-color 0.3s ease;\n");
      out.write("      \n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-buttons a:hover {\n");
      out.write("	color: #fff;\n");
      out.write("	border: 1px solid #f5b700;\n");
      out.write("     background-color: #555;\n");
      out.write("}\n");
      out.write("   \n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	");

	HttpSession session2 = request.getSession(false);
	if (session2 != null && session2.getAttribute("user_id") != null) {
		int user_id = (int) session2.getAttribute("user_id");
		String name = (String) session2.getAttribute("name");
		ArrayList<Result> arr = (ArrayList<Result>) request.getAttribute("resultarr");
		String phone = (String)request.getAttribute("phone");
		String email = (String)request.getAttribute("email");
	
      out.write("		\n");
      out.write("	\n");
      out.write("	<div class=\"container\">\n");
      out.write("    <!-- User details -->\n");
      out.write("    <div class=\"user-details\">\n");
      out.write("      <h2>Welcome, ");
      out.print( name );
      out.write("</h2>\n");
      out.write("      <p>Phone Number: ");
      out.print( phone );
      out.write("</p>\n");
      out.write("      <p>Email: ");
      out.print( email );
      out.write("</p>\n");
      out.write("      <!-- Button container -->\n");
      out.write("      <div class=\"button-container\">        \n");
      out.write("        <div class=\"header-buttons\">\n");
      out.write("			<a href=\"/TakeTest/UserDashboard\"> Dashboard</a> \n");
      out.write("			<a href=\"./Logout\" onclick=\"return confirmLogout();\">Logout</a>\n");
      out.write("		</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");

   	 	if(arr.size() != 0){
    
      out.write("\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th>Test Name</th>\n");
      out.write("          <th>Max Marks</th>\n");
      out.write("          <th>Scored Marks</th>\n");
      out.write("          <th>Percentage</th>\n");
      out.write("          <th>Pass/Fail</th>\n");
      out.write("          <th>Date</th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      \n");
      out.write("      <tbody>\n");
      out.write("        ");
 for (Result result : arr) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( result.getTestTag() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( result.getMaxMarks() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( result.getScore() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( (result.getScore()*100) / result.getMaxMarks() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( result.getStatus() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( result.getDate() );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    	");

	} else {
	
      out.write("\n");
      out.write("\n");
      out.write("	<p id = \"displaymsg\">No tests given.</p>\n");
      out.write("\n");
      out.write("	");

	}
	
      out.write("\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("	\n");
      out.write("	  \n");
      out.write("  <script>\n");
      out.write("  function confirmLogout(){\n");
      out.write("  	return confirm(\"Do you want to log out?\");\n");
      out.write("  }\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");

	} else{
	response.sendRedirect("/TakeTest/userPages/userLogin.jsp");
	}
	
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
