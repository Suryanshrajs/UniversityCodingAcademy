public class MT {

    int val;

    MT() {
        val = 0;
    }

    public static void main(String args[]) {
        MT mt = new MT();
        Thread[] threads = new Thread[1000];

        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                System.out.println("Hello");
            });
            threads[i].start();
        }

    }

    public void increment() {
        val++;
    }
}