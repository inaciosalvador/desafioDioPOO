import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso(); //objeto1
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); // objeto2
        curso1.setTitulo("Curso php");
        curso1.setDescricao("Descrição curso php");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria(); //objeto do tipo mentoria
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Boot Java developer");
        bootcamp.setDescricao("Descrição boot java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devInacio = new Dev();
        devInacio.setNome("inacio");
        devInacio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Inacio " + devInacio.getConteudosInscritos());
        System.out.println("XP: " + devInacio.calcularTotalXp());
        devInacio.progredir();
        devInacio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Inacio " + devInacio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Inacio" + devInacio.getConteudosConcluidos());
        System.out.println("XP: " + devInacio.calcularTotalXp());

        System.out.println("-------------------------------------------------------------------");

        Dev devarielly = new Dev();
        devarielly.setNome("arielly");
        devarielly.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Arielly " + devarielly.getConteudosInscritos());
        System.out.println("XP: " + devarielly.calcularTotalXp());
        devarielly.progredir();
        devarielly.progredir();
        devarielly.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Arielly " + devarielly.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Arielly " + devarielly.getConteudosConcluidos());
        System.out.println("XP: " + devarielly.calcularTotalXp());
    }
}
