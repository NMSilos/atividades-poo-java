package entities;
public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2.0 * (width + height);
    }

    public double diagonal(){
        double sum = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(sum);
    }

    @Override
    public String toString() {
        return String.format("AREA: %.2f\nPERIMETER: %.2f\nDIAGONAL: %.2f", area(), perimeter(), diagonal());
    }
}
