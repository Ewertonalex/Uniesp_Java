package exercicio.heranca.escola;

import java.util.Date;

public class aluno extends pessoa{

    public aluno(String nome, String cpf, Date datanascimento) {
        super(nome, cpf, datanascimento);
    }
    public String matricula;

    public double tirarCopia(int qntd) {
        return 0.07 * (double) qntd;
    }
}
