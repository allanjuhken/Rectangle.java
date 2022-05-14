public class Rectangle {
    private double side_A;
    private double side_B;

    public Rectangle(double side_A, double side_B) {
        this.side_A = side_A;
        this.side_B = side_B;
    }

    /**
     * tagstab külje A
     * @return double tüüpi
     */
    public double getSide_A() { return side_A; }
    /**
     * tagastab külje B
     * @return double tüüpi
     */
    public double getSide_B() { return side_B; }

    /**
     * seadista uus külg A
     * @param side_A double tüüpi
     */
    public void setSide_A(double side_A) { this.side_A = side_A; }

    /**
     * seadista uus külg B
     * @param side_B double tüüpi
     */
    public void setSide_B(double side_B) { this.side_B = side_B; }

    /**
     * tagastab ristküliku pindala
     * @return double tüüpi
     */
    public double getArea() { return side_A * side_B; }

    /**
     * tagastab ristküliku ümbermõõdu
     * @return double tüüpi
     */
    public double getPerimeter() { return 2*side_A + 2*side_B; }


}

