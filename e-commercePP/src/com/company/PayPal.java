package com.company;

public class PayPal implements PagamentosemCartaoInterface{
    private String email;
    private String senha;

    public PayPal (){
        this.email = "meuemail@nuvem.com";
        this.senha = "SenhaSecreta";
    }

    @Override public void exibirInfo() {
        System.out.println("Email: "+ this.email+" Senha: "+this.senha);
    }
}