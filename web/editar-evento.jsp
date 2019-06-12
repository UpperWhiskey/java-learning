<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>EventMaker - Editar evento ${evento.nome}</title>

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
              <a class="nav-link" href="${pageContext.request.contextPath}/acesso/logout">Logout</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>


    <!-- Page Content -->
    <div class="container">

      <div class="row">

        <h1 class="my-4">EventMaker - Editar evento ${evento.nome}</h1>

        <div class="col-lg-12">

        <button type="button" class="btn btn-success col-lg-3 col-md-3 mb-4" onclick="window.location='${pageContext.request.contextPath}/evento/criar'">Criar um evento</button>
        
            <div class="container col-md-12 col-lg-12 col-sm-12 login-form">
              <form class="form-horizontal" role="form" method="POST" action="${pageContext.request.contextPath}/evento/editar">
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <h2>Evento - ${evento.nome}</h2>
                            <hr>
                        </div>
                    </div>
                    <div class="row" style="display: none;">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="form-group has-danger">
                                <label class="sr-only" for="id">Id</label>
                                <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                                    <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-at"></i></div>
                                    <input type="text" name="id" class="form-control" id="id"
                                           placeholder="id" required autofocus value="${evento.id}">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="form-group has-danger">
                                <label for="data">Data (dd-MM-yyyy)</label>
                                <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                                    <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-at"></i></div>
                                    <input type="date" name="data" class="form-control" id="data"
                                           placeholder="Data" required autofocus value="${evento.data}">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="nome">Nome</label>
                                <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                                    <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-key"></i></div>
                                    <input type="text" name="nome" class="form-control" id="nome"
                                           placeholder="Nome" required value="${evento.nome}">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row" style="padding-top: 1rem">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <button type="submit" class="btn btn-success"><i class="fa fa-sign-in"></i> Salvar</button>
                        </div>
                    </div>
                </form>
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
