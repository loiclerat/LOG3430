package unitTestTP4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.princeton.cs.algs4.Queue;

import java.util.NoSuchElementException;

public class QueueTest {
	
	/**
	 * S1 -> size() -> S1
	 */
	@Test
	public void Test1()
	{
		Queue<Object> queue = new Queue<Object>();
		assertEquals("Should have a size = 0.", 0, queue.size());
	}
	
	/**
	 * S1 -> isEmpty() -> S1
	 */
	@Test
	public void Test2()
	{
		Queue<Object> queue = new Queue<Object>();
		assertEquals("Should be empty. ", true, queue.isEmpty());
	}
	
	/**
	 * S1 -> dequeue() -> Error
	 */
	@Test ( expected = NoSuchElementException.class )
	public void Test3()
	{
		Queue<Object> queue = new Queue<Object>();
		queue.dequeue();
	}
	
	/**
	 * S1 -> peak() -> Error
	 */
	@Test ( expected = NoSuchElementException.class )
	public void Test4()
	{
		Queue<Object> queue = new Queue<Object>();
		queue.peek();
	}
	
	/**
	 * S1 -> enqueue() -> S2 -> size() -> S2
	 */
	@Test
	public void Test5()
	{
		Queue<Object> queue = new Queue<Object>();
		queue.enqueue(new Object());
		assertEquals("Should have a size = 1.", 1, queue.size());
	}
	
	/**
	 * S1 -> enqueue() -> S2 -> isEmpty() -> S2
	 */
	@Test
	public void Test6()
	{
		Queue<Object> queue = new Queue<Object>();
		queue.enqueue(new Object());
		assertEquals("Should not be empty. ", false, queue.isEmpty());
	}
	
	/**
	 * S1 -> enqueue() -> S2 -> peek() -> S2
	 */
	@Test
	public void Test7()
	{
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		assertEquals("Should return the object " + object.toString(), object, queue.peek());
	}
	
	/**
	 * S1 -> enqueue() -> S2 -> enqueue() -> S2
	 */
	@Test
	public void Test8()
	{
		Queue<Object> queue = new Queue<Object>();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertEquals("Should have a size = 2.", 2, queue.size());
	}
	
	/**
	 * S1 -> enqueue() -> S2 -> dequeue() -> S1
	 */
	@Test
	public void Test9()
	{
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		Object objectReturned = queue.dequeue();
		assertEquals("Should return the object " + object, object, objectReturned);
		assertEquals("Should have a size = 0.", 0, queue.size());
	}
	
	/**
	 * S1 -> enqueue() -> S2 -> enqueue() -> S2 -> dequeue() -> S2
	 */
	@Test
	public void Test10()
	{
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(new Object());
		Object objectReturned = queue.dequeue();
		assertEquals("Should have a size = 1. ",  1, queue.size());
		assertEquals("Should return the object " + object, object, objectReturned);
	}	
}

