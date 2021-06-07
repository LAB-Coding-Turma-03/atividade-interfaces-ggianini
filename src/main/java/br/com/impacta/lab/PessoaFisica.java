package br.com.impacta.lab;


public class PessoaFisica implements Pessoa{

    
    
    public PessoaFisica(String documento, String tipo) {
    this.documento = documento;
    this.tipo = tipo;
    }

    private String documento;
    private String tipo;

    @Override
    public String falarDocumento() {
        return documento;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    
}
