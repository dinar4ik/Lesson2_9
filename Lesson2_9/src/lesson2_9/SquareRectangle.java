
package lesson2_9;

class SquareRectangle extends Rectangle{
    
    double SR(){
        Circle c = new Circle();
        double resR = 2*c.pi*c.r*h;
        return resR;
    }
    
}
