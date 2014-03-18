<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core">
  <h:head>
  	<title>Hello :: Spring Application</title>
  </h:head>
  <h:body>
    <h1>Hello - Spring Application</h1>
    <p>Greetings, it is now <c:out value='${now}'/></p>
  </h:body>
</html>