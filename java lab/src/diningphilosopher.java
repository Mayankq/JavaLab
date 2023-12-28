public class Philosopher extends Thread {

    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println("Philosopher " + id + " is thinking...");
            rightFork.take(id);
            System.out.println("Philosopher " + id + " took the right fork " + rightFork.id);
            leftFork.take(id);
            System.out.println("Philosopher " + id + " took the left fork " + leftFork.id);
            System.out.println("Philosopher " + id + " is eating...");
            leftFork.put(id);
            System.out.println("Philosopher " + id + " has put down the left fork " + leftFork.id);
            rightFork.put(id);
            System.out.println("Philosopher " + id + " has put down the right fork " + rightFork.id);
        }
    }

}
public class Fork {

    public final int id;
    private boolean forkIsOnTheTable = true;
    private int philosopherUsingThisFork;

    public Fork(int id) {
        this.id = id;
    }

    public synchronized void take(int philosopher) {

        while (!forkIsOnTheTable) {
            try {
                wait();
            }
            catch (InterruptedException ignored) {}
        }

        philosopherUsingThisFork = philosopher;

        forkIsOnTheTable = false;

    }

    public synchronized void put(int philosopher) {

        if (!forkIsOnTheTable && philosopherUsingThisFork == philosopher) {
            forkIsOnTheTable = true;
            notify();
        }

    }

}
public class diningphilosopher {

    public static Philosopher[] createPhilosophers(int n) {

        Fork[] forks = new Fork[n];

        for (int i = 0; i < n; i++) {
            forks[i] = new Fork(i);
        }

        Philosopher[] philosophers = new Philosopher[n];

        for (int i = 0; i < n; i++) {

            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % n];

            philosophers[i] = new Philosopher(i, leftFork, rightFork);

        }

        return philosophers;

    }

    public static void main(String[] args) {

        Philosopher[] philosophers = createPhilosophers(8);

        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }

    }

}
