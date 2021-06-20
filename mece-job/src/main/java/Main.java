import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.example.mece.job.executors.Task;

public class Main {

	public static void main(String[] args) {
		ExecutorService executor =Executors.newFixedThreadPool(4);
		var task = new Task();
		task.setTaskId(1);
		List<Task> futureTasks = new ArrayList<>();
		futureTasks.add(task);
		List<Future<String>> result ;
		try {
			result = executor.invokeAll(futureTasks);
			result.stream().filter(r->r.isDone()).map(r->{
				try {
					return r.get();
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return "Exception in executing task";
				}
			}).forEach(System.out::println);
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}
		
	}
}
