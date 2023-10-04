package Exercicios.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> carrinho;

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    carrinho.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();

    for (Item i : carrinho) {
      if (i.getName().equals(nome)) {
        itensParaRemover.add(i);
      }
    }
    carrinho.removeAll(itensParaRemover);
  }

  public double calcularValorTotal() {
    double soma = 0;
    for (Item i : carrinho) {
      double valorTotalItem = i.getPrice() * i.getQuantity();
      soma += valorTotalItem;
    }
    return soma;
  }

  public void exibirItens() {
    System.out.println(carrinho);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Teclado", 58.99, 2);
    carrinho.adicionarItem("Mousepad", 23.99, 3);
    carrinho.adicionarItem("Monitor", 1200.00, 1);
    carrinho.adicionarItem("Memoria RAM", 198.99, 2);
    carrinho.exibirItens();

    carrinho.removerItem("Teclado");
    carrinho.exibirItens();
  }

}