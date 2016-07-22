package junyeong.yu.basic.ch03thread;

/**
 * Created by yujun-yeong on 16-07-21.
 */
public class Ch03Main {
    public static void main(String[] args) throws Exception {
        SharedResource sharedResource = new SharedResource();
        Actor actorA = new Actor("A");
        Actor actorB = new Actor("B");

        actorA.setSharedResource(sharedResource);
        actorB.setSharedResource(sharedResource);

        Thread threadA = new Thread(actorA);
        Thread threadB = new Thread(actorB);

        threadA.start();
        threadB.start();
    }

    private static class SharedResource {
        int countNoSync = 0;
        int countSync = 0;
        public void increaseNoSync() {
            countNoSync++;
        }
        public synchronized void increaseSync() {
            countSync++;
        }
    }
    private static class Actor implements Runnable {
        String name;
        SharedResource sharedResource;

        public Actor(String name) {
            this.name = name;
        }

        public void setSharedResource(SharedResource sharedResource) {
            this.sharedResource = sharedResource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50000000; i++) {
                //System.out.print(this.name + "-" + i + ",");
                //this.sharedResource.count++;
                //this.sharedResource.increaseNoSync();
                this.sharedResource.increaseSync();
                if (i % 10 == 0) {
                    //System.out.println();
                }
            }
            System.out.println("(" + name + ")" + " count :" + this.sharedResource.countNoSync);
            System.out.println("(" + name + ")" + " count :" + this.sharedResource.countSync);
        }
    }
}
