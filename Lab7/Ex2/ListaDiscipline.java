package Lab7.Ex2;

import java.util.ArrayList;
import java.util.List;

public class ListaDiscipline {
    public List<Disciplina> discipline = new ArrayList<Disciplina>();

    public ListaDiscipline(){

    }

    public void adaugaDisc(String denumire, String cadruDidactic,float nota){
        Disciplina disciplinaNoua = new Disciplina(denumire, cadruDidactic, nota);
        discipline.add(disciplinaNoua);
    }
}
