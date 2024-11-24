package models;

public class estudante extends usuario {
    private String matricula;
    private String turmaAno;

    public estudante(String nome, String cpf, String dataNascimento, String email, String matricula, String turmaAno) {
        super(nome, cpf, dataNascimento, email);
        this.matricula = matricula;
        this.turmaAno = turmaAno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurmaAno() {
        return turmaAno;
    }

    public void setTurmaAno(String turmaAno) {
        this.turmaAno = turmaAno;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Estudante: " + getNome() + " | Matrícula: " + matricula + " | Turma/Ano: " + turmaAno);
    }
}
