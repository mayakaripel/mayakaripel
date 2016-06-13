<%-- saved under tomcat/webapps/maya --%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body>
<strong>MovieList:</strong>
<br><br>
<table>
	<c:forEach var="movie" items="${movieList}" varStatus="movieLoopCount">
	<tr>
		<td>:${movieLoopCount.count} ${movie} <br><br></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
		
