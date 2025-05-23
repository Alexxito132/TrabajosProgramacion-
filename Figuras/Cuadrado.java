package Model;

public class Cuadrado {
   private double lado; 

   public double getPerimetro() {
        
        return 4 * lado;
   }

   public void setLado(double lado) {
    this.lado = lado;
   }

   public double getArea() {
        return lado * lado;
   }

   public void getArea(double lado) {
    this.lado = lado;
   }
}
