/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.spring_test;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author eyusupov
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String now = (new Date()).toString();
        return new ModelAndView("test", "now", now);
    }
}
