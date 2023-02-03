/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningphilosophers;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class DiningPhilosophers {

    public static void main(String[] args) {
        int philosophersNumber = 5;
        static Philosopher philosophers[] = new Philosopher[philosophersNumber];
        static Fork forks[] = new Fork[philosophersNumber];
    private int philosophersNumber;

    static class Fork {
        public Semaphore mutex = new Semaphore(1);

        void grab() {
            try {
                mutex.acquire();
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }

        void release() {
            mutex.release();
        }

        boolean isFree() {
            return mutex.availablePermits() > 0;
        }
    }

    static class Philosopher extends Thread {
        public int number;
        public Fork leftFork;
        public Fork rightFork;

        Philosopher(int num, Fork left, Fork right) {
            number = num;
            leftFork = left;
            rightFork = right;
        }

        public void run() {
            System.out.println("Hi! I'm philosopher #" + number);

            while (true) {
                leftFork.grab();
                System.out.println("Philosopher #" + number + " grabs left fork.");
                rightFork.grab();
                System.out.println("Philosopher #" + number + " grabs right fork.");
                eat();
                leftFork.release();
                System.out.println("Philosopher #" + number + " releases left fork.");
                rightFork.release();
                System.out.println("Philosopher #" + number + " releases right fork.");
            }
        }

        void eat() {
            try {
                int sleepTime = ThreadLocalRandom.current().nextInt(0, 500);
                System.out.println("Philosopher #" + number +" eats for " + sleepTime);
                Thread.sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Dining philosopher");
        for (int i = 0; i < philosophersNumber; i++) {
            forks[i] = new Fork();
        }
        for (int i = 0; i < philosophersNumber; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % philosophersNumber]);
            philosophers[i].start();
        }

        while (true) {
            try {
                // sleep 1 sec
                Thread.sleep(1000);
                // check for deadlock
                boolean deadlock = true;
                for (Fork f : forks) {
                    if (f.isFree()) {
                        deadlock = false;
                        break;
                    }
                }
                if (deadlock) {
                    Thread.sleep(1000);
                    System.out.println("Deadlock!");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        System.exit(0);
    }
    }
    
}
