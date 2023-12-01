package threading;

public class MultipleThreads {
    public static void main(String[] args) {
        Count count = new Count();
        NumThread n1 = new NumThread(count);
        n1.setName("Thread 1");
        NumThread n2 = new NumThread(count);
        n2.setName("Thread 2");
        n1.start();
        n2.start();
    }
}

//class Count {
//    synchronized void count() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + " : i = " + i);
//        }
//    }
//}

class Count {
    void count() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : i = " + i);
            }
        }
    }
}

class NumThread extends Thread {
    private Count count;

    public NumThread(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.count();
    }
}