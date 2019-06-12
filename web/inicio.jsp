<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Página inicial - Eventmaker</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/shop-homepage.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/index">Início</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="${pageContext.request.contextPath}/index">Início
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/acesso/cadastro/cliente">Cadastrar Cliente</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/acesso/cadastro/administrador">Cadastrar Administrador</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Page Content -->
    <div class="container" style='margin-top:5%;'>

      <div class="row">
        <div class="col-lg-12">
            
          <div class="row">

            <div class="col-lg-6 col-md-6 mb-6">
              <div class="card h-100">
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${pageContext.request.contextPath}/acesso/login/cliente">Espaço do cliente</a>
                  </h4>
                  <p class="card-text">Realize o login como cliente e desfrute dos nossos eventos!</p>
                </div>
                <div class="card-footer">
                    <a href="${pageContext.request.contextPath}/acesso/login/cliente">Login</a>
                </div>
              </div>
            </div>

            <div class="col-lg-6 col-md-6 mb-6">
              <div class="card h-100">
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${pageContext.request.contextPath}/acesso/login/administrador">Espaço do administrador</a>
                  </h4>
                  <p class="card-text">Realize login como administrador, crie e gerencie seus eventos!</p>
                </div>
                <div class="card-footer">
                    <a href="${pageContext.request.contextPath}/acesso/login/administrador">Login</a>
                </div>
              </div>
            </div>

          </div>
          <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

      </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Bootstrap core JavaScript -->
    <script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
