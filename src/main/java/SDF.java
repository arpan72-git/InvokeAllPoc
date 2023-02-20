import java.time.Duration;
import java.time.Instant;

public class SDF {
    public static void main(String[] args) {

        new SDF().f();
        new Thread(() -> {
            Instant start = Instant.now();
//            long start = System.currentTimeMillis();
            try {
                Thread.sleep(5500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Instant end = Instant.now();
//            long end = System.currentTimeMillis();
            Duration t = Duration.between(start,end);
            System.out.println();
        }).start();

    }

    private void f(){
        String s = "adf";
        if (s!=null)
            return;
        try{
            String ss = "";
        }
        finally {
            System.out.println();
        }
    }
}
