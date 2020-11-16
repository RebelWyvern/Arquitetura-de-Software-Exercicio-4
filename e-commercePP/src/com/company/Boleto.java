package com.company;

public class Boleto extends Pagamento implements PagamentosemCartaoInterface{
    private String nomeBeneficiario;
    private String nomePagador;
    private int data;
    public Boleto (){
        this.nomeBeneficiario = "Seu Jorge Construções";
        this.nomePagador = "Marianinha de Jesus";
        this.data = 1313;
    }

    @Override public void exibirInfo() {
        System.out.println("Nome Beneficiário: "+ this.nomeBeneficiario+" Nome Pagador: "+this.nomePagador+" Data de Validade: "+this.data);
    }
}