package Lab3;

public class Gradina {
    
    private Planta[] plante;
    private int nrPlante;
    public int capacitate;
    public double suprafata;
    private final double unitateMarireSuprafata = 100;

    public Gradina(){
        this.plante = new Planta[10];
        this.nrPlante = 0;
        this.capacitate = 10;
        this.suprafata = 100;
    }

    public Gradina(int capacitate, double suprafata){
        this.plante = new Planta[capacitate];
        this.nrPlante = 0;
        this.capacitate = capacitate;
        this.suprafata = 100;
    }

    public void adaugaPlanta(Planta planta){
        if(this.nrPlante < this.capacitate){
            this.plante[this.nrPlante] = planta;
            this.nrPlante++;
        }
    }

    public void afiseazaPlante(){
        for(int i = 0; i < this.nrPlante; i++){
            System.out.println(this.plante[i].toString());
        }
    }

    public int getNrPlante(){
        return this.nrPlante;
    }

    public void setNrPlante(int nrPlante){
        this.nrPlante = nrPlante;
    }

    public void udaGradina(){
        for(int i = 0; i < this.nrPlante; i++){
            this.plante[i].plantaCreste();
        }
    }

    public void maresteSuprafata(){
        this.suprafata += unitateMarireSuprafata;
    }

     public void maresteSuprafata(double suprafata){
        this.suprafata += suprafata;
    }

    public String toString(){
        return "Gradina are " + this.nrPlante + " plante si o suprafata de " + this.suprafata + " mp";
    }

    public static void main(String Args[]){
        Gradina gradina = new Gradina(10, 100);
        Planta planta1 = new Planta("Trandafir", "Rosu", 1, 1);
        Planta planta2 = new Planta("Lalea", "Galben", 1, 1);
        Planta planta3 = new Planta("Lalea", "Rosu", 1, 1);

        gradina.adaugaPlanta(planta1);
        gradina.adaugaPlanta(planta2);
        gradina.adaugaPlanta(planta3);

        gradina.afiseazaPlante();

        gradina.udaGradina();
        gradina.afiseazaPlante();

        gradina.maresteSuprafata();
        System.out.println(gradina.toString());

        Floare floare1 = new Floare("Trandafir","rosu", "puternic");
        System.out.println(floare1.toString());
        //Floare floare2 = new Floare();
    }

    
}
