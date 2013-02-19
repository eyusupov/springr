<%@ tag description="Page layout" pageEncoding="UTF-8"%>
<%@ attribute name="body" fragment="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<s:url var = "style" value='/static/style.css' />
<s:url var = "login" value='/login' />
<s:url var = "logout" value='/logout' />
<!doctype html>
<html>
  <title><fmt:message key="title"/></title>
  <link rel=stylesheet type=text/css href="${style}">
  <div class="page">
    <h1><fmt:message key="heading"/></h1>
    <div class="metanav">
      <a href="${login}"><fmt:message key="login"/></a>
      <a href="${logout}"><fmt:message key="logout"/></a>
    </div>
    <%-- TODO: flash message
      http://stackoverflow.com/questions/2704099/status-messages-on-the-spring-mvc-based-site-annotation-controller
      {% for message in get_flashed_messages() %}
        <div class=flash>{{ message }}</div>
      {% endfor %}
    --%>
    <jsp:invoke fragment="body"/>
  </div>
</html>