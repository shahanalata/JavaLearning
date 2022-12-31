package Concept;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayConcept {
    public static void main(String[] args) {
        String s ="Shahana ";
        String s1 ="Fahmida ";
        String s2 ="Anika ";
        String s3 ="Jannat ";
        String s4 =" Rubina";
        String s5 ="Merin ";  //run time & compile time error

        String ss[] = new String[3];
        ss[0]="Shahana";
        ss[1]="jannat";
        ss[2]="Anika";

        for(int k = 0;k<ss.length; k++) {
            System.out.println(ss[k]);
        }
        //Static-1D, 2D (dymention)
        int a[] = new  int[5];//declare any data type
         a[0]=1;
        a[1]=10;
        a[2]=15;
        a[3]=18;
        a[4]=100;
        //a[5]=1445; array out of boundary

        //for loop & array follow index
        for(int i = 0;i<a.length; i++){
            System.out.println(a[i]);//0,1,2,3,4-separetly print
        }
        //dynamic array-no limitation(Arraylist,linkedlist class)
        ArrayList al = new ArrayList();
        al.add("Shahana");
        al.add('A');
        al.add(true);
        al.add(3.5);
        al.add(2);

        System.out.println(al.get(3));//

        for(int j=0; j<al.size(); j++){
           // System.out.println(al);//print as a size
            System.out.println(al.get(j));
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
        LinkedList lk = new LinkedList();
        lk.add(3);
        lk.add("good");
        lk.add(4.5);

        for(int j1=0; j1<lk.size(); j1++){
            System.out.println(lk.get(j1));
            System.out.println(lk.get(1));
        }

    }
}
//linklist is faster than arraylist
//when see a data --slow in arraylist
//when data retrived(delete/add) it is fast in arraylist,
//arraylist index, linkedlist follow nude
//memory need less for arraylist, need more memory for linkedlist