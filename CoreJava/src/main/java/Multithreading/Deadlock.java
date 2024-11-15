package Multithreading;

    class Pen {
        public synchronized void writeWithPenAndPaper(Paper paper) {
            System.out.println(Thread.currentThread().getName()+ " is using pen "+this+" and trying to get the Paper "+paper);
            paper.finishWriting();
        }
        public synchronized void finishWriting() {
            System.out.println(Thread.currentThread().getName() +" finished using Pen "+this);
        }
    }
    class Paper {

        public synchronized void writeWithPaperAndPen(Pen pen) {
            System.out.println(Thread.currentThread().getName()+ " is using paper "+this+" and trying to get the Pen "+pen);
            pen.finishWriting();
        }
        public synchronized void finishWriting() {
            System.out.println(Thread.currentThread().getName() +" finished using Paper "+this);
        }

    }

    class Task1 implements Runnable {
        private Pen pen;
        private Paper paper;

        public Task1(Pen pen, Paper paper) {
            this.pen = pen;
            this.paper = paper;
        }

        @Override
        public void run() {
            pen.writeWithPenAndPaper(paper); //This thread locks pen and tries to acquire Paper lock
        }
    }

    class Task2 implements Runnable {
        private Pen pen;
        private Paper paper;

        public Task2(Pen pen, Paper paper) {
            this.pen = pen;
            this.paper = paper;
        }

        @Override
        public void run() {
//            synchronized(pen){ // To solve this deadlock synchronize this task so that paper will only lock if it has the pen lock.
                paper.writeWithPaperAndPen(pen); //This thread locks paper and tries to acquire pen lock
//            }
        }
    }

    public class Deadlock {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();

    }
}
