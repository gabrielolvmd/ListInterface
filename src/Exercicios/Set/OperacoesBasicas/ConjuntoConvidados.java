package Exercicios.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigo) {
    convidadosSet.add(new Convidado(nome, codigo));
  }

  public void removerConvidadoPorCodigo(int codigo) {
    Convidado convidadoParaRemover = null;
    for (Convidado c : convidadosSet) {
      if (c.getCodigo() == codigo)
        convidadoParaRemover = c;
      break;
    }
    convidadosSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadosSet.size();
  }

  public Set<Convidado> exibirConvidados() {
    return convidadosSet;
  }

  public static void main(String[] args) {
    ConjuntoConvidados convidados = new ConjuntoConvidados();

    convidados.adicionarConvidado("Gabriel", 1253);
    convidados.adicionarConvidado("Ana", 854);
    convidados.adicionarConvidado("Joao", 2056);
    convidados.adicionarConvidado("Pedro", 7569);
    convidados.adicionarConvidado("Maria", 7569);
    convidados.adicionarConvidado("Lucas", 2835);

    System.out.println(convidados.exibirConvidados());

  }
}
