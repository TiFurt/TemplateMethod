package projeto.software.pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String informacaoFiscal() {
        return "CNPJ: " + this.cnpj;
    }

    @Override
    public String getTipo() {
        return "Pessoa Jurídica";
    }
}
