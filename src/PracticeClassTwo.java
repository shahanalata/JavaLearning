public class PracticeClassTwo {

public static void one(){
    int a = 12;
    int b = 21;
    int c = a+b;
    System.out.println(c);
}
  public static int two()  {
      int a = 10;
      int b = 20;
      int c = a+b;
      return c;
  }
  public static int getOne(int a,int b){
      int c = a+b;
      return c;
  }

   public void three() {
       int a = 11;
       int b = 15;
       int c = a+b;
       System.out.println(c);
    }

    public static void main(String[] args) {
        one();
        System.out.println(two());
        System.out.println(getOne(5,3));
        PracticeClassTwo pc= new PracticeClassTwo();
        pc.three();
    }
}
