package lesson2_9;

public class SquareCylinder {
    double pi = 3.14;
    public static void main(String[] args) {
        SquareRectangle SQR = new SquareRectangle();
        Circle SQC = new Circle();
        double area = SQR.SR()+SQC.SC(); //157+219.8
        System.out.println("Area of Cylinder: "+area);
    }
    
}
