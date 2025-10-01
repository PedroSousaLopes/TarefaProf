package main.java.org.example;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public String emitirSom() {
        return "Som genérico de animal";
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}
