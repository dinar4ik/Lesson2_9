
package lesson2_9;

class Circle extends SquareCylinder{
    int r = 5;   
    int rr(){
        int r2 = r*r;
        return r2;
    }
    double SC(){
    double resC = 2*pi*rr();
    return resC;
    }
    
}
