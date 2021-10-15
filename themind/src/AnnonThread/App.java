package AnnonThread;

public class App {

    public static void main(String[] args) {

        //Anonymous Thread
        Thread at1 = new Thread(new Runnable() {

            @Override
            public void run() {
                int millis = 100;
                for (int i = 0 ; i<10; i++){

                    System.out.println("This prints "+ i + " every " + millis + " millisecond");

                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        at1.start();
    }
}
