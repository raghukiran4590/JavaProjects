package Multithreading;

 class SharedResource {

     private int data;
     private boolean hasData;

     public int getData() {
         return data;
     }

     public void setData(int data) {
         this.data = data;
     }

     public boolean isHasData() {
         return hasData;
     }

     public void setHasData(boolean hasData) {
         this.hasData = hasData;
     }

     public synchronized void produce(int value) {
         while (hasData) {
             try {
                 wait();
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
         data = value;
         System.out.println("Produced Data : " + value);
         hasData = true;
         notify();
     }

     public synchronized int consume() {
         while (!hasData) {
             try {
                 wait();
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
         hasData = false;
         System.out.println("Consumed Data : " + data);
         notify();
         return data;
     }
 }

    class Producer implements Runnable {

        private SharedResource resource;

        public Producer(SharedResource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                resource.produce(i);
            }
        }
    }

    class Consumer implements Runnable {

        private SharedResource resource;

        public Consumer(SharedResource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                resource.consume();
            }
        }
    }

    public class ThreadCommunication {

        public static void main(String[] args) {
            SharedResource sharedResource = new SharedResource();

            Thread producerThread = new Thread(new Producer(sharedResource));
            Thread consumerThread = new Thread(new Consumer(sharedResource));

            producerThread.start();
            consumerThread.start();
        }
    }
