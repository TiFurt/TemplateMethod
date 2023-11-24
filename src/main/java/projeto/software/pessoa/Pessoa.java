package projeto.software.pessoa;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract String informacaoFiscal();

    public String getTipo() {
        return "Pessoa";
    }
    public String getInfo() {
        return getTipo() + "{" +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.informacaoFiscal() +
                '}';
    }
}
