package shapes;

public class Cube implements Shape {
    private double edge;

    public Cube (double edgeLength)
    {
        edge = edgeLength;
    }

    @Override
    public double volume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(edge, 2);
    }
}
