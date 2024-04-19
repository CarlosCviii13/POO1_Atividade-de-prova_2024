package prova;

public class Quadrado extends Retangulo {

    public Quadrado(String cor, double lado1) {
        super(cor, lado1, lado1);
    }

    @Override
    public double getArea() {
        return lado1 * lado1;
    }
    
    @Override
    public String toString() {
    return "Quadrado [lado1= " + this.lado1 + this.cor + "]";
    }
}