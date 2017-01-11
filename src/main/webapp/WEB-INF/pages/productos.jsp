<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"></jsp:include>
<div class="col-md-12">
<h3 class="text-center">Saludos <s:property value="#session.user"/></h3>
</div>

<s:iterator value="prod">
	<div class="col-md-4">
		<s:property value="nombre"/>
	</div>
</s:iterator>

<s:iterator value="prodSlide">
<div class="jumbotron">
<div class="col-md-4">
		<img alt="" src="img/<s:property value="imagen" />"><br>	
		<s:property value="id"/><br>
		<s:property value="nombre"/><br>
		<s:property value="precio"/><br>
		<s:property value="peso"/><br>
		<s:property value="descripcion"/>
		</div>
	</div>
</s:iterator>

<jsp:include page="footer.jsp"/>