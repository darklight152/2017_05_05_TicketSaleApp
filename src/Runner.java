/**
 * Created by matt on 05/05/2017.
 */


import static tools.loopExample.doLoop;


public class Runner {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("This was a triumph!");

        addFunction2();

        doLoop(4);

    }

     public static void addFunction(){

         int a = 1;
         int b = 2;
         int c = a + b;
         System.out.println(c);

    }

    public static void addFunction2(){

         addFunction();

    }


    }


