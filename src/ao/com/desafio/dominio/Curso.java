package ao.com.desafio.dominio;

public class Curso extends Conteudos {

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }


    private int cargaHoraria;

    public Curso(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: \n" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' ;
    }
}
