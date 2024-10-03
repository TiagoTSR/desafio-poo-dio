package br.com.dio.desafio.dominio;

public class MostrarDados {

    public void mostrarProgressoDev(Dev dev) {
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
    }

    public void mostrarCursoMentoria(String tipo, String titulo, String descricao, int cargaHoraria) {
        System.out.println(
                tipo + " criado: " + titulo + ", Descrição: " + descricao + ", Carga Horária: " + cargaHoraria);
    }

    public void mostrarMentoria(String titulo, String descricao) {
        System.out.println("Mentoria criada: " + titulo + ", Descrição: " + descricao);
    }
}
