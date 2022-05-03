package exercicio.heranca.escola;

import java.util.Date;

public class escolaMain {
    public static void main(String[] args) {
        aluno aluno = new aluno("Jose", "12344678999", new Date());
        System.out.println(aluno.nome);
        System.out.println(aluno.cpf);
        System.out.println(aluno.data_nascimento.toString());
        System.out.println("========================");

        System.out.println("Valor copias alunos: "+aluno.tirarCopia(3));
        professor professor = new professor("Thiago", "111.111.111-11", new Date());
        System.out.println("Valor copias professor: "+professor.tirarCopia(3));

    }
}
