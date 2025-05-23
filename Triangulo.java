package Model;
public class Triangulo {
    private double Altura;
    private double Base;

    public double getPerimetro() {
        return Altura + Base + Altura;
    }

    public double getArea() {
        return (Base * Altura) / 2;
    }

    public void setBase(double base) {
        this.Base = base;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
}

