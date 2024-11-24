import models.estudante;
import models.professor;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<estudante> estudantes = new ArrayList<>();
        ArrayList<professor> professores = new ArrayList<>();

        
        for (int i = 0; i < 2; i++) {
            System.out.println("=== Cadastro de Estudante ===");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            System.out.print("Turma/Ano: ");
            String turmaAno = scanner.nextLine();

            estudante estudante = new estudante(nome, cpf, dataNascimento, email, matricula, turmaAno);
            estudantes.add(estudante);
        }

        
        for (int i = 0; i < 2; i++) {
            System.out.println("=== Cadastro de Professor ===");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("SIAPE: ");
            String siape = scanner.nextLine();

            professor professor = new professor(nome, cpf, dataNascimento, email, siape);
            professores.add(professor);
        }

        
        System.out.println("\n=== Estudantes Cadastrados ===");
        for (estudante e : estudantes) {
            e.imprimirInformacoes();
        }

        System.out.println("\n=== Professores Cadastrados ===");
        for (professor p : professores) {
            p.imprimirInformacoes();
        }

        scanner.close();
    }
}
