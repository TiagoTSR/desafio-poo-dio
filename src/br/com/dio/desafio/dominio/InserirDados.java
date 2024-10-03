package br.com.dio.desafio.dominio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InserirDados {

    private Scanner scanner;

    public InserirDados() {
        this.scanner = new Scanner(System.in);
    }

    public Curso inserirCurso(int numeroDoCurso) {
        System.out.println(" Digite o nome do curso " + numeroDoCurso + ":");
        String nomeCurso = scanner.nextLine();

        System.out.println(" Digite a descrição do curso " + numeroDoCurso + ":");
        String descricaoCurso = scanner.nextLine();

        int cargaHoraria = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println(" Digite a carga horária do curso " + numeroDoCurso + " (número):");
                cargaHoraria = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println(" Erro: Por favor, insira um número válido para a carga horária.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        scanner.nextLine(); // Consumir a quebra de linha após a entrada numérica

        Curso curso = new Curso();
        curso.setTitulo(nomeCurso);
        curso.setDescricao(descricaoCurso);
        curso.setCargaHoraria(cargaHoraria);

        return curso;
    }

    public Mentoria inserirMentoria() {
        System.out.println(" Digite o nome da mentoria:");
        String nomeMentoria = scanner.nextLine();

        System.out.println(" Digite a descrição da mentoria:");
        String descricaoMentoria = scanner.nextLine();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(nomeMentoria);
        mentoria.setDescricao(descricaoMentoria);

        return mentoria;
    }
}
