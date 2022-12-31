public class StringConcept {

    public static void main(String[] args) {


        String s = "selenium";// when string literal declare, it cannot be change the string value.
        // by creating object (string Buffer& String Builder)
        System.out.println("It will give us total length of the value:  " + s.length());
//string concat:
        System.out.println(s);
        String s2 = s + s.length();
        System.out.println(s2);
        String s4 = s.concat("hi");
        System.out.println(s4);
// String by creating object
        StringBuffer st = new StringBuffer(" Good");//synchronized(Thread safe)-screen share(everyone can see only)
        st.deleteCharAt(2);
        System.out.println(st);
        System.out.println(s+st);
        StringBuilder sb = new StringBuilder("java");//non-synchronized(Thread local)-open camera(everyone can do together)
        sb.append('s');      // or only did it for me, not change for anyone
        System.out.println(sb);
        //comparison
        String p = "Java";
        String q = "Learning";
        String r = "java";
        p.equals(q);
        System.out.println(p.equals(q));//value
        System.out.println(p == q);//variable
        System.out.println(p.equals(r));
        System.out.println(p == r);
        System.out.println(p.equalsIgnoreCase(r));
        System.out.println(p == r);
        //trim
        String g = " good ";//before and after white space of word
        System.out.println(g);
        String b = g.trim();
        System.out.println(b);
        //split   // in between of the sentence/ word
        String a = "I love my country";
        a.split(" ");
        //String[] l = a.split(" ");
        //System.out.println("This a normal split:  "+ l.);
        String f = "sun:flower";
        System.out.println(f);
        f.split(":");
        String f1[] = f.split(":");
        for (int i = 0; i < f1.length; i++) {    //f1.length-dynamic
            System.out.println(f1[i]);
            String d = "I am navigating the java learning";
            System.out.println(d);
            System.out.println(d.length());
            System.out.println(d.split(" "));
           d.replace("am", "will");
            System.out.println(d.replace("am", "will"));
            String d1[] = d.split(" ");
            for (int j = 0; j < d1.length; j++) {
                System.out.println(d1[j]);
            }
        }
    }
}