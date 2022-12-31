package Homework;

public class testOne {
    //01.Create a method with no arguments;
        public void red() {
System.out.println("This is normal method");
        }

        //02.Create a method which return void;
        public void green() {
            System.out.println("This is void method");
        }

        //03.Create a method which return a boolean value;
        public boolean blue() {
            boolean t = true;
            return t;
        }

        //04.Create a method with one parameter Data type is integer;
        public void orange(int x) {

            System.out.println(x);

        }

        // 05.Create a method with Two parameter Data type is String;
        public void navy(String q, String p) {

            System.out.println(q);
            System.out.println(p);
        }

        //06.Create a method with Two parameter Data type is integer and String;
        public void pink(int a, String b) {
            System.out.println(a);
            System.out.println(b);
        }

        // 07.Create a method with Three parameter Data type is integer,String , boolean;
        public void purple(int i, String s, boolean t) {
            System.out.println(i);
            System.out.println(s);
            System.out.println(t);

        }

        //08.Create a method which accept two integer arguments and return sum of those two integer
        public int black(int a, int b) {

            int c = a + b;
            return c;

        }

        //09.Create a method which accept two string arguments and return boolean value;
        public boolean white(String a, String b) {

            if (a == b) {
                return true;
            } else {
                return false;
            }
        }

        //10.Print 1 to 10 using while loop;
        public void yellow() {
            int h = 1;
            while (h <= 10) {
                System.out.println(h);
                h++;
            }
        }

        public static void main(String[] args) {
            testOne testone = new testOne();
            testone.red();
            testone.green();
           System.out.println(testone.blue());
            testone.orange(10);
           testone.navy("banana","apple");
           testone.purple(10,"Grape", true);
           System.out.println(testone.black(25,30));
            System.out.println(testone.white("Shahana","Ahmed"));
            testone.yellow();
        }
    }
