<%@ include file="/WEB-INF/jsp/include.jsp" %>
<t:layout>
    <jsp:attribute name="body">
    <h2>Login</h2>
<%--    {% if error %}<p class=error><strong>Error:</strong> {{ error }}{% endif %}--%>
    <form action="{{ url_for('login') }}" method=post>
      <dl>
        <dt>Username:
        <dd><input type=text name=username>
        <dt>Password:
        <dd><input type=password name=password>
        <dd><input type=submit value=Login>
      </dl>
    </form>        
    </jsp:attribute>
</t:layout>