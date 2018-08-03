// разное количество параметров

public class Rectangle {
   int sqruare(int a, int b){
       int result = a*b; 
       return result;
   }
   
   int square(int x1){
       int x2 = 3;
       int result2 = x1*x2;
       return result2;
   }
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        int res1 = r.sqruare(3, 5);
        int res2 = r.square(3);
        System.out.println(res1);
        System.out.println(res2);   
    } 
}
