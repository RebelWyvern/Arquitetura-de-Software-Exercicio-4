package com.company;

import java.util.ArrayList;

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



}