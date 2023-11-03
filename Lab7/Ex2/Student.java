package Lab7.Ex2;

public class Student extends Persoana{
    private ListaDiscipline listaDiscipline;

    public Student(String nume, String prenume, String CNP){
        super(nume, prenume, CNP);
    }

    public void adaugareDisc(String denumire, String cadruDidactic, float nota){
        listaDiscipline.adaugaDisc(denumire, cadruDidactic, nota);
    }

    public double calcuMedie(){
        double sum = 0;
        for (Disciplina disciplina : listaDiscipline.discipline) {
            sum+=disciplina.getNota();
        }
        return sum/listaDiscipline.discipline.size();
    }

    public String toString(){
        return super.toString() + " ,cu media : " + calcuMedie();
    }
}
