import prova.Circulo;
import prova.Quadrado;
import prova.Retangulo;
import prova.Triangulo;

public class App {
public static void main(String[] args) throws Exception {

Quadrado quadrado = new Quadrado("Roxo", 4);

Triangulo triangulo = new Triangulo("Azul", 5, 12);

Circulo circulo = new Circulo("Verde", 10.2);

Retangulo retangulo = new Retangulo("Rosa", 32, 12);


System.out.println("\nQuadrado");
System.out.println("Base do Quadrado: " + quadrado.getArea());


System.out.println("\nTriangulo");
System.out.println("Base do Triangulo: " + triangulo.getArea());


System.out.println("\nCirculo");
System.out.println("Base do Circulo: " + circulo.getArea());


System.out.println("\nRetangulo");
System.out.println("Base do Retangulo: " + retangulo.getArea());
}
}
