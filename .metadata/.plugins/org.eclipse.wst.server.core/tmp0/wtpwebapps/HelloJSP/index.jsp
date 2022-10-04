<%@page import="model.PontoTuristico"%>
<%@page import="java.util.ArrayList" %>
<%@page import="view.RoteiroPontoTuristico" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>.: Pontos Tur�sticos :. </title>
    </head>
    <body>
        <% 
        RoteiroPontoTuristico roteiro =
                            new RoteiroPontoTuristico(); 
        ArrayList<PontoTuristico> lista = roteiro.getLista();
        %>
        <h1> Gulliver Traveller - Pontos Tur�sticos </h1>
        <hr>
        
        <% for (PontoTuristico r: lista){  %>
        <h3>  <%=r.getNome() %> </h3>
        <p>  Nome:<%=r.getNome() %> </p>
        <p>  Endere�o:<%=r.getEndereco() %> </p>
        <p>  Idioma:<%=r.getIdioma() %> </p>
        <p>  Funcionamento:<%=r.getFuncionamento() %> </p>
        <p>  Documentos:<%=r.getDocumentos() %> </p>
        <p>  Voltagem:<%=r.getVoltagem() %> </p>
        <p>  Moeda:<%=r.getMoeda() %> </p>
        <p>  Fuso Horario:<%=r.getFusoHorario() %> </p>
        <br>
        <% } %>
    </body>
</html>