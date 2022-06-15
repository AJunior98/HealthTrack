<!doctype html>
<html lang="pt-br">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Google Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@0,300;0,400;0,700;1,300;1,400;1,700&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap"
	rel="stylesheet">
<!-- Google Icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/common.css">
<link rel="stylesheet" href="./css/dashboard.css">

<title>Dashboard // Health Track</title>
</head>

<body>
	<header>
		<div class="container-fluid col-lg-6">
			<!-- TÃTULO DA PÃGINA -->
			<h1 class="titulo-navbar">Dashboard</h1>
			<!-- TÃTULO DA PÃGINA -->
		</div>
	</header>

	<main>
		<div class="container col-xl-6 mx-auto">

			<!-- CARDS -->
			<div class="container-cards">
				<div class="row mx-auto">

					<!-- INÃCIO CARD 1 -->
					<div class="card col-xl-5">
						<div class="card-header">Meta semanal</div>
						<div class="card-body">
							<div class="progress">
								<div class="progress-bar" role="progressbar" style="width: 35%;"
									aria-valuenow="35" aria-valuemin="0" aria-valuemax="100">35%</div>
							</div>
							<p class="card-text">Você já atingiu 35% da sua meta
								semanal de exercicios.</p>
						</div>
					</div>
					<!-- FIM CARD 1 -->

					<!-- INÃCIO CARD 2 -->
					<div class="card col-xl-5">
						<div class="card-header">Modalidade da semana</div>
						<div class="card-body">
							<div class="card-title">
								<span class="material-icons">timer</span>
								<h2>00:59:40</h2>
							</div>
							<p class="card-text">Até agora a modalidade mais praticada
								da semana foi corrida.</p>
						</div>
					</div>
					<!-- FIM CARD 2 -->

					<!-- INÃCIO CARD 3 -->
					<div class="card col-xl-5">
						<div class="card-header">Meta de peso</div>
						<div class="card-body">
							<div class="card-title">
								<span class="material-icons">monitor_weight</span>
								<h2>2,8kg</h2>
							</div>
							<p class="card-text">Você está a 2,8kg de atingir sua meta
								de peso.</p>
						</div>
					</div>
					<!-- FIM CARD 3 -->

					<!-- INÃCIO CARD 4 -->
					<div class="card col-xl-5">
						<div class="card-header">Ingestão calorica</div>
						<div class="card-body">
							<div class="progress">
								<div class="progress-bar" role="progressbar" style="width: 47%;"
									aria-valuenow="47" aria-valuemin="0" aria-valuemax="100">47%</div>
							</div>
							<p class="card-text">Você ingeriu 47% do valor energetico
								semanal. A previsão é que você ultrapasse o planejado!</p>
						</div>
					</div>
					<!-- FIM CARD 4 -->

				</div>
			</div>

			<!-- CONTAINER HISTÃ“RICO DE PESO -->
			<div class="container-grafico">
				<h3>Historico de peso</h3>
				<div class="container">
					<img src="./imagens/graf.png" alt="GrÃ¡fico">
				</div>
			</div>
			<!-- CONTAINER HISTÃ“RICO DE PESO -->

			<!-- CONTAINER DICA DO DIA -->
			<div class="container-dica">
				<h3>Dica do dia</h3>
				<p>A pratica de atividades fisicas de forma regular aumenta os
					niveis de serotonina e tem vinculo direto na melhora do humor.</p>
			</div>
			<!-- CONTAINER DICA DO DIA -->

		</div>
	</main>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
		
	</script>

</body>

</html>