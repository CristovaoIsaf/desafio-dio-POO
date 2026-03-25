import ao.com.desafio.dominio.Bootcamp;
import ao.com.desafio.dominio.Curso;
import ao.com.desafio.dominio.Dev;
import ao.com.desafio.dominio.Mentoria;

import static java.lang.IO.println;

void main() {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso de JAVA");
    curso1.setDescricao(" Descrição Curso de JAVA  ");
    curso1.setCargaHoraria(20);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de Python");
    curso2.setDescricao("Descrição Curso de Python ");
    curso2.setCargaHoraria(20);

    Mentoria mentor1 = new Mentoria();
    mentor1.setTitulo("Mentoria de Java ");
    mentor1.setDescricao("descrição de mentoria java ");
    mentor1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp JAVA Developer");
    bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentor1);


    Dev devCristovao = new Dev();
    devCristovao.setNome("Cristovao");
    devCristovao.increverBootcamp(bootcamp);
    println("Conteúdos Inscritos: " + devCristovao.getConteudosIncritos());
    devCristovao.progredir();
    devCristovao.progredir();
    println("Conteúdos Inscritos: " + devCristovao.getConteudosIncritos());
    println("Contuedo Concluídos: " + devCristovao.getConteudosConcluidos());
    println("XP: " + devCristovao.calcucarTotalXp());

    Dev devSara = new Dev();
    devSara.setNome("Sara");
    devSara.increverBootcamp(bootcamp);
    println("Conteúdos Inscritos: " + devSara.getConteudosIncritos());
    devSara.progredir();
    println("Conteúdos Inscritos: " + devSara.getConteudosIncritos());
    println("Conteúdos Conlcuidos " + devSara.getConteudosConcluidos());
    println("XP: " + devSara.calcucarTotalXp());

}
