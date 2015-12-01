package com.wang.thread;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class ThreadTool {
	
	private static ThreadTool threadTool;
	@Autowired private AsyncTaskExecutor asyncTaskExecutor;
	@PostConstruct
	public void init(){
		threadTool = this;
		threadTool.asyncTaskExecutor=this.asyncTaskExecutor;		
	}	
	public static AsyncTaskExecutor getAsyncTaskExecutor(){
		return threadTool.asyncTaskExecutor;
	}

}
