**Thread pool module**

**Customizable properties**
threadPool.size: 10
threadPool.max_size: 15
threadPool.thread.timeout: 30

**Usage**
Include the following line in spring configure class
`@Import(value = { ThreadConfig.class })`

Then you can use thread pool in anywhere you like:
`@Autowired AsyncTaskExecutor asyncTaskExecutor;`
