package com.company;

public class Pagamento {
 

    public Pagamento criaPagamento(int opcao) {
        System.out.println("Forma de pagamento Escolhida");
        if(opcao == 1){//cartao
            System.out.println("Cartao-----------");
            return new Cartao();
        }else if(opcao == 2)//boleto
        {
            System.out.println("Boleto-----------");
            return new Boleto();
        }else if(opcao == 3){//paypal
            System.out.println("PayPal-----------");
            return new PayPal();
        }
        return null;
    }

}