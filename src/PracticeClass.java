public class PracticeClass {

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
    public void three(){
        int x = 15;
        int y = 20;
        int c = x + y;
        System.out.println(c);
    }

    public int four(){
        int x = 15;
        int y = 20;
        int c = x + y;
       return c;
    }
    public static void main(String[] args) {
        one();
        PracticeClass pc = new PracticeClass();
        pc.three();
System.out.println(pc.four());
    }
}
