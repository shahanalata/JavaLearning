package Concept;

public class StringConceptTwo {

    public static void main(String[] args) {
        //string substring method
    String s = "Java learning";
   int l = s.length();
        System.out.println(l);
        System.out.println(s.substring(3));
        System.out.println(s.substring(4,10));
        System.out.println(s.substring(4,13));
      //
      String a = "Story Writer" ;
        System.out.println(a.startsWith("Story"));//return true/ false
        System.out.println(a.endsWith("writer"));//it should be same word
        System.out.println(a.endsWith("writerr"));// boundary value analysis




        System.out.println();
    }
}
