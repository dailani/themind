package Thread1;

import java.util.Scanner;

public class App {

    //psvm
    public static void main(String[] args) {


        /*      Runner
         Thread t1 = new Thread(new Runner());
         Thread t2 = new Thread(new Runner());
         t1.start();
         t2.start();
         */

        //Processor

        Processor proc1 = new Processor();
        proc1.start();

        System.out.println("Press return to stop ...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        proc1.shutdown();
    }
}


/*
        Problems of Threads
 1.  Data being Cached(Synchronization)
 2.  Threads Deadlocks
 */