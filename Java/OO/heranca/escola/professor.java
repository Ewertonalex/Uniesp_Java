package exercicio.heranca.escola;

import java.util.Date;

public class professor extends pessoa{

    public professor (String nome, String cpf, Date datanascimento) {
        super(nome, cpf, datanascimento);
    }

    public double salario;
    public String disciplina;

}
