package com.company;

public class Main {

    public static void main(String[] args) {
	Carrinho carrinho=Carrinho.getInstance();

    carrinho.adicionarNoCarrinho("aaa");
        carrinho.adicionarNoCarrinho("bbbb");
        carrinho.adicionarNoCarrinho("xxx");
    carrinho.mostrarLista();

        System.out.println("demonstracao do singleton funcionando: ");
        Carrinho carrinho2=Carrinho.getInstance();//agora nao sera permitido criar um segundo carrinho

        carrinho2.mostrarLista();
    }
}
