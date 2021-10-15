package Thread1;

public class Runner implements Runnable {
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
}
