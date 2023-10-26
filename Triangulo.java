class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}