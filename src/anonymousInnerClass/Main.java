package anonymousInnerClass;

public class Main {
    public static void main(String[] args) {
        //using anonymous inner class
        /*Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                    sleep1Second();
                }
            }
        };*/

        MyInterface myInterface = new MyInterface() {
            @Override
            public void m1() {
                System.out.println("from m1 method");
            }

            @Override
            public void m2() {
                System.out.println("from m2 method");
            }
        };

        //using lambda expression
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
                sleep1Second();
            }
        };

        Thread thread = new Thread(r);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            sleep1Second();
        }

        myInterface.m1();
        myInterface.m2();
    }

    static void sleep1Second() {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
