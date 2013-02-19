/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.springr.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.support.SessionFlashMapManager;

/**
 *
 * @author eyusupov
 */
public class AuthSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse rsp, Authentication a) throws IOException, ServletException {
        SessionFlashMapManager sessionFlashMapManager = new SessionFlashMapManager();
        FlashMap fm = new FlashMap();
        fm.put("FLASH_MESSAGE", "logged_in");
        sessionFlashMapManager.saveOutputFlashMap(fm, req, rsp);
        rsp.sendRedirect(req.getContextPath() + "/");
    }
}
