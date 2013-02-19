<%@ tag description="Page layout" pageEncoding="UTF-8"%>
<%@ attribute name="body" fragment="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
      <sec:authorize access="not isAuthenticated()">
      <a href="${login}"><fmt:message key="login"/></a>
      </sec:authorize>
      <sec:authorize access="isAuthenticated()">
      <a href="${logout}"><fmt:message key="logout"/></a>
      </sec:authorize>
    </div>
    <c:if test="${!empty FLASH_MESSAGE}">
      <div class=flash><fmt:message key="${FLASH_MESSAGE}"/></div>
    </c:if>
    <jsp:invoke fragment="body"/>
  </div>
</html>