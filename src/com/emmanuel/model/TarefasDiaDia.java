package com.emmanuel.model;
// Representa uma tarefa diária com ID, descrição, data limite e status
public class TarefasDiaDia {

    private int id; //Identificador único da tarefa
    private String descricao; //Descrição da tarefa
    private String dataLimite; //Data limite para concluir a tarefa
    private Status status; //Status atual da tarefa (ABERTA ou CONCLUIDA)

    public TarefasDiaDia(int id, String descricao, String dataLimite, Status status) {
        this.id = id;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.status = status;
    }

    public TarefasDiaDia() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getDataLimite() {return dataLimite;}
    public void setDataLimite(String dataLimite) {this.dataLimite = dataLimite;}

    public Status getStatus() {return status;}
    public void setStatus(Status status) {this.status = status;}

    @Override
    public String toString() {
        return "Id: " + id +
                "| Descrição: " + descricao +
                "| Data Limite: " + dataLimite +
                "| Status: " + status;
    }

}
