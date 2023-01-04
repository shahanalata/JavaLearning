public class HomeWorkThree {
   int x = 5;
   int y = 10;

   public void task() {
      int z= x;
       x= y;
       y = z;
      System.out.println("This is the value of x:  "+x);
      System.out.println("This is the value of x:  "+y);
   }

   public static void main(String[] args) {
      HomeWorkThree hw =new HomeWorkThree();
      hw.task();

   }

}



