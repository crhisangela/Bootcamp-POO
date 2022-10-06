import br.est.desafio.Curso;
import br.est.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] Args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrico curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrico curso JavaScript");
        curso2.setCargaHoraria(10);


        Mentoria mentoria =new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao Mentoria Java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);




    }
}
