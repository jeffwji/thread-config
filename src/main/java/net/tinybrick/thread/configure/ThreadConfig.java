package net.tinybrick.thread.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAutoConfiguration
@PropertySource(value = "classpath:config/thread.properties")
public class ThreadConfig {
	/**
	 * Thread pool
	 */
	@Value("${threadPool.size:10}") int threadPool_size;
	@Value("${threadPool.max_size:15}") int threadPool_max_size;
	@Value("${threadPool.thread.timeout:30}") int timeout;

	/**
	 * 获取异步线程池
	 */
	@Bean
	public AsyncTaskExecutor getAsyncTaskExecutor() {
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setCorePoolSize(threadPool_size);
		threadPoolTaskExecutor.setMaxPoolSize(threadPool_max_size);
		return threadPoolTaskExecutor;
	}

}
