//https://www.baeldung.com/java-concurrency-jc-tools
      //
class Main
{
	public static void main(String[] args) /*mention checked exception from join(), mandatory:*/ throws InterruptedException
	{
		System.err.println("hello world");
		var pool = new Pool();

		var processor = new Thread(() ->
		{
			System.err.println("hello from thread");
		});
		processor.start();

		for(int i=0; i<10; i++)
		{
			// get a memory chunk
			var chunk = pool.allocate();

			// put a message in the chunk
			var msg = "howdy".toCharArray();
			assert msg.length < chunk.capacity;
			System.arraycopy(msg, 0, chunk.data, 0, msg.length);
			chunk.used = msg.length;

		}

		processor.join();
	}
}
