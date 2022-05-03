package exercicio.heranca.escola;

import java.util.Date;

public class pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;

    public pessoa(String nome, String cpf, Date data){
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data;
    }

    public double tirarCopia(int qntd){
        return 0.10 * (double) qntd;
    }
}
