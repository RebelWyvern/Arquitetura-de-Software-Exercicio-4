package com.company;

public class Produto implements CarrinhoInterface{
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void update(Produto produto) {
        setNome(nome);

        setPreco(preco);

    }
}
