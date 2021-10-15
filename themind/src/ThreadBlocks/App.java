package ThreadBlocks;

public class App {
    /*
                atomic variable
        Doesnt allow other Threads to access count
        while another one is currently using it
     */
    private int count = 0;


    /*
                    Lock
        While Thread1 uses this method Thread2 has to wait for it
     */
    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args) {
        App app = new App();
        app.doWork();
    }

    public void doWork(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0; i<10000 ; i++)
                    increment();

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0; i<10000 ; i++)
                    increment();

            }
        });

        t1.start();
        t2.start();


        //          Join
        // "t1.join()" wont return until Runnable at "Thread t1 = ..." finishes.
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);

    }
}
