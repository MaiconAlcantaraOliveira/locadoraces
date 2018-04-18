
package Model;


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
    

}
