/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-31 23:00:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Landing page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/HeaderAndFooter.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/landing.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main class=\"main-container\">\n");
      out.write("        <div class=\"logo-container\">\n");
      out.write("            <img src=\"assets/img/Logo.png\" alt=\"Logo\" class=\"logo\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h1>Welcome to IoTBay</h1>\n");
      out.write("        <div>\n");
      out.write("            <a href=\"./views/login.jsp\">\n");
      out.write("                <button class=\"button button-login\">Login</button>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"./views/register.jsp\">\n");
      out.write("                <button class=\"button button-register\">Register</button>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </main>  \n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <hr>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h6 id=\"dif\">IoTBay</h6><br>\n");
      out.write("                <span>The most complete range of IoT devices to upgrade your life at the touch of a button.</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h6>Links</h6>\n");
      out.write("                <a href=\"\"><span>Home</span></a>\n");
      out.write("                <a href=\"\"><span>Shop</span></a>\n");
      out.write("                <a href=\"\"><span>Order</span></a>\n");
      out.write("                <a href=\"\"><span>Category</span></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h6>Contact Us</h6>\n");
      out.write("                <span>Address: 123 IotBay, Sydney</span>\n");
      out.write("                <span>Phone Number: +61 0499999999</span>\n");
      out.write("                <span>Email Address: IotBay@example.com</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h6>Follow Us</h6>\n");
      out.write("                <a href=\"https://www.instagram.com/\">\n");
      out.write("                    <i class=\"fa-brands fa-instagram fa-lg\"></i>\n");
      out.write("                    <span>Instagram</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"https://www.facebook.com/\">\n");
      out.write("                    <i class=\"fa-brands fa-facebook fa-lg\"></i>\n");
      out.write("                    <span>Facebook</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"https://discord.com/\">\n");
      out.write("                    <i class=\"fa-brands fa-discord fa-lg\"></i>\n");
      out.write("                    <span>Discord</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"https://x.com/?lang=en\">\n");
      out.write("                    <i class=\"fa-brands fa-x-twitter fa-lg\"></i>\n");
      out.write("                    <span>Twitter</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <p>©2025. IoTBay Group 4 All Right Reserved</p>\n");
      out.write("    </div>\n");
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
