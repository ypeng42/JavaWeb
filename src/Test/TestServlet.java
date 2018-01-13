package Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * using urlPatterns is a shortcut for specifying the same thing in web.xml
 *
 * There are 2 ways to deploy web app: exploded and archive.
 * If choose exploded, put all the files under CATALINA_HOME/webapps/ROOT (WEB-INF and jsp go under it)
 * To start Tomcat, run  CATALINA_HOME/bin/startup.bat, pay attention to port conflict(update in server.xml)
 *
 *
 * How Intellij runs Tomcat:
 * First, it changes the CATALINA_BASE
 *
 * Then it changes the deploy folder, and defined in here:
 * C:\Users\yqpen\.IntelliJIdea2017.3\system\tomcat\Tomcat_8_5_11_javaWeb\conf\Catalina\localhost\ROOT.xml
 * StackOverflow question: https://stackoverflow.com/questions/661166/how-to-deploy-external-webapp-in-tomcat
 *
 * So if you go to Tomcat's webapps directory, there won't be anything.
 *
 * What you want to deploy (called artifact) is defined in Project structure and Edit configuration
 */
@WebServlet(name = "TestServlet", urlPatterns = "/a/b")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.write("123345345");
        out.flush();
    }
}
