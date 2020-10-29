package Multithread;

public class Tortoise extends Rabbit {
    private static final int MILESTONE = 3;
    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "Tortoise");

    }

    public Thread getTortoise() {
        return tortoise;
    }

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
                    System.out.println("The tortoise is leading and hence is going to sleep!");

                case 4:
                    System.out.println("The tortoise has reached the finish line!");
                    break;
            }


        }
    }
}


