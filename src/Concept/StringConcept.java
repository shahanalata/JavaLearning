package Concept;

public class StringConcept {


    public static void main(String[] args) {
        String s = "Selenium";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(7));
        System.out.println(s.indexOf('e'));
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.indexOf('e',s.indexOf('e')+1));

        String ss= "Malayalam";
        System.out.println(ss.length());
        System.out.println(ss.charAt(4));
        System.out.println(ss.charAt(6));
        System.out.println(ss.indexOf('a'));
        System.out.println(ss.lastIndexOf('a'));
        System.out.println(ss.indexOf('a',ss.indexOf('a')+1));
        System.out.println(ss.indexOf('a',ss.indexOf('a')+3));
        System.out.println("this is special: "  +ss.indexOf('a',ss.indexOf('a')+4));
        System.out.println(ss.indexOf('a',ss.indexOf('a')+2));
        System.out.println(ss.lastIndexOf('a',ss.lastIndexOf('a')-1));
        System.out.println(ss.lastIndexOf('a',ss.lastIndexOf('a')-3));
    }
}
