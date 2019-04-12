<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<script type="text/javascript">

	function agregarItem(){
	    var table = document.getElementById("itemsTable");
	    var registroBase = document.getElementById("registroBase");
	    var clone = registroBase.cloneNode(true);

		var cloneInputs = clone.getElementsByTagName("input");

		for(var i=0; i<cloneInputs.length; i++){
			cloneInputs[i].value='';
		}
	    
	  	table.appendChild(clone);
	}

</script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Venta</title>
</head>
<body>

<div class="container" style="text-align: left;">
	<p style="color:#A4A4A4;">Bienvenido: <%= request.getSession().getAttribute("nombreEmpleado") %></p>
	<a href="/ServletExample/CerrarSesionServlet">Cerrar Sesión</a>
</div>

<form action="registrarVentaServlet">

	<table id="itemsTable">
		<tr>
        	<td colspan="4" align="right"><button type="button" onclick="agregarItem(this.parentNode);">Agregar Item</button></td>
        </tr>
		<tr>
                <td align="center">Tipo</td>
                <td align="center">Descripcion</td>
                <td align="center">Cantidad</td>
                <td align="center">Precio</td>
        </tr>
        
        <tr id="registroBase">
	        <td>
	            <select name="tipoItem">
	                <option value=""></option>
	                <option value="Servicio">Servicio</option>
	                <option value="Producto">Producto</option>
	            </select>
	        </td>
	        <td> <input name="descripcion"/></td>
	        <td> <input name="cantidad"/></td>
	        <td> <input name="precio"/></td>
        </tr>
	</table>
	<input type="submit" value="Registrar Venta">
</form>

</body>
</html>