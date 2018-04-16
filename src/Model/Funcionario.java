package Model;


public class Funcionario extends Pessoa{
       
    private String matricula;
    private String tipoFuncionario;

    public Funcionario(String matricula, String tipoFuncionario, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.tipoFuncionario = tipoFuncionario;
    }

    public Funcionario() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }    
    
}
