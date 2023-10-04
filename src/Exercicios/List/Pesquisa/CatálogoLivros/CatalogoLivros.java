package Exercicios.List.Pesquisa.CatálogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> livrosList;

  public CatalogoLivros() {
    this.livrosList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livrosList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livrosList.isEmpty()) {
      for (Livro l : livrosList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livrosList.isEmpty()) {
      for (Livro l : livrosList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
    }
    return livrosPorIntervaloAnos;
  }

  public List<Livro> pesquisarPorTitulo(String titulo) {
    List<Livro> livrosPorTitulo = new ArrayList<>();
    if (!livrosList.isEmpty()) {
      for (Livro l : livrosList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livrosPorTitulo.add(l);
          break;
        }
      }
    }
    return livrosPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros();

    catalogo.adicionarLivro("A revolução dos bichos", "George Orwell", 1998);
    catalogo.adicionarLivro("Dom casmurro", "Machado de Assis", 1986);
    catalogo.adicionarLivro("Cristianismo puro e simples", "CS Lewis", 2006);
    catalogo.adicionarLivro("O príncipe", "Nicolau Maquiavel", 1968);
    catalogo.adicionarLivro("1984", "George Orwell", 1926);

    // System.out.println(catalogo.pesquisarPorAutor("George Orwell"));
    // System.out.println(catalogo.pesquisarPorTitulo("Dom casmurro"));
    System.out.println(catalogo.pesquisaPorIntervaloAnos(1960, 2000));
  }
}
