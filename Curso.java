import java.util.*;
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }



    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    //    public int getTempoTotal(){
//        int tempoTotal = 0;
//        for(Aula aula : aulas){
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
//    }
    public int getTempoTotal() {
        int tempoTotal = 0;

        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso:" + this.getNome() + ",tempo total:" + this.getTempoTotal() + ", aulas: [" + this.aulas + "] ]";
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);

    }

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;

        return this.nome.equals(outroAluno.nome);

    }

    public int hashcode() {
        return this.nome.hashCode();
    }
}