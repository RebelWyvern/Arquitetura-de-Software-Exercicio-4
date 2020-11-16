package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho{
    private static Produto produto;
    private static Carrinho carrinho;
    private final ArrayList <CarrinhoInterface> observer;

 private Carrinho()
 {
     this.produto=produto;
     observer=new ArrayList<CarrinhoInterface>();
 }



 public void adicionarNoCarrinho(CarrinhoInterface obs){
     observer.add(obs);

 }

 public static Carrinho getInstance()
 {
     if(carrinho==null)
     {carrinho=new Carrinho(); }

     return carrinho;
 }

 public void mostrarLista(){
    for(CarrinhoInterface obs : observer){
        System.out.println(obs);
    }
 }

 private void notifyObserver(){
     for(CarrinhoInterface obs : observer){
            obs.update(produto);
     }
 }

private void metodoPagamento(){
    Pagamento pag = new Pagamento();

    println("Escolha a forma de pagamento:");
    println("1-Cartao , 2-Boleto , 3-PayPal");
    Scanner teclado = new Scanner(System.in);
    pag.criaPagamento(teclado);
}

}