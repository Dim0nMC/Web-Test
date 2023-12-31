<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <style>
    <%@include file="../css/header.css"%>
    <%@include file="../css/index.css"%>
  </style>

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.2.1/dist/css/bootstrap.min.css"
        integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">
  <link rel="stylesheet" href="../web/css/header.css">
  <link rel="stylesheet" href="../web/css/index.css">
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #bdd9ed">

  <div class="logo">


  </div>
  <div class="header">
    <div class="project_name">Психологический тест</div>
    <div class="authors">by web outsiders</div>
  </div>
  <div></div>
</nav>
<div class="container">
  <h3>ИНФО</h3>
  <div class="description">
    <p>
      Вам предоставляется пройти тестирование,
      по результатам которого для Вас автоматически будет построено
      предположение о наиболее подходящей Вам
      роли в IT проекте. Тестирование базируется
      на <a href="https://ru.wikipedia.org/wiki/%D0%A2%D0%B8%D0%BF%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D1%8F_%D0%9C%D0%B0%D0%B9%D0%B5%D1%80%D1%81_%E2%80%94_%D0%91%D1%80%D0%B8%D0%B3%D0%B3%D1%81"
            target="_blank" data-toggle="tooltip" title="MBTI — система психологического тестирования,
                                                                созданная на основе типологии личночти Майерс — Бриггс,
                                                                которая, в стою очередь, базируется на типологии Юнга,
                                                                созданной в 1940-х.">
      <b>тесте MBTI</b></a> и
      <a href="https://ru.wikipedia.org/wiki/%D0%A6%D0%B2%D0%B5%D1%82%D0%BE%D0%B2%D0%BE%D0%B9_%D1%82%D0%B5%D1%81%D1%82_%D0%9B%D1%8E%D1%88%D0%B5%D1%80%D0%B0"
         target="_blank" data-toggle="tooltip" title="Тест Люшера предполагает, что выбор цвета отражает нередко
                                                                направленность испытуемого на определенную деятельность, настроение,
                                                                функциональное состояние и наиболее устойчивые черты личности.">
        <b>тесте Люшера</b></a>. Анализ Ваших ответов на вопросы
      из этих тестов даст возможность предположить о Вашей
      предрасположенности к одной из ролей: тимлид, разработчик, тестировщик и т.д.

    </p>
    <p>
      Для участия в тесте заполните форму с указанием идентификатора группы. И нажмите на кнопку "Пройти тест".
      <br>
      Чтобы узнать результаты теста <b>после прохождения</b> нажмите "Посмотреть результаты".
    </p>
    <p>
      Будьте сами собой и отвечайте честно. Это поможет получить наиболее правдивый результат.
    </p>
  </div>


  <!-- В action="" подсавить путь к файлу обработчику -->
  <form method="post">
    <h6>Укажите идентификатор группы</h6>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <button type="submit"  class="btn btn-outline-primary">Подтвердить</button>
      </div>
      <input type="text" class="form-control" placeholder="" aria-label="" aria-describedby="basic-addon1" name ="group">
    </div>
  </form>

  <div class="migration">
    <form action="add.html" target="_blank" method="get">

      <button onclick="location.href='/add'" class="btn btn-outline-primary">Пройти тест</button>
      <!-- <button type="button" class="btn btn-outline-primary" disabled>Посмотреть результаты</button> -->
    </form>

    <form action="list.html" target="_blank" method="get">
      <button onclick="location.href='/list'" class="btn btn-outline-primary">Посмотреть результаты</button>
      <!-- <button type="button" class="btn btn-outline-primary" disabled>Посмотреть результаты</button> -->
    </form>
  </div>

  </form>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script>
  $(document).ready (function(){
    $('[data-toggle="tooltip"]').tooltip ();
  });
</script>


</body>

</html>