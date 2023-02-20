import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ABC {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Task> lists = new ArrayList<>();
        lists.add(new Task("ABC", 5000L));
        lists.add(new Task("DEF",1000L));
        lists.add(new Task("GHI",2000L));
        lists.add(new Task("JKL",500L));


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<String >>  f = executorService.invokeAll(lists);

        for (Future<String > ff : f){
            System.out.println(ff.isDone());
            System.out.println(ff.get());
        }

        executorService.shutdown();
    }


}
