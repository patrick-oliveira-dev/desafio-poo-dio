import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoGit = new Curso();
        cursoGit.setTitulo("Curso de Git");
        cursoGit.setDescricao("Desc Curso de Git");
        cursoGit.setCargaHoraria(4);

        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Curso de Java Basico");
        cursoJavaBasico.setDescricao("Desc Curso de Java Basico");
        cursoJavaBasico.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Desc Mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp de Java Developer");
        bootcampJava.setDescricao("Desc Dev Java");
        bootcampJava.getConteudos().add(cursoGit);
        bootcampJava.getConteudos().add(cursoJavaBasico);
        bootcampJava.getConteudos().add(mentoria);

        Dev devPatrick = new Dev();
        devPatrick.setNome("Patrick");
        devPatrick.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos Inscritos Patrick" + devPatrick.getConteudosInscritos());
        devPatrick.progredir();
        System.out.println("Conteudos Inscritos Patrick" + devPatrick.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Patrick" + devPatrick.getConteudosConcluidos());
        System.out.println("XP:" + devPatrick.calcularXp());

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos Inscritos Pedro" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteudos Inscritos Pedro" + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularXp());
    }
}