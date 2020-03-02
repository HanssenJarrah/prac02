package shapes;

public class ShapeHandler {
    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        double volumeSum = 0;
        for (Shape shape : shapes) {
            volumeSum += shape.volume();
        }
        return volumeSum;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        double surfaceAreaSum = 0;
        for (Shape shape : shapes)
        {
            surfaceAreaSum += shape.surfaceArea();
        }
        return surfaceAreaSum;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Cube(6.0),
                new Cylinder(2.0, 5.5),
                new Tetrahedron(1.25)
        };

        double volumeSum = volumeSum(shapes);
        System.out.println("Sum of shape volumes = " + Math.round(volumeSum) + " m^3");

        double surfaceAreaSum = surfaceAreaSum(shapes);
        System.out.println("Sum of shape surface areas = " + Math.round(surfaceAreaSum) + " m^2");
    }
}
