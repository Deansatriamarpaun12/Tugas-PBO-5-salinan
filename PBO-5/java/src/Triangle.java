class Triangle {
    private String name;
    private double side1, side2, side3;

    public Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this(null, side1, side2, side3);
    }

    public void getInfo() {
        System.out.println("Triangle " + name + " with sides " + side1 + ", " + side2 + ", " + side3);
    }
}