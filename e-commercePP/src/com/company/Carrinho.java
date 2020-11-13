package com.company;

import java.util.ArrayList;

public class Carrinho {

    private static Carrinho carrinho;
    private static ArrayList <String> lista;//fazer uma lista do tipo Produto depois


 private Carrinho()
 {
     lista=new ArrayList<String>();

 }



 public void adicionarNoCarrinho(String coisa){
     lista.add(coisa);

 }

 public static Carrinho getInstance()
 {
     if(carrinho==null)
     {carrinho=new Carrinho(); }

     return carrinho;
 }

 public void mostrarLista(){
     for(int i=0;i<lista.size();i++)
     {
         System.out.println(lista.get(i));
     }

 }


}