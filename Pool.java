// get chunks of memory from the heap and never return them
class Pool
{
	java.util.Deque<Chunk> stack = new java.util.ArrayDeque<Chunk>();
	Chunk allocate()
	{
		if( stack.size() > 0 )
			return stack.pop();
		return new Chunk();
	}
	void deallocate(Chunk iovec)
	{
		stack.push(iovec);
	}
}
