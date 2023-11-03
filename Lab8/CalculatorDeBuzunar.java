package Lab8;

public class CalculatorDeBuzunar implements Calculator{
    
    public double suma(double a, double b) throws OverflowException, UnderFlowException, NullParameterException{
        if(Double.isNaN(a) || Double.isNaN(b))
            throw new NullParameterException("Null parameter");
        
        if(a + b == Double.POSITIVE_INFINITY){
            throw new OverflowException("Overflow la suma");
        }

        if(a+b == Double.NEGATIVE_INFINITY){
            throw new UnderFlowException("Underflow la suma");
        }
        return a + b;
    }

    public double impartire(double a, double b) throws ArithmeticException, NullParameterException{
        if(Double.isNaN(a) || Double.isNaN(b))
            throw new NullParameterException("Null parameter");
        if(b == 0){
            throw new ArithmeticException("Impartire la 0");
        }
        return a / b;
    }

    public double media(double[] a) throws NullParameterException{
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            if(Double.isNaN(a[i])){
                throw new NullParameterException("Null parameter");
            }
            sum += a[i];
        }
        return impartire(sum, a.length);
    }

    public static void main(String[] args){
        CalculatorDeBuzunar calc = new CalculatorDeBuzunar();

        try{
            System.out.println(calc.suma(1, 2));
            //System.out.println(calc.suma(Double.POSITIVE_INFINITY, 1));
            System.out.println(calc.suma(Double.NEGATIVE_INFINITY, -1));
            System.out.println(calc.suma(Double.NaN, 1));
            System.out.println(calc.suma(1, Double.NaN));
            System.out.println(calc.suma(Double.NaN, Double.NaN));
        }catch(OverflowException e){
            System.out.println(e.getMessage());
        }catch(UnderFlowException e){
            System.out.println(e.getMessage());
        }catch(NullParameterException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Done");
        }
        
    }
}
