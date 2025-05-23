import Model.Triangulo;
import Model.Circulo;
import Model.Cuadrado;

public class App {
    public static void main(String[] args) throws Exception {

    Cuadrado cd = new Cuadrado();
    cd.setLado(5);
    System.out.println("Cuadrado");
    System.out.println(cd.getPerimetro());
    System.out.println(cd.getArea());
    cd.getArea(5);

    Circulo cir = new Circulo();
    cir.setRadio(5);
    System.out.println("Circulo");
    System.out.println(cir.getPerimetro());
    System.out.println(cir.getArea());
    cir.getArea(5);
    

    Triangulo tri = new Triangulo();
    tri.setBase(7);
    tri.setAltura(5);
    System.out.println("Triangulo");
    System.out.println(tri.getPerimetro());
    System.out.println(tri.getArea());
    }
}