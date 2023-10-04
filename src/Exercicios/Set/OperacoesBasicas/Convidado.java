package Exercicios.Set.OperacoesBasicas;

public class Convidado {
  private String nome;
  private int codigo;

  public Convidado(String nome, int codigo) {
    this.nome = nome;
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Convidado other = (Convidado) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Convidado [" +
        "nome=" + nome +
        ",codigo=" + codigo + "] \n";
  }

}
