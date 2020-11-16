package com.company;

import java.net.PortUnreachableException;

public class Main {

    public static void main(String[] args) {
        Produto produto=new Produto("presunto",2.50);
	Carrinho carrinho=Carrinho.getInstance();

	carrinho.adicionarNoCarrinho(new Produto("presunto",2.50));
	carrinho.adicionarNoCarrinho(new Produto("costela",4.00));
    carrinho.mostrarLista();

        System.out.println("demonstracao do singleton funcionando: ");
        Carrinho carrinho2=Carrinho.getInstance();//agora nao sera permitido criar um segundo carrinho

        carrinho2.mostrarLista();



    }
}
