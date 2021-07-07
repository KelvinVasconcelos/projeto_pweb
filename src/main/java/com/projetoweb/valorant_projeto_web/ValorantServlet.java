package com.projetoweb.valorant_projeto_web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@WebServlet("/valorant/api/agents")
public class ValorantServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OkHttpClient client = new OkHttpClient();

        Request.Builder requestBuilder = new Request.Builder().url("https://valorant-api.com/v1/agents?language=pt-BR");
        Request request = requestBuilder.build();
        try (Response response = client.newCall(request).execute()){
            resp.addHeader("Content-type", "application/json; charset=utf-8");
            resp.setContentType("text/html; charset=utf-8");

            Gson gson = new Gson();
            AgentesResponse agentes = gson.fromJson(response.body().string(), AgentesResponse.class);
            
            resp.getWriter().println("<h1>"+ (agentes.getData().get(2).getDisplayName()) +"</h1>");
            resp.getWriter().println("<img src="+ (agentes.getData().get(2).getDisplayIcon()) +" width='100' height='100'>");
            resp.getWriter().println("<p>"+ (agentes.getData().get(2).getDescription()) +"</p>");
        }
    }
}
