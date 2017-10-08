package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LocationRegistration1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel='stylesheet'  href='Images/locationregistration.css' type='text/css'> \n");
      out.write("    <center><p> Select your table right from your desk !!!<br><br>\n");
      out.write("            We would be glad to reserve a table for you at our restaurant! </p></center>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("    <table width='600' border='2'>\n");
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <th scope='row'><font size='8' color='white'>Number of Guests</font></th>\n");
      out.write("                <td><input name='NUMBER' type='number' id='number' max='10' min='0'></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><font size='8' color='white'>Special Requests</font></td>\n");
      out.write("                <td><input type='text' name='SPEREQ' id='specialrequests' ></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><font size='4' color='white'>Select Date</font></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <input type='date' name='date' id='date'></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><font size='4' color='white'>Selected Time</td>\n");
      out.write("                <td><input type='time' name='time' id='time'>                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th scope='row'><font size='4' color='white'>Table Location</font></th>\n");
      out.write("                <td>\n");
      out.write("\n");
      out.write("                    <select \n");
      out.write("                        onChange='if (this.selectedIndex != 0)\n");
      out.write("                                            self.location = this.options[this.selectedIndex].value'>\n");
      out.write("                        <option value='' selected>Select a Event Space\n");
      out.write("                        <option value='coffee.html'>Coffee Area\n");
      out.write("                        <option value='conf.html'>Conference Area\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
