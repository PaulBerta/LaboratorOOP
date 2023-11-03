package Lab7.Ex2;

public class Persoana {
    private String nume;
    private String prenume;
    private String CNP;

    public Persoana(String nume, String prenume, String CNP){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
    }

    public String getNume(){
        return this.nume;
    }

    public void setNume(String numeNou){
        this.nume = numeNou;
    }

    public String getPrenume(){
        return this.prenume;
    }

    public void setPrenume(String prenumeNou){
        this.prenume = prenumeNou;
    }

    public String getCNP(){
        return this.CNP;
    }

    public void setCNP(String CNPNou){
        this.CNP = CNPNou;
    }

    public String toString(){
        return this.nume + " " + this.prenume + " : " + this.CNP;
    }
    
}
