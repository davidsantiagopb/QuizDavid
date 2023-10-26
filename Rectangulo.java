class Rectangulo extends FiguraGeometrica {
    private double lado1, lado2;
    /**
     * Constructor de la clase Rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}