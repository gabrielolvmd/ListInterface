package Exercicios.CarrinhoCompras;

public class Item {
  private String name;
  private double price;
  private int quantity;

  // constructor
  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return "Produto: " + name + ", preco=" + price + ", quantidade=" + quantity + "\n";
  }

}
