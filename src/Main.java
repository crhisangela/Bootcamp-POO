import br.est.desafio.Bootcamp;
import br.est.desafio.Curso;
import br.est.desafio.Dev;
import br.est.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] Args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrico curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrico curso JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCrhis = new Dev();
        devCrhis.setNome("Crhis");
        devCrhis.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devCrhis.getConteudosIncritos());
        devCrhis.progredir();
        devCrhis.progredir();
        System.out.println("Conteudos inscritos: " + devCrhis.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + devCrhis.getConteudosConcluidos());
        System.out.println("XP: " + devCrhis.calcularTotalXp());

        System.out.println("-----------------------------------------------------");

        Dev devAlec = new Dev();
        devAlec.setNome("Alec");
        devAlec.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devAlec.getConteudosIncritos());
        devAlec.progredir();
        devAlec.calcularTotalXp();
        System.out.println("Conteudos inscritos: " + devAlec.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + devAlec.getConteudosConcluidos());
        System.out.println("XP: " + devAlec.calcularTotalXp());





    }
}
