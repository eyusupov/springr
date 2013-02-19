<%@ include file="/WEB-INF/jsp/include.jsp" %>
<s:url var = "action" value='/add'/>
<t:layout>
    <jsp:attribute name="body">
    <sec:authorize access="isAuthenticated()">
    <form:form method="post" modelAttribute="entry" action="${action}" cssClass="add-entry">
      <dl>
        <dt>Title:
          <dd><form:input path="title"/>
        <dt>Text:
          <dd><form:textarea rows="5" cols="40" path="text"/>
        <dd><input type="submit" value="Share">
      </dl>
    </form:form>
    </sec:authorize>
    <ul class="entries">
    <c:choose>
      <c:when test="${empty entries}">
      <li><em><fmt:message key="noentries"/></em>
      </c:when>
      <c:otherwise>
        <c:forEach items="${entries}" var="entry">
      <li><h2><c:out value="${entry.title}"/></h2><c:out value="${entry.text}"/>
        </c:forEach>
      </c:otherwise>
    </c:choose>
    </ul>
    </jsp:attribute>
</t:layout>