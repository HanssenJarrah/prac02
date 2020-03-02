package shapes;

public class Tetrahedron implements Shape {
    private double edge;

    public Tetrahedron (double edgeLength)
    {
        edge = edgeLength;
    }

    @Override
    public double volume() {
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public double surfaceArea() {
        return Math.sqrt(3) * Math.pow(edge, 2);
    }
}
