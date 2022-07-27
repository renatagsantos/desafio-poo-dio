import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descroção curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descroção curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRenata = new Dev();
        devRenata.setNome("Renata");
        devRenata.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renata" + devRenata.getConteudoInscritos());

        devRenata.progredir();
        devRenata.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Renata" + devRenata.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Renata" + devRenata.getConteudoConclidos());
        System.out.println("XP" + devRenata.calcularTotalXp());

        System.out.println("---------------------------------");

        Dev devGilson = new Dev();
        devGilson.setNome("Gilson");
        devGilson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gilson" + devGilson.getConteudoInscritos());

        devGilson.progredir();
        devGilson.progredir();
        devGilson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gilson" + devGilson.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Gilson" + devGilson.getConteudoConclidos());
        System.out.println("XP" + devGilson.calcularTotalXp());
    }
}
