package multithread;

public class MultiThreading {
    public static void main(String[] args) {
        Runnable runnable = () -> {
          for (int i = 0; i < 10; i++) {
              System.out.println("child thread");
          }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("parent thread");
        }
    }
}
