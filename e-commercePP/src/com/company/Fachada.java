package com.company;

public class Fachada{
    public static void preencheCarrinho(Carrinho carrinho){
        carrinho.adicionarNoCarrinho(new Produto("presunto",2.50));
        carrinho.adicionarNoCarrinho(new Produto("costela",4.00));
    }

    public static void mostraCarrinho(Carrinho carrinho){
        carrinho.mostrarLista();
    }

    public static void metodoPagamento(Carrinho carrinho){
        carrinho.metodoPagamento();
    }

}