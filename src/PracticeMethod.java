public class PracticeMethod {


    /* public static void main(String[] args) {
       one() ;
 System.out.println(two());
 System.out.println(getOne(12,8));

     }*/
    public static void one() {
        int x = 12;
        int y = 25;
        int z = x + y;
        System.out.println(z);
    }

    public static int two() {
        int x = 12;
        int y = 25;
        int z = x + y;
        return z;
    }

    public static int getOne(int x, int y) {
        int z = x + y;
        return z;
    }

    public static boolean getTwo() {
        int x = 5;
        int y = 5;
        if (x == y) {
            return true;
        } else
            return false;
    }

    public void getThree() {
        int x = 121;
        int y = 55;
        int c = x + y;
        System.out.println(c);
    }
}







