package Lab3;
public class Planta{
    
    private String nume;
    private String culoare;
    public double inaltime;
    public int varsta;


    public Planta(String nume, String culoare, double inaltime, int varsta){
        this.nume = nume;
        this.culoare = culoare;
        this.inaltime = inaltime;
        this.varsta = varsta;
    }

    public Planta(String nume, String culoare){
        this.nume = "Samanta";
        this.inaltime = 0;
        this.varsta = 0;
    }

    public String getNume(){
        return this.nume;
    }

    public void setNumen(String nume){
        this.nume = nume;
    }

    public String getCuloare(){
        return this.culoare;
    }

    public void setCuloare(String culoare){
        this.culoare = culoare;
    }

    public void plantaCreste(){
        this.inaltime++;
    }

    private void plantaImbatraneste(){
        this.varsta++;
    }

    public String toString(){
        return this.nume + " " + this.culoare + " " + this.inaltime + " " + this.varsta;
    }
}