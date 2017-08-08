package com.htche.thread.test.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.tinybrick.thread.configure.ThreadConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { ThreadConfig.class })
public class TestThread {
	@Autowired AsyncTaskExecutor asyncTaskExecutor;

	@Test
	public void test1() {

		asyncTaskExecutor.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread 1");
			}
		});

		asyncTaskExecutor.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread 2");
			}
		});
		System.out.println("sss");

	}

}
