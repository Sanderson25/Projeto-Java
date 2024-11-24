package models;

public class professor extends usuario {
    private String siape;

    public professor(String nome, String cpf, String dataNascimento, String email, String siape) {
        super(nome, cpf, dataNascimento, email);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Professor: " + getNome() + " | SIAPE: " + siape);
    }
}
