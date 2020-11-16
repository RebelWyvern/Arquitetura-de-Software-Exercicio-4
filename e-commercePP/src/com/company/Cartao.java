package com.company;

public class Cartao implements CartaoInterface{
    private int numero;
    private String nome;
    private int data;
    private int tipo;
    public Cartao (){
        this.numero = 1233;
        this.nome = "Dolinho da Silva";
        this.data = 1212;
        this.tipo = 1
    }

    @Override public void exibirInfo() {
        System.out.println("Numero: "+ this.numero+" Nome: "+this.nome+" Data de Validade: "+this.data+Tipo());
    }

    @Override public String Tipo(){
        if(this.tipo == 1){
            return "  -->CREDITO";
        }else{
            return "  -->DEBITO";
        }
    }
}