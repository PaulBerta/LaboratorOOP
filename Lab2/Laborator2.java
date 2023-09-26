import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Laborator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int problema = scanner.nextInt();

        switch(problema){
            case 1:
                ContBancar cont = new ContBancar(0.0);
            
                double suma1 = scanner.nextDouble();
                double suma2 = scanner.nextDouble();

                cont.depozitareSuma(suma1);
                cont.depozitareSuma(suma2);

                System.out.println(cont.toString());
                break;

            case 2:
                ContBancar cont2 = new ContBancar(500.0);

                cont2.depozitareSuma(300.0);

                System.out.println(cont2.interogareSold());

                Random random = new Random();
                int N = random.nextInt(1000);
                for (int i = 0; i < N; i++) {
                    switch(random.nextInt(2)) {
                        case 0:
                            cont2.depozitareSuma(random.nextDouble() * 100);
                            break;
                        case 1:
                            cont2.retragereSuma(random.nextDouble() * 100);
                            break;
                    }
                }

                System.out.println(cont2.toString());
                break;

            case 3:
                Masina masina = new Masina("Audi", "Negur", 220.0);
                System.out.println(masina.toString());
                List<Masina> masini = new ArrayList<Masina>();
                
                int N2 = scanner.nextInt();
                for (int i =1;i<=N2;i++) {
                    String tip = scanner.next();
                    String culoare = scanner.next();
                    double viteza = scanner.nextDouble();
                    masini.add(new Masina(tip, culoare, viteza));
                }

                for(Masina m : masini) {
                    System.out.println(m.toString());
                }
                break;
        }

        scanner.close();
    }
}
