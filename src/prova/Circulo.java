package prova;

public class Circulo extends Figura implements IComum {
    private double raio;
    
    public Circulo(String cor, double raio) {
    super(cor);
    this.raio = raio;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    @Override
    public String toString() {
    return "Circulo [lado1= " + this.raio + "]";
    }
}
    
