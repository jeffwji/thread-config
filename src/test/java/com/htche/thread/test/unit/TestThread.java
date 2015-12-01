package com.htche.thread.test.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wang.thread.ThreadTool;
import com.wang.thread.configure.ThreadConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {ThreadConfig.class})
public class TestThread {
	@Autowired  AsyncTaskExecutor asyncTaskExecutor;
	@Test
	public void test1(){
		
		AsyncTaskExecutor executor=ThreadTool.getAsyncTaskExecutor();
		executor.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread 1");
			}
		});
		AsyncTaskExecutor executor1=ThreadTool.getAsyncTaskExecutor();
		executor1.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread 2");
			}
		});
		System.out.println("sss");
		
	}

}
