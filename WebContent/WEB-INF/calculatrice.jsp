<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="styleCSS.jsp"%>

<meta charset="UTF-8">
<title>Calculatrice</title>
</head>

<body>
	<div class="jumbotron">
		<h1>Ma calculatrice JEE</h1>
	</div>
	<div class="panel panel-success">
		<div class="panel-heading">
			<h3 class="panel-title">Quelle opération souhaitez vous réaliser
				?</h3>
		</div>

		<div class="panel-body">

			<div class="container">
				<form method="post">
					<div class="form-row">
						<div class="col-sm-4">
							<input type="number" class="form-control" name="nombre1"
								placeholder="Nombre 1">
						</div>
						<div class="col-sm-1">

							<div class="form-check">
								<input class="form-check-input" type="radio" name="operation"
									id="add" value="add" checked> <label
									class="form-check-label" for="add"> + </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="operation"
									id="sous" value="sous"> <label class="form-check-label"
									for="sous"> - </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="operation"
									id="multi" value="multi"> <label
									class="form-check-label" for="multi"> X </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="operation"
									id="divi" value="divi"> <label class="form-check-label"
									for="divi"> / </label>
							</div>
						</div>
						<div class="col-sm-4">
							<input type="number" class="form-control" name="nombre2"
								placeholder="Nombre 2">
						</div>


						<div class="col-sm-2">
							<input type="submit" value="Envoyer" />
						</div>
					</div>

				</form>
			</div>
			<div class="row">
				<div class="col-sm-offset-4 col-sm-4">
					<p>${ message }</p>
					<h2></h2>



				</div>
			</div>
		</div>
	</div>


</body>
</html>