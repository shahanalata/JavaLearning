public class MethodConcept {
    public static void main(String[] args) {
        getOne();
        System.out.println("This is return method   " + getTwo());
        System.out.println(getThree());
        System.out.println(getFour());
        System.out.println(getFive(35,25));
        System.out.println(getSix(35,25,12));
    }
    public static void getOne() {
        int x = 7;
        int y = 5;
        int z = x + y;
        System.out.println(z);
    }
    public static int getTwo() {
        int x = 7;
        int y = 5;
        int z = x + y;
        return z;

    }
    public static boolean getThree() {
        int x = 5;
        int y = 5;
        if (x == y) {
            return true;
        } else
            return false;
    }
    public static boolean getFour() {
        int x = 5;
        int y = 8;
        if (x == y) {
            return true;
        } else
            return false;
    }
    public static int getFive(int x, int y) {
      int c =x+y;
      return c;
    }
    public static int getSix(int x, int y, int z) {
        int c =x+y-z;
        return c;
    }
}


