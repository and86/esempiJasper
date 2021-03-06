<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Busta Paga</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">


</head>

<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10" align="center">
				<img
						src="logo.jpg" class="img-rounded" alt="Logo" style="width: 10%" align="right">
				<h1>
					Busta Paga <br> <small>Buste Paga Dipendenti</small><br> 
				</h1>
			</div>

			<div class="col-md-12"></div>
		</div>

		<div class="row">
			<div class="col-md-10">

				<ol class="breadcrumb">
					<li><a href="#">Home</a></li>
					<li><a href="#">Busta Paga</a></li>

				</ol>
			</div>

			<div class="row">
				<div class="col-md-10">


					<div class="row">
						<form class="form-horizontal" id="bustaPaga"
							action="doBustaPaga.jsp" method="post">
							
							<div class="form-group">
								<label for="inputName" class="col-sm-2 control-label">Nome</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="name"
										name="name" placeholder="Nome" style="width: 200px;" required>
								</div>
							</div>

							<div class="form-group">
								<label for="inputSurname" class="col-sm-2 control-label">Cognome</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="surname"
										name="surname" placeholder="Cognome" style="width: 200px;" required>
								</div>
							</div>

							<div class="form-group">
								<label for="Date" class="col-sm-2 control-label">Data di
									emissione</label>
								<div class="col-sm-10">
									<input type="text" id="dataEm" name="dataEmissione"
										class="form-control" placeholder="Emission Date"
										style="width: 200px;" required>
								</div>
							</div>

							<div class="form-group">
								<label for="imp" class="col-sm-2 control-label">Importo</label>
								<input type="number" id="imp" name="importo"
									class="form-control" placeholder="Importo"
									style="width: 200px;" required>
							</div>


							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-primary btn-lg">
										<span class="glyphicon glyphicon-eur" aria-hidden="true"></span>Registra
									</button>
								</div>
							</div>


						</form>
					</div>
				</div>

			</div>
		</div>
		</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<script type="text/javascript" src="BustePaga.js"></script>
</html>