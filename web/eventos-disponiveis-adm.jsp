<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>EventMaker - Eventos</title>

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

        <h1 class="my-4">EventMaker - Eventos</h1>

        <div class="col-lg-12">

        <button type="button" class="btn btn-success col-lg-3 col-md-3 mb-4" onclick="window.location='${pageContext.request.contextPath}/evento/criar'">Criar um evento</button>
        
          <div class="row">
              <c:choose>
                <c:when test="${!eventos.isEmpty()}">
                    <c:forEach items="${eventos}" var="evento">
                      <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                          <div class="card-body">
                            <h4 class="card-title">
                              <a href="#">${evento.nome}</a>
                            </h4>
                            <h5></h5>
                            <p class="card-text">Data: ${evento.data}</p>
                            <a href="${pageContext.request.contextPath}/evento/editar?id=${evento.id}">Editar evento ${evento.nome}</a>
                          </div>
                        </div>
                      </div>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <div class="jumbotron col-lg-12 col-md-12 mb-12">
                        Não há eventos disponíveis
                    </div>
                </c:otherwise>
              </c:choose>

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
