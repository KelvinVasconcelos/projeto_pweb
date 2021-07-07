package com.projetoweb.valorant_projeto_web;

import java.util.List;

public class AgentesResponse {
    private int status;
    private List<AgentesModel> data;
    
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public List<AgentesModel> getData() {
        return data;
    }
    public void setData(List<AgentesModel> data) {
        this.data = data;
    }
}
