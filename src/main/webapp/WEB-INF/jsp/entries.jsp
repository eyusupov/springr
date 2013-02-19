<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <s:url var = "action" value='/add' />
    <form:form method="post" modelAttribute="entry" action="${action}">
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
  </body>
</html>