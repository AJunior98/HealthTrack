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
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/common.css">
    <link rel="stylesheet" href="./css/adicionar-exercicio.css">

    <title>Adicionar Exercício // Health Track</title>
</head>

<body>
    <header>
        <nav class="navbar navbar-light navbar-custom fixed-top">
            <div class="container-fluid col-lg-6">

                <!-- BOTÃO VOLTAR -->
                <div class="botao-voltar">
                    <a href="./exercicios.jsp">
                        <span class="material-icons">arrow_back_ios_new</span>
                    </a>
                </div>
                <!-- BOTÃO VOLTAR -->

                <!-- TÍTULO DA PÁGINA -->
                <h1 class="titulo-navbar">Adicionar exercício</h1>
                <!-- TÍTULO DA PÁGINA -->

                <!-- INÍCIO MENU SANDUÍCHE -->
                <button class="navbar-toggler ms-auto" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <!-- FIM MENU SANDUÍCHE -->

                <!-- INÍCIO DA LISTA DO MENU -->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item ms-auto">
                            <a class="nav-link" href="./dashboard.jsp">Início<span class="material-icons">space_dashboard</span></a>
                        </li>

                        <li class="nav-item ms-auto">
                            <a class="nav-link" href="./peso.jsp">Peso<span class="material-icons">monitor_weight</span></a>
                        </li>

                        <li class="nav-item ms-auto">
                            <a class="nav-link active" aria-current="page" href="./exercicios.jsp">Exercícios<span class="material-icons">fitness_center</span></a>
                        </li>

                        <li class="nav-item ms-auto">
                                <a class="nav-link" href="#">Alimentação<span class="material-icons">restaurant</span></a>
                        </li>

                        <li class="nav-item ms-auto">
                            <a class="nav-link" href="#">Configurações<span class="material-icons">settings</span></a>
                        </li>

                        <li class="nav-item ms-auto">
                            <a class="nav-link" href="#">Meu Perfil<span class="material-icons">account_circle</span></a>
                        </li>
                    </ul>
                </div>
                <!-- FIM DA LISTA DO MENU -->
            </div>
        </nav>
    </header>
    
    <main>
        <!-- BOTÕES: MANUAL E IMPORTAR -->
        <div class="container-manual-importar col-lg-6 mx-auto">
            <button type="button" class="botoes-manual-importar ativo">manual</button>
            <button type="button" class="botoes-manual-importar">importar</button>
        </div>
        <!-- BOTÕES: MANUAL E IMPORTAR -->
        
        <div class="container container-inputs col-lg-6">
            <!-- FORMULÁRIO PARA EDIÇÃO DE INFORMAÇÕES -->
            <form>
                <!-- CAMPO MODALIDADE -->
                <div class="row mx-auto">
                    <label class="material-icons col-2" for="data">fitness_center</label>
                    <div class="container-descricao col-10">
                        <input value="" type="" placeholder="Modalidade">
                    </div>
                </div>
                <!-- CAMPO MODALIDADE -->
                
                <!-- CAMPO DATA -->
                <div class="row mx-auto">
                    <label class="material-icons col-2" for="data">date_range</label>
                    <div class="container-descricao col-10">
                        <input value="" type="" placeholder="Data">
                    </div>
                </div>
                <!-- CAMPO DATA -->
                
                <!-- CAMPO DURAÇÃO -->
                <div class="row mx-auto">
                    <label class="material-icons col-2" for="data">timer</label>
                    <div class="container-descricao col-10">
                        <input value="" type="" placeholder="Duração">
                    </div>
                </div>
                <!-- CAMPO DURAÇÃO -->
                
                <!-- CAMPO DISTÂNCIA -->
                <div class="row mx-auto">
                    <label class="material-icons col-2" for="data">route</label>
                    <div class="container-descricao col-10">
                        <input value="" type="" placeholder="Distância">
                    </div>
                </div>
                <!-- CAMPO DISTÂNCIA -->
                
                <!-- CAMPO CALORIAS -->
                <div class="row mx-auto">
                    <label class="material-icons col-2" for="data">local_fire_department</label>
                    <div class="container-descricao col-10">
                        <input value="" type="" placeholder="Calorias">
                    </div>
                </div>
                <!-- CAMPO CALORIAS -->
                
                <!-- CAMPO INTENSIDADE -->
                <div class="row mx-auto">
                    <label class="material-icons col-2" for="data">speed</label>
                    <div class="container-descricao col-10">
                        <input value="" type="" placeholder="Intensidade">
                    </div>
                </div>
                <!-- CAMPO INTENSIDADE -->
                
                <!-- CAMPO OBSERVAÇÕES -->
                <div class="row mx-auto">
                    <label class="material-icons col-2" for="data">notes</label>
                    <div class="container-descricao col-10">
                        <input value="" type="" placeholder="Observações">
                    </div>
                </div>
                <!-- CAMPO OBSERVAÇÕES -->
                
                <!-- BOTÃO SALVAR -->
                <div class="row container-botao-salvar">
                    <a class="col-6" href="./exercicios.jsp">
                        <button type="button" class="botao-salvar">SALVAR</button>
                    </a>
                </div>
                <!-- BOTÃO SALVAR -->
            </form>
            <!-- FORMULÁRIO PARA EDIÇÃO DE INFORMAÇÕES -->

        </div>
    </main>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
    </script>

</body>

</html>