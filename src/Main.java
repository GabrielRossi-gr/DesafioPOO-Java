import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricao java bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devRossi = new Dev();
        devRossi.setNome("gabriel rossi");
        devRossi.inscreverBooticamp(bootcamp);
        System.out.println("conteudos inscritos rossi"+ devRossi.getConteudosInscritos());
        devRossi.progredir();//
        System.out.println("--");
        System.out.println("conteudos inscritos rossi"+ devRossi.getConteudosInscritos());
        System.out.println("conteudos concluidos rossi"+ devRossi.getConteudosConcluidos());
        System.out.println("XP: " + devRossi.calcularTotalXp());
        


        System.out.println("-----------------------------------------");

        
        Dev devJuninho = new Dev();
        devJuninho.setNome("juninho");
        devJuninho.inscreverBooticamp(bootcamp);
        System.out.println("conteudos inscritos juninho"+ devJuninho.getConteudosInscritos());
        devJuninho.progredir();//
        devJuninho.progredir();//
        devJuninho.progredir();//
        System.out.println("--");
        System.out.println("conteudos inscritos juninho"+ devJuninho.getConteudosInscritos());
        System.out.println("conteudos concluidos juninho"+ devJuninho.getConteudosConcluidos());
        System.out.println("XP: " + devJuninho.calcularTotalXp());
    }   

}
