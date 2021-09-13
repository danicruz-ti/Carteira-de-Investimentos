<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Transacoes</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

</head>
<body class="container">
	<form action="<C:url value="/transacoes"/>" method="post">
		
		<div class="form-group">
			<label for="ticker">Ticker</label>
			<input id="ticker" class="form-control" name="ticker">
		</div>
	
	<div class="form-group">
			<label for="data">Data</label>
			<input id="data" class="form-control" name="data">
		</div>

	<div class="form-group">
			<label for="preco">Preco</label>
			<input id="preco" class="form-control" name="preco">
		</div>

	<div class="form-group">
			<label for="quantidade">Quantidade</label>
			<input id="quantidade" class="form-control" name="quantidade">
		</div>

	<div class="form-group">
			<label for="tipo">Tipo</label>
			<input id="tipo" class="form-control" name="tipo">
		</div>

	<input type="submit" value="Gravar" class="mt-2 btn-primary">

	</form>
	
	<h1 class="text-center">Lista de Transacoes</h1> 
	<table class="table table-hover table-striped table-bordered">
		<thead>
			<tr>
				<th>TICKER</th>
				<th>DATA</th>
				<th>PRECO</th>
				<th>QUANTIDADE</th>
				<th>TIPO</th>
			</tr>
		</thead>
		<tbody>
			<C:forEach items="${transacoes}" var="t"> 
				<tr>
					<td>${t.ticker}</td>
					<td>${t.data}</td>
					<td>${t.preco}</td>
					<td>${t.quantidade}</td>
					<td>${t.tipo}</td>
				</tr>
			</C:forEach>
		</tbody>
	</table>
</body>
</html>