import java.util.concurrent.Callable;

public class Task implements Callable<String> {

    String message;
    Long wait;

    public Task(String  message, Long wait){
        this.message = message;
        this.wait =wait;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(wait);
        return this.message;
    }
}
