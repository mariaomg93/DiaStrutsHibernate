<div class="col-md-6"></div>
	Registro
	
<form action="register" method="post">
<label>Nombre</label><input type="text" name="user.nombre"data-validation="length" data-validation-length="5-30" data-validation-optional="true"><br>
<label>Usuario</label><input type="text" name="user.user"><br>
<label>Email</label><input type="mail" data-validation="email"><br>
<label>Password</label><input type="password" name="user.password"><br>
<input type="submit" value="Registrar Usuario">
</form>