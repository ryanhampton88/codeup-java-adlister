<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% session = request.getSession(); %>

<c:if test='<%= session.getAttribute("user") != null %>'>
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <a class="navbar-brand" href="/ads">Adlister</a>
      </div>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/logout">Sign out</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
   <!-- /.container-fluid -->
  </nav>
</c:if>


<c:if test='<%= session.getAttribute("user") == null %>'>
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <a class="navbar-brand" href="/ads">Adlister</a>
      </div>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/login">Login</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
    <!-- /.container-fluid -->
  </nav>
</c:if>



