package Lab8;

public interface Calculator {
    public double suma(double a, double b) throws OverflowException, UnderFlowException, NullParameterException;
    public double impartire(double a, double b) throws ArithmeticException, NullParameterException;
    public double media(double[] a) throws UnderFlowException, NullParameterException;
}