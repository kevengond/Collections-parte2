import java.util.*;
public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);
        javaColecoes.getAulas().add(new Aula("conhecendo mais sobre o java", 50));
        System.out.println(aulas);

    }
}