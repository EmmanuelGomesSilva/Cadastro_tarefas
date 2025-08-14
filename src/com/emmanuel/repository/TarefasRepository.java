
package com.emmanuel.repository;
import com.emmanuel.model.TarefasDiaDia;
import java.util.ArrayList;
import java.util.List;

//Responsável por gerenciar a persistência de tarefas
//Usando lista para memória, mas futuramente pode ser um banco de dados.
public class TarefasRepository {

    private List<TarefasDiaDia> tarefas = new ArrayList<>();

    //Adiciona uma nova tarefa à lista
    public void adicionar(TarefasDiaDia tarefa){
        tarefas.add(tarefa);
    }

    //Retorna todas as tarefas cadastradas
    public List<TarefasDiaDia> listar(){
        return tarefas;
    }

    //Remove uma tarefa pelo ID
    public boolean removerPorId (int id){
        return tarefas.removeIf(t -> t.getId() == id);
    }
}
