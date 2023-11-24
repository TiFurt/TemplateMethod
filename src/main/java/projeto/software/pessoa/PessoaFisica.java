package projeto.software.pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String informacaoFiscal() {
        return "CPF: " + this.cpf;
    }

    @Override
    public String getTipo() {
        return "Pessoa Física";
    }

}
