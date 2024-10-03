import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.InserirDados;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.MostrarDados;

public class Main {
    public static void main(String[] args) {

        // Instanciando as classes responsáveis
        InserirDados inserirDados = new InserirDados();
        MostrarDados mostrarDados = new MostrarDados();

        // Captura de dados
        Curso curso1 = inserirDados.inserirCurso(1);
        Curso curso2 = inserirDados.inserirCurso(2);
        Mentoria mentoria = inserirDados.inserirMentoria();

        // Criando o Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando um Dev e inscrevendo no Bootcamp
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        // Exibindo progresso do Dev
        mostrarDados.mostrarProgressoDev(devCamila);

        // Exibindo cursos e mentoria criados
        mostrarDados.mostrarCursoMentoria("Curso 1", curso1.getTitulo(), curso1.getDescricao(),
                curso1.getCargaHoraria());
        mostrarDados.mostrarCursoMentoria("Curso 2", curso2.getTitulo(), curso2.getDescricao(),
                curso2.getCargaHoraria());
        mostrarDados.mostrarMentoria(mentoria.getTitulo(), mentoria.getDescricao());
    }
}
