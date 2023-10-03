package Lab4;

import java.util.Scanner;

public class Persoana {
    
    public static int _instanceCount=0;

    private String nume;
    private String prenume;
    private CardIdentitate CI;
    private int varsta;

    public Persoana(String nume, String prenume, CardIdentitate CI, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.CI = CI;
        this.varsta = varsta;
        _instanceCount++;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Persoana[] persoane = new Persoana[n];
        int sumVarsta = 0;

        for(int i=0;i<n;i++){
            String nume = scanner.next();
            String prenume = scanner.next();
            String CNP = scanner.next();
            String serie = scanner.next();
            int numar = scanner.nextInt();
            int varsta = scanner.nextInt();

            CardIdentitate CI = new CardIdentitate(CNP, serie, numar);
            Persoana p = new Persoana(nume, prenume, CI, varsta);
            persoane[i] = p;
            sumVarsta += varsta;
        }

        System.out.println((double)sumVarsta / Persoana._instanceCount);
    }
}
