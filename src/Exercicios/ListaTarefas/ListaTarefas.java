package Exercicios.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
  private List<Tarefa> tarefaList;

  // construtor
  public ListaTarefas() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
      if (t.getDescricao().equals(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.adicionarTarefa("Tarefa 1");
    listaTarefas.adicionarTarefa("Tarefa 2");
    listaTarefas.adicionarTarefa("Tarefa 2");
    listaTarefas.adicionarTarefa("Tarefa 3");

    listaTarefas.removerTarefa("Tarefa 1");

    System.out.println("o numero total de tarefas é " + listaTarefas.obterNumeroTotalTarefas());

    listaTarefas.obterDescricoesTarefas();
  }
}
