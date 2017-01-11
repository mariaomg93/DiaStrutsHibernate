<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"></jsp:include>
<div class="col-md-12">
	<h3 class="text-center">Saludos <s:property value="#session.user"/></h3>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-6">
			<a href="productos">Productos</a>
		</div>		
		<div class="col-md-6">
			<a href="pedidos">Pedidos</a>			
		</div>
	</div>
</div>
<jsp:include page="footer.jsp"/>

