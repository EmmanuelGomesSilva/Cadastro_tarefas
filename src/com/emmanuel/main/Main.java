package com.emmanuel.main;

import com.emmanuel.model.Status;
import com.emmanuel.model.TarefasDiaDia;
import com.emmanuel.service.TarefasService;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        TarefasService tarefasService = new TarefasService();

        int opcao;

        do {
            System.out.println("\n=== Controle de Tarefas ===");
            System.out.println("1 - Cadastrar Tarefa.");
            System.out.println("2 - Listar Tarefas.");
            System.out.println("3 - Marcar como concluída.");
            System.out.println("4 - Remover Tarefa pelo ID.");
            System.out.println("5 - Buscar Tarefa.");
            System.out.println("0 - Sair.");
            System.out.println(">>>");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    //Cadastro de tarefa
                    System.out.println("ID :");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Descrição :");
                    String descricao = scanner.nextLine();

                    System.out.println("Data limite: ");
                    String dataLimite = scanner.nextLine();

                    Status status;
                    while (true) {
                        try {
                            System.out.println("Status (ABERTA ou CONCLUÍDA):");
                            String statusStr = scanner.nextLine().toUpperCase().replace("Í", "I");
                            status = Status.valueOf(statusStr);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Status inválido! Digite ABERTA ou CONCLUIDA.");
                        }
                    }

                    boolean cadastrado = tarefasService.cadastrarTarefa(id, descricao, dataLimite, status);
                    if (cadastrado) {
                        System.out.println("Tarefa cadastrada com sucesso!");
                    } else {
                        System.out.println("Erro: já existe uma tarefa com esse ID!");
                    }
                }
                case 2 -> {
                    //Listagem de tarefas
                    List<TarefasDiaDia> tarefas = tarefasService.listarTarefas();
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas cadastradas.");
                    } else {
                        System.out.println("=== Lista de Tarefas ===");
                        for (TarefasDiaDia t : tarefas) {
                            System.out.println(t);
                        }
                    }
                }
                case 3 -> {
                    //Marcar tarefd como concluída
                    System.out.println("Digite o ID da tarefa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Tem certeza que deseja marcar esta tarefa como concluída? (S/N): ");
                    String confirmacao = scanner.nextLine().trim().toUpperCase();

                    if (confirmacao.equals("S")) {
                        if (tarefasService.marcarTarefaComoConcluida(id)) {
                            System.out.println("Tarefa marcada como concluída!");
                        } else {
                            System.out.println("Nenhuma tarefa encontrada com esse ID");
                        }
                    } else {
                        System.out.println("Operação cancelada.");
                    }
                }
                case 4 -> {
                    // Remover tarefa
                    System.out.println("Digite o ID da tarefa a remover: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if (tarefasService.removerPorId(id)) {
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Nenhuma tarefa encontrada com esse ID.");
                    }
                }
                case 5 -> {
                    //Buscar tarefa por palavra-chave
                    System.out.println("Digite uma palavra-chave: ");
                    String palavraChave = scanner.nextLine();
                    List<TarefasDiaDia> resultados = tarefasService.buscarPalavraChave(palavraChave);
                    if (resultados.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada com essa palavra-chave.");
                    } else {
                        System.out.println("=== Resultados da Busca ===");
                        for (TarefasDiaDia t : resultados) {
                            System.out.println(t);
                        }
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();


    }
}

