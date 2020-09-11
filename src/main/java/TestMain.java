import java.util.Random;

public class TestMain {
    public static void main(String[] args) {
        Random ran = new Random();
        for (int i=0; i<100; i++) {

            System.out.println(ran.nextInt(5));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
