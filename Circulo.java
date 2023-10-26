class Circulo extends FiguraGeometrica {
    private double radio;
    /**
     * Constructor de la clase.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    public double getArea() {
        return radio;
    }
    public void setArea(double radio) {
        this.radio = radio;
        double area = (radio * radio) * 3.1415;
    }
}