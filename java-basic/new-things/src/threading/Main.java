package threading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main");
        Thread aThread = new AThread();
        aThread.start();
//        cannot run start again, need to create new instance
//        aThread.start();

        new Thread(() -> System.out.println("Anonymous class")).start();

        Thread aRunnable = new Thread(new ARunnable());
        aRunnable.start();
        aRunnable.interrupt();

        new Thread(new ARunnable() {
            @Override
            public void run() {
                System.out.println("Hello");
                try {
                    aThread.join();
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        }).start();

        System.out.println("End of Main");
    }
}
