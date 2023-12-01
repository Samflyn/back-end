package threading;

public class ARunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside ARunnable");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupt");
            return;
        }
    }
}
