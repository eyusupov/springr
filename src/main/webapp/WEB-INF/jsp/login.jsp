<%@ include file="/WEB-INF/jsp/include.jsp" %>
<s:url var = "security_check" value='/j_spring_security_check'/>
<t:layout>
    <jsp:attribute name="body">
    <h2>Login</h2>
    <c:if test="${not empty param.login_error}">
        <p class=error><strong>Error:</strong><c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
    </c:if>
    <form action="${security_check}" method=post>
      <dl>
        <dt>Username:
        <dd><input type=text name=j_username>
        <dt>Password:
        <dd><input type=password name=j_password>
        <dd><input type=submit value=Login>
      </dl>
    </form>        
    </jsp:attribute>
</t:layout>