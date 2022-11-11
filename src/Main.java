import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("dio ifood");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(91);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("orange teck");
        curso2.setDescricao("javaScript");
        curso2.setCargaHoraria(100);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("tirar duvidas");
        mentoria1.setDescricao("tirar todas as duvidas da aula");
        mentoria1.setData(LocalDate.now());
        
        
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }   
}
