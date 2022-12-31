package Homework;

public class HomeworkTwo {

    /* Problem:- 11. Given a string and a non-negative int n, return a larger string
     * that is n copies of the original string. Example below : stringTimes("Hi", 2)
     * → "HiHi" stringTimes("Hi", 3) → "HiHiHi" stringTimes("Hi", 1) → "Hi"
     */

      /*  public void eleven () {
            String s = "Hi";
            int a = 2;
            for (int i = 0; i < a; i++) {

            }
            /*
             * Problem:-12 Given a string, we'll say that the front is the first 3 chars of
             * the string, If the string length is less than 3, the front is whatever is
             * there, Return a new string which is 3 copies of the front. Example below :
             * front3("Java") → "JavJavJav" front3("Chocolate") → "ChoChoCho" front3("abc")
             * → "abcabcabc"*/


    public void eleven() {
        String ss = "Chocolate";
        int l = ss.length();
        System.out.println(l);
        System.out.println(ss.substring(0, 3));//substring
        String s3 = ss.substring(0, 3);
        ss.concat(s3);
        //System.out.println(ss.concat(s3));
        System.out.println(s3 + s3 + s3);


    }
    /*
     * Problem:-13 Given a string, take the last char and return a new string with
     * the last char added at the front and back, so "cat" yields "tcatt". The
     * original string will be length 1 or more. backAround("cat") → "tcatt"
     * backAround("Hello") → "oHelloo" backAround("a") → "aaa
     */

    public void thirteen() {
        String q = "cat";
        StringBuilder sb = new StringBuilder("cat");
        // sb.append('t');
        sb.append('t');
        // System.out.println(sb);
        System.out.println("t" + sb);

    }

    /*
     * Problem-14 Return true if the given non-negative number is a multiple of 3 or
     * a multiple of 5. Use the % "mod" operator or35(3) → true or35(10) → true
     * or35(8) → false
     */

    public boolean fourteen() {
        int b = 35;
        for (int j = 0; j <= 35; j = j + 1) {
            if (j % 5 == 0)
                System.out.println(j);
                return true;
        }
        return false;
        }

        /*
     * Problem-14 Return true if the given non-negative number is a multiple of 3 or
     * a multiple of 5. Use the % "mod" operator or35(3) → true or35(10) → true
     * or35(8) → false
     */
        public boolean fourteenTwo(){
        int x= 35;
        if (x % 3 ==0) {
            return true;
        } else
            return false;
    }

    /*
     * Problem :-15 Given a string, take the first 2 chars and return the string
     * with the 2 chars added at both the front and back, so "kitten"
     * yields"kikittenki". If the string length is less than 2, use whatever chars
     * are there. front22("kitten") → "kikittenki" front22("Ha") → "HaHaHa"
     * front22("abc") → "ababcab"
     */


/*Problem :-16
     * Given a string, if the string "del" appears starting at index 1,
     * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
       delDel("adelbc") → "abc"
       delDel("adelHello") → "aHello"
       delDel("adedbc") → "adedbc"
     */
public void sixteen(){
    String d = "adelbc";

    StringBuffer st = new StringBuffer(d);
    st.deleteCharAt(1);
    st.deleteCharAt(1);
    st.deleteCharAt(1);
    System.out.println(st);

}






        public static void main (String[]args){
            HomeworkTwo ht = new HomeworkTwo();
            ht.eleven();
            ht.thirteen();
            ht.fourteen();
            System.out.println(ht.fourteen());
            System.out.println (ht.fourteenTwo());
            ht.sixteen();

        }
    }





