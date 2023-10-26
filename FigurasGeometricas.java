import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class FiguraGeometrica {
    Scanner sc = new Scanner (System.in);
    private String nombre;
    private String color;
    /**
     * Primer método que se ejecuta al correr el programa.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Ingrese el nombre de la figura: ");
        String nm = sc.nextLine();
    }
    public void setColor(String color) {
        this.color = color;
        System.out.println("Ingrese el color de la figura: ");
        String cl = sc.nextLine();
        String select = null;
        System.out.println("Ingrese el tipo de figura: ");
        select = sc.nextLine();
        switch (select) {
            case "Circulo" :
                System.out.println("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                Circulo encontrarRadio = new Circulo("nombre","color", radio);

                break;
            case "Rectangulo" :
                break;
            case "Triangulo" :
                break;
            default :
                System.out.println("!Figura no encontrada¡");
        }
    }