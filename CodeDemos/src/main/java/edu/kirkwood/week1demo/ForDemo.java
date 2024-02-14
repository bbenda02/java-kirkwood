package edu.kirkwood.week1demo;


public class ForDemo {
    public static void main(String[] args) {

        for(int count = 0; count < 10; count += 1) {
            System.out.print(count + " "); //prints on same line
        }
        System.out.println();


        for(int count = 1; count < 11; count++) {
            System.out.print(count + " "); //prints on same line
        }
        System.out.println();


        for(int count = 1; count < 11; count +=2) {
            System.out.print(count + " "); //prints on same line
        }
        System.out.println();


        // From Beginner's Guide
        int count;
        for(count = 0; count < 5; count = count + 1) {
            System.out.println("This is count: " + count);
        }
        System.out.println("Done!");

        // From Complete Reference
        int i;
        for(i = 0; i < 10; i = i + 1) {
            System.out.println("This is x: " + i);
        }

//        // This is an infinite loop
//        for(int j = 0; j < 10; j--); {
//            System.out.print(j + " ");
//        }
//        System.out.println();
//
//        for(;;) {
//            System.out.print(j + " ");
//        }
//        System.out.println();

    }
}
