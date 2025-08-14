
package com.emmanuel.service;

import com.emmanuel.model.Status;
import com.emmanuel.model.TarefasDiaDia;
import com.emmanuel.repository.TarefasRepository;

import java.util.List;

//Service responsável pela lógica das tarefas
public class TarefasService {
    private TarefasRepository repository = new TarefasRepository();

    //Cadastra uma nova tarefa. Retorna false se o ID já existir.
    public boolean cadastrarTarefa(int id, String descricao, String dataLimite, Status status) {
        if (idExiste(id)){
            return false;
        }
        TarefasDiaDia tarefa = new TarefasDiaDia(id, descricao, dataLimite, status);
        repository.adicionar(tarefa);
        return true;
    }

    //Retorna todas as tarefas
    public List<TarefasDiaDia> listarTarefas() {
        return repository.listar();
    }


    //Marca a tarefa como concluída pelo ID
    public boolean marcarTarefaComoConcluida(int id) {
        for (TarefasDiaDia t : repository.listar()) {
            if (t.getId() == id) {
                t.setStatus(Status.CONCLUIDA);
                return true;
            }

        }
        return false;
    }


    //Remove a tarefa pelo ID
    public boolean removerPorId(int id) {
        return  repository.removerPorId(id);
    }

    //Busca tarefas que contenham a palavra-chave na descrição
    public List<TarefasDiaDia> buscarPalavraChave(String palavraChave) {
        List<TarefasDiaDia> tarefas = repository.listar(); // pega todas as tarefas
        return tarefas.stream() // converte a lista "tarefas" em um stream
                .filter(t -> t.getDescricao().toLowerCase().contains(palavraChave.toLowerCase()))
                .toList();

    }

    //Verifica se já existe uma tarefa com o mesmo ID
    private boolean idExiste(int id){
        return repository.listar().stream().anyMatch(t -> t.getId() == id);
    }


}
