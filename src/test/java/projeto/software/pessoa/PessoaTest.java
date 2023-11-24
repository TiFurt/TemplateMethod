package projeto.software.pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void getInfoPessoaFisica() {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "12345678910");
        assertEquals("Pessoa Física{, nome='João', resultado=CPF: 12345678910}", pessoaFisica.getInfo());
    }

    @Test
    void getInfoPessoaJuridica() {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("João", "12345678910");
        assertEquals("Pessoa Jurídica{, nome='João', resultado=CNPJ: 12345678910}", pessoaJuridica.getInfo());
    }
}