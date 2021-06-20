package com.example.mece.job.executors;

import java.util.concurrent.Callable;

public class Task  implements Callable<String>{
	
	private int taskId;
	private String requestUri;
	
	
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String call() throws Exception {
		// TODO Auto-generated method stub
		
		//fetch the request json
		//post it to api
		//return result
		return null;
	}

}
