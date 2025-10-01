package main.java.org.example;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() { return raca; }

    @Override
    public String emitirSom() {
        return "Au au!";
    }

    @Override
    public String toString() {
        return super.toString() + " - Raça: " + raca;
    }
}
