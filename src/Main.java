import ao.com.desafio.dominio.Curso;
import ao.com.desafio.dominio.Mentoria;

import static java.lang.IO.println;

void main() {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso de JAVA");
    curso1.setDescricao("Curso de JAVA de nível básico até ");
    curso1.setCargaHoraria(20);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de Python");
    curso2.setDescricao("Curso de Python de nível básico até ");
    curso2.setCargaHoraria(10);
    Mentoria mentor1 = new Mentoria();
    mentor1.setTitulo("Mentoria de Java ");
    mentor1.setDescicao("descrição de mentoria java ");
    mentor1.setData(LocalDate.now());

    println(mentor1);
    println(curso1);
    println(curso2);
}
