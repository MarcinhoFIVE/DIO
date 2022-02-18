package main.model;

import java.util.Scanner;

import java.util.Objects;

public class Gato {
    Scanner leia = new Scanner(System.in);
    
    private String nome;
    private String cor;
    private Integer idade;
    
    public Gato() {
        
    }  
    /**
     *
     * @param nome
     * @param cor
     * @param idade
     */
    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getIdade() {
        return idade;
    }
    
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(cor, idade, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gato other = (Gato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
    }
    
    
}
