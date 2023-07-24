import java.util.HashSet;
import java.util.Set;



public class Aluno {
    String nome;
    int numerodeMatricula;
    private Set<Aluno> alunos = new HashSet<>();

    public Aluno(String nome, int numerodeMatricula){
        if(nome==null){
            throw new NullPointerException("nome nao pode ser nulo");
        }
        this.nome = nome;
        this.numerodeMatricula = numerodeMatricula;
    }
    public String getNome() {
        return nome;
    }

    public int getNumerodeMatricula() {
        return numerodeMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numerodeMatricula=" + numerodeMatricula +
                '}';
    }
}
