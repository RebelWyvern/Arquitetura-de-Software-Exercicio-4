package com.company;

public class Main {

    public static void main(String[] args) {
        Produto produto=new Produto("presunto",2.50);
        Carrinho carrinho=Carrinho.getInstance();
        
        Fachada.preencheCarrinho(carrinho);
        Fachada.mostraCarrinho(carrinho);

        System.out.println("demonstracao do singleton funcionando: ");
        Carrinho carrinho2=Carrinho.getInstance();//agora nao sera permitido criar um segundo carrinho

        Fachada.mostraCarrinho(carrinho2);
        Fachada.metodoPagamento(carrinho2);
    }
}
