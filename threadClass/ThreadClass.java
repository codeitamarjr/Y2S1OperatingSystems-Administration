package threadClass;

public class ThreadClass {

    public static void threadClass() {

        for (;;) {
            int randNumber = (int) Math.floor(Math.random() * 90000 + 10000);
            System.out.println(randNumber);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {

            }
        }
    }
}
