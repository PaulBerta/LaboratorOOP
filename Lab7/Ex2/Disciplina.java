package Lab7.Ex2;

public class Disciplina {
    private String denumire;
    private String cadruDidactic;
    private float nota;

    public Disciplina(String denumire,String cadruDidactic,float nota){
        this.denumire = denumire;
        this.cadruDidactic= cadruDidactic;
        this.nota = nota;
    }

    public String getDenumire(){
        return this.denumire;
    }

    public void setDenumire(String denumireNoua){
        this.denumire = denumireNoua;
    }

    public String getCadruDidactic(){
        return this.cadruDidactic;
    }

    public void setCadruDidactic(String cadruDidacticNou){
        this.cadruDidactic = cadruDidacticNou;
    }

    public float getNota(){
        return this.nota;
    }

    public void setNota(float notaNoua){
        this.nota = notaNoua;
    }
}
