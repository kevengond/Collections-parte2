import java.util.*;


public class ImprimindoAlunosSemAcentos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
//        alunos.add("Pedro");
        alunos.add("Nico");


//        System.out.println(alunos.size());
        for(String aluno: alunos) {
            System.out.println(aluno);
        }
        boolean adicionou = alunos.add("Pedro");
        alunos.add("Pedro");
        System.out.println(alunos.size());

        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
    }
}
