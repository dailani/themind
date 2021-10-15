package Thread1;

public class Processor extends Thread{

    private volatile boolean running = true;


    @Override
    public void run() {
       while (running){
           System.out.println("Hello");

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    public void shutdown (){
        running = false;
    }
}
