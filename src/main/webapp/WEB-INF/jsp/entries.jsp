<%@page trimDirectiveWhitespaces="true"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<s:url var = "style" value='/static/style.css' />
<s:url var = "action" value='/add' />
<s:url var = "login" value='/login' />
<s:url var = "logout" value='/logout' />
<!doctype html>
<html>
  <title><fmt:message key="title"/></title>
  <link rel=stylesheet type=text/css href="${style}">
  <div class="page">
    <h1><fmt:message key="heading"/></h1>
    <div class="metanav">
      <a href="${login}">log in</a>
      <a href="${logout}">log out</a>
    </div>
    <form:form method="post" modelAttribute="entry" action="${action}" cssClass="add-entry">
      <dl>
        <dt>Title:
          <dd><form:input path="title"/>
        <dt>Text:
          <dd><form:textarea rows="5" cols="40" path="text"/>
        <dd><input type="submit" value="Share">
      </dl>
    </form:form>
    <ul class="entries">
    <c:forEach items="${entries}" var="entry">
      <li><h2><c:out value="${entry.title}"/></h2><c:out value="${entry.text}"/>
    </c:forEach>
    </ul>
  </div>
</html>