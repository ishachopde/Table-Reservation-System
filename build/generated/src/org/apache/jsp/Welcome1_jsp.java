package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <title>Table Reservation System</title>\n");
      out.write("\n");
      out.write("        <link href=\"Images/styles.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"Container\">\n");
      out.write("            <div id=\"Header\">\n");
      out.write("                <h1 id=\"heading\">Table Reservations Made Easy\n");
      out.write("                    <br><font size=\"6\" style=\"text-align: center;font-style: italic;\">\n");
      out.write("                    redefining fabulous times</font></h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div id=\"images\">\n");
      out.write("                <img src=\"Images/h1.jpg\" alt=\"\" hspace=\"20\" style=\"align:left; width:460px; height:260px;\" />\n");
      out.write("\n");
      out.write("                <img src=\"Images/h2.jpg\" alt=\"\" hspace=\"20\" style=\"align:center;width:460px; height:260px;\" />\n");
      out.write("\n");
      out.write("                <img src=\"Images/h3.jpg\" alt=\"\" hspace=\"20\" style=\"align:right;width:460px; height:260px;\"/>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"MainBody\">\n");
      out.write("\n");
      out.write("                <h1><font size=\"5\" color=\"brown\" style=\"font-family: sans-serif;text-align: center;\" > \n");
      out.write("                    Discover over a million restaurants across United States, Australia, United Kingdom, Canada,India, Turkey, UAE,<br> Qatar, Portugal, South Africa, New Zealand, and all of the Globe & \" RESERVE YOUR TABLE \"<br><br><br>\n");
      out.write("                    Find the best restaurants, cafés, and bars around you !\n");
      out.write("                    </font></h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                    <a href=\"restaurant1.html\" style=\"text-decoration: none;\">Hotel Ramada: Suites and Town Inns \n");
      out.write("                     \n");
      out.write("                        <img src=\"Images/hotel.jpg\" width=\"auto\" height=\"350\">\n");
      out.write("                    \n");
      out.write("                    </a><br><br><br>\n");
      out.write("                    <a href=\"restaurant.html\" style=\"text-decoration: none;\">David Chu's Chinese Bistro</a><br><br><br>\n");
      out.write("                    <a href=\"restaurant.html\" style=\"text-decoration: none;\">Marriott Townsville </a><br><br><br>\n");
      out.write("                    <a href=\"restaurant.html\" style=\"text-decoration: none;\">Tandoor Cuisine</a><br><br><br>\n");
      out.write("                    <a href=\"restaurant.html\" style=\"text-decoration: none;\">Mezbaan Biryani House</a><br><br><br>\n");
      out.write("                    <a href=\"restaurant.html\" style=\"text-decoration: none;\">Treats: IceBergs and Fire Grills</a><br><br><br>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"images1\">\n");
      out.write("                    <h6> <img src=\"Images/specials.jpg\"><font size=\"9\" style=\"text-align: italic;color: black;\">Save the dates !!!!!  Join the Fun......</font> </h6>\n");
      out.write("                    <img src=\"Images/e1.jpg\" alt=\"\" hspace=\"20\" style=\"align:left; width:460px; height:260px;\" />\n");
      out.write("\n");
      out.write("                    <img src=\"Images/e2.jpg\" alt=\"\" hspace=\"10\" style=\"align:center;width:360px; height:260px;\" />\n");
      out.write("\n");
      out.write("                    <img src=\"Images/e3.jpg\" alt=\"\" hspace=\"20\" style=\"align:right;width:360px; height:260px;\"/>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"Footer\">\n");
      out.write("                <font size=\"8\" style=\"font-family: sans-serif;color: white;\">\n");
      out.write("                C@ Table Reservations Copyrights reserved\n");
      out.write("                </font>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
