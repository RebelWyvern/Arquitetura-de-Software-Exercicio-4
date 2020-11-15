package com.company;

import java.util.ArrayList;

public class Carrinho{
    private static Produto produto;
    private static Carrinho carrinho;
    private final ArrayList <CarrinhoInterface> observer;

 private Carrinho()
 {
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
     for(int i=0;i<observer.size();i++)
     {
         System.out.println(observer.get(i));
     }

 }

 private void notifyObserver(){
     for(CarrinhoInterface obs : observer){
            obs.update(produto);
     }
 }


}