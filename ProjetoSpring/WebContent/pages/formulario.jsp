<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" commandName="produto" action="cadastrar.htm">

	Nome do produto: <br/>
	<form:input path="nome"/>
	<br/><br/>
	
	Preço: <br/>
	<form:input path="preco"/>
	<br/><br/>
	
	<input type="submit" value="Cadastrasr Produto"/>
	
	<h3> ${mensagem} </h3>

</form:form>

<table border="1" width="50%">

	<tr>
		<th>Código</th>
		<th>Nome do Produto</th>
		<th>Preço</th>
	</tr>
	
	<c:forEach items="$(dados)" var="p">
	
		<tr>
			<td>${p.idproduto}</td>
			<td>${p.nome}</td>
			<td>${preco}</td>
		</tr>
		
	</c:forEach>

</table>