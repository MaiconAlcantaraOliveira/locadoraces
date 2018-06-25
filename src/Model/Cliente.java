
package Model;

import Command.LocacaoPagamentoCommand;
import Command.PagamentoCommand;


public class Cliente extends Pessoa{
    
   private String cnh;
   private Integer idade;
   private Integer pontosCarteira;

    public Cliente(String cnh, Integer idade, Integer pontosCarteira, String nome, String cpf) {
        super(nome, cpf);
        this.cnh = cnh;
        this.idade = idade;
        this.pontosCarteira = pontosCarteira;
    }
    
    

    public Cliente(String cnh, Integer idade, Integer pontosCarteira) {
        this.cnh = cnh;
        this.idade = idade;
        this.pontosCarteira = pontosCarteira;
    }

    public Cliente() {
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Integer getIdade() {
        return idade;
    }
    
    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public Integer getPontosCarteira() {
        return pontosCarteira;
    }

    public void setPontosCarteira(Integer pontosCarteira) {
        this.pontosCarteira = pontosCarteira;
    }
    
    public Boolean hasClienteIdadeMinima() {
        return this.getIdade() >= 21;
    }
    
    public Boolean hasPermissaoParaDirigir() {
        return this.pontosCarteira < 25;
    } 
    
    
    /*
    //Command
    public void executarCompra(double valor, PagamentoCommand formaDePagamento) {
	Compra compra = new Compra(this);
	compra.setValor(valor);
	formaDePagamento.processarCompra(compra);
    }*/
    
    
    //Command
//    public void executarLocacao(double precoBase, Carro carro, LocacaoPagamentoCommand formaDePagamento){
//        Locacao loca = new Locacao();
//        loca.setCarro(carro);
//        loca.setPrecoBase(precoBase);
//        loca.setCliente(this);
//        loca.determinarEstrategiaDeCalculo();
//        formaDePagamento.processarLocacao(loca);
//    }

    public Locacao executarLocacao(double precoBase, Carro carro, LocacaoPagamentoCommand formaDePagamento){
        Locacao loca = new Locacao("");
        loca.setCarro(carro);
        loca.setPrecoBase(precoBase);
        loca.setCliente(this);
        loca.determinarEstrategiaDeCalculo();
        formaDePagamento.processarLocacao(loca);
        return loca;
    }

    @Override
    public String toString() {
        return "\n" + "Cliente{" +
                "cnh='" + cnh + '\'' +
                ", idade=" + idade +
                ", pontosCarteira=" + pontosCarteira + "" +
                '}';
    }
}
