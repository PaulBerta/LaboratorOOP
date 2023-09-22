public class Masina {
    private String tip;
    private String culoare;
    private double viteza;
    
    public void setTip(String tip) {
        this.tip = tip;
    }
    
    public String getTip() {
        return tip;
    }
    
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    public String getCuloare() {
        return culoare;
    }
    
    public void setViteza(double viteza) {
        this.viteza = viteza;
    }
    
    public double getViteza() {
        return viteza;
    }
    
    public Masina(String tip, String culoare, double viteza) {
        this.tip = tip;
        this.culoare = culoare;
        this.viteza = viteza;
    }

    public String toString() {
        return "Masina de tip " + tip + " de culoare " + culoare + " cu viteza " + viteza;
    }
}
