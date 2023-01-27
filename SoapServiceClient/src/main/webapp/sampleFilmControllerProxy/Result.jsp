<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleFilmControllerProxyid" scope="session" class="controllers.FilmControllerProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleFilmControllerProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleFilmControllerProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleFilmControllerProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        controllers.FilmController getFilmController10mtemp = sampleFilmControllerProxyid.getFilmController();
if(getFilmController10mtemp == null){
%>
<%=getFilmController10mtemp %>
<%
}else{
        if(getFilmController10mtemp!= null){
        String tempreturnp11 = getFilmController10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id16");
        int id_1idTemp  = Integer.parseInt(id_1id);
        String title_2id=  request.getParameter("title18");
            java.lang.String title_2idTemp = null;
        if(!title_2id.equals("")){
         title_2idTemp  = title_2id;
        }
        String year_3id=  request.getParameter("year20");
        int year_3idTemp  = Integer.parseInt(year_3id);
        String director_4id=  request.getParameter("director22");
            java.lang.String director_4idTemp = null;
        if(!director_4id.equals("")){
         director_4idTemp  = director_4id;
        }
        String stars_5id=  request.getParameter("stars24");
            java.lang.String stars_5idTemp = null;
        if(!stars_5id.equals("")){
         stars_5idTemp  = stars_5id;
        }
        String review_6id=  request.getParameter("review26");
            java.lang.String review_6idTemp = null;
        if(!review_6id.equals("")){
         review_6idTemp  = review_6id;
        }
        java.lang.String updateMovie13mtemp = sampleFilmControllerProxyid.updateMovie(id_1idTemp,title_2idTemp,year_3idTemp,director_4idTemp,stars_5idTemp,review_6idTemp);
if(updateMovie13mtemp == null){
%>
<%=updateMovie13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateMovie13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 28:
        gotMethod = true;
        String id_7id=  request.getParameter("id31");
        int id_7idTemp  = Integer.parseInt(id_7id);
        java.lang.String deleteMovie28mtemp = sampleFilmControllerProxyid.deleteMovie(id_7idTemp);
if(deleteMovie28mtemp == null){
%>
<%=deleteMovie28mtemp %>
<%
}else{
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteMovie28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
}
break;
case 33:
        gotMethod = true;
        String format_8id=  request.getParameter("format36");
            java.lang.String format_8idTemp = null;
        if(!format_8id.equals("")){
         format_8idTemp  = format_8id;
        }
        java.lang.String getAllFilmData33mtemp = sampleFilmControllerProxyid.getAllFilmData(format_8idTemp);
if(getAllFilmData33mtemp == null){
%>
<%=getAllFilmData33mtemp %>
<%
}else{
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getAllFilmData33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
}
break;
case 38:
        gotMethod = true;
        String format_9id=  request.getParameter("format41");
            java.lang.String format_9idTemp = null;
        if(!format_9id.equals("")){
         format_9idTemp  = format_9id;
        }
        String searchBy_10id=  request.getParameter("searchBy43");
            java.lang.String searchBy_10idTemp = null;
        if(!searchBy_10id.equals("")){
         searchBy_10idTemp  = searchBy_10id;
        }
        String input_11id=  request.getParameter("input45");
            java.lang.String input_11idTemp = null;
        if(!input_11id.equals("")){
         input_11idTemp  = input_11id;
        }
        java.lang.String searchFilmByInput38mtemp = sampleFilmControllerProxyid.searchFilmByInput(format_9idTemp,searchBy_10idTemp,input_11idTemp);
if(searchFilmByInput38mtemp == null){
%>
<%=searchFilmByInput38mtemp %>
<%
}else{
        String tempResultreturnp39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(searchFilmByInput38mtemp));
        %>
        <%= tempResultreturnp39 %>
        <%
}
break;
case 47:
        gotMethod = true;
        String title_12id=  request.getParameter("title50");
            java.lang.String title_12idTemp = null;
        if(!title_12id.equals("")){
         title_12idTemp  = title_12id;
        }
        String year_13id=  request.getParameter("year52");
        int year_13idTemp  = Integer.parseInt(year_13id);
        String director_14id=  request.getParameter("director54");
            java.lang.String director_14idTemp = null;
        if(!director_14id.equals("")){
         director_14idTemp  = director_14id;
        }
        String stars_15id=  request.getParameter("stars56");
            java.lang.String stars_15idTemp = null;
        if(!stars_15id.equals("")){
         stars_15idTemp  = stars_15id;
        }
        String review_16id=  request.getParameter("review58");
            java.lang.String review_16idTemp = null;
        if(!review_16id.equals("")){
         review_16idTemp  = review_16id;
        }
        java.lang.String insertAMovie47mtemp = sampleFilmControllerProxyid.insertAMovie(title_12idTemp,year_13idTemp,director_14idTemp,stars_15idTemp,review_16idTemp);
if(insertAMovie47mtemp == null){
%>
<%=insertAMovie47mtemp %>
<%
}else{
        String tempResultreturnp48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertAMovie47mtemp));
        %>
        <%= tempResultreturnp48 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>