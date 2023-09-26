public class ContBancar {
    private double sold = 0.0;

    public ContBancar(double sold) {
        this.sold = sold;
    }

    public void depozitareSuma(double suma) {
        sold += suma;
    }

    public void retragereSuma(double suma) {
        sold -= suma;
    }

    public double interogareSold() {
        return sold;
    }

    public String toString() {
        return "Soldul contului este: " + sold;
    }
}
