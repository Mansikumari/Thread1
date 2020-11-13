package Multithread;

import javax.swing.*;

public class Tortoise extends Thread {

        public static final int MILESTONES = 5;

        private final Thread tortoise;

        public Tortoise() {

            this.tortoise= new Thread(this, "tortoise");
        }

        public Thread getThread() {
            return tortoise;
        }

        @Override
        public void run() {
            for (int index = 0; index < MILESTONES; index++) {
                switch (index) {
                    case 0:
                        System.out.println("The tortoise has started from the start line!");
                        break;
                    case 1:
                        System.out.println("The tortoise has reached the Cool River!");
                        break;
                    case 2:
                        System.out.println("The tortoise has reached the Mountain Hill!");
                        break;
                    case 3:
                        System.out.println("The tortoise has reached the Big Oak Tree!");
                        break;
                    case 4:
                        System.out.println("the tortoise has reached the finished line!");
                        break;
                }

                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    System.err.println("The tortoise has lost the path!");
                }
            }


            JOptionPane.showConfirmDialog(
                    null,
                    "The tortoise has completed the race!",
                    "tortoise",
                    JOptionPane.OK_CANCEL_OPTION
            );
        }
    }




