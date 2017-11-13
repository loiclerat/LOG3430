package unitTestTP5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.NoSuchElementException;

import org.junit.Test;

import edu.princeton.cs.algs4.Queue;

public class QueueTest {

	/**
	 * Tranche (first) 1 : Queue(), Constructeur -> peek(), Rapporteur -> enqueue(), Transformateur -> peek(), Rapporteur
	 * 						-> dequeue(), Transformateur -> peek(), Rapporteur -> isEmpty(), Autres -> iterator(), Autres
	 */
	@Test
	public void Test1(){
		Queue<Object> queue = new Queue<Object>();
		
		// peek()
		try{
			queue.peek();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// enqueue()
		Object obj1 = new Object();
		queue.enqueue(obj1);
		
		// peek()
		assertEquals("Should return the object : " + obj1 , obj1, queue.peek());
		
		// dequeue()
		assertEquals("Should return the object : " + obj1 , obj1, queue.dequeue());
		
		// peek()
		try{
			queue.peek();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// isEmpty()
		assertTrue("Should be empty", queue.isEmpty());
		
		// iterator()
		assertFalse("Should return an empty iterator", queue.iterator().hasNext());
	}
	
	/**
	 * Tranche (first) 2 : Queue(), Constructeur -> peek(), Rapporteur -> dequeue(), Transformateur -> peek(), Rapporteur -> enqueue(), Transformateur -> peek()
	 */
	@Test
	public void Test2(){
		Queue<Object> queue = new Queue<Object>();
		
		// peek()
		try{
			queue.peek();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// dequeue()
		try{
			queue.dequeue();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// peek()
		try{
			queue.peek();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// enqueue()
		Object obj1 = new Object();
		queue.enqueue(obj1);
		
		// peek()
		assertEquals("Should return the object : " + obj1 , obj1, queue.peek());
	}
	
	/**
	 * Tranche (last) 1 : Queue(), Constructeur -> getLast(), Rapporteur -> enqueue(), Transformateur -> getLast(), Rapporteur -> dequeue(), Transformateur -> getLast(), Rapporteur
	 */
	@Test
	public void Test3(){
		Queue<Object> queue = new Queue<Object>();
		
		// getLast()
		try{
			queue.getLast();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// enqueue()
		Object obj1 = new Object();
		queue.enqueue(obj1);
		
		// getLast()
		assertEquals("Should return the object : " + obj1 , obj1, queue.getLast());
		
		// dequeue()
		assertEquals("Should return the object : " + obj1 , obj1, queue.dequeue());
		
		// getLast()
		try{
			queue.getLast();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
	}
	
	/**
	 * Tranche (last) 2 : Queue(), Constructeur -> getLast(), Rapporteur -> dequeue(), Transformateur -> getLast(), Rapporteur -> enqueue(), Transformateur -> getLast(), Rapporteur
	 */
	@Test
	public void Test4(){
		Queue<Object> queue = new Queue<Object>();
		
		// getLast()
		try{
			queue.getLast();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// dequeue()
		try{
			queue.dequeue();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// getLast()
		try{
			queue.getLast();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// enqueue()
		Object obj1 = new Object();
		queue.enqueue(obj1);
		
		// peek()
		assertEquals("Should return the object : ", obj1, queue.getLast());
	}
	
	/**
	 * Tranche (n) 1 : Queue(), Constructeur -> size(), Rapporteur -> enqueue(), Transformateur -> size(), Rapporteur -> dequeue(), Transformateur -> size(), Rapporteur
	 */
	@Test
	public void Test5(){
		Queue<Object> queue = new Queue<Object>();
		
		// size()
		assertEquals("Should have a size = 0 ", 0, queue.size());
		
		// enqueue()
		Object obj1 = new Object();
		queue.enqueue(obj1);
		
		// size()
		assertEquals("Should have a size = 1 ", 1, queue.size());
		
		// dequeue()
		assertEquals("Should return the object : " + obj1 , obj1, queue.dequeue());
		
		// size()
		assertEquals("Should have a size = 0 ", 0, queue.size());
	}
	
	/**
	 * Tranche (n) 2 : Queue(), Constructeur -> size(), Rapporteur -> dequeue(), Transformateur -> size(), Rapporteur -> enqueue(), Transformateur -> size(), Rapporteur
	 */
	@Test
	public void Test6(){
		Queue<Object> queue = new Queue<Object>();
		
		// size()
		assertEquals("Should have a size = 0 ", 0, queue.size());
		
		// dequeue()
		try{
			queue.dequeue();
			fail("Should have thrown a NoSuchElementException");
		}catch(NoSuchElementException e){}
		catch(Exception e){
			fail("Wrong exception : " + e.getMessage());
		}
		
		// size()
		assertEquals("Should have a size = 0 ", 0, queue.size());
		
		// enqueue()
		queue.enqueue(new Object());
		
		// size()
		assertEquals("Should have a size = 1 ", 1, queue.size());
	}
	
	
	// Tests boîte blanche supplémentaires pour couvrir les arêtes manquantes
	
	/**
	 *  Arrête non testée lors de l'ajout d'un n-ième élément
	 */
	@Test
	public void Test7(){
		Queue<Object> queue = new Queue<Object>();

		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertEquals("Should have a size = 2.", 2, queue.size());
	}
	
	/**
	 *  Arrête non testée lors de l'ajout d'un dequeue() avec n>1 élément
	 */
	@Test
	public void Test8(){
		Queue<Object> queue = new Queue<Object>();
		
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(new Object());
		Object objectReturned = queue.dequeue();
		assertEquals("Should have a size = 1. ",  1, queue.size());
		assertEquals("Should return the object " + object, object, objectReturned);
	}	
	
	/**
	 *  Méthode toString() non testée
	 */
	@Test
	public void Test9(){
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		assertEquals("Should display : " + object.toString() + " ", object.toString() + " ", queue.toString());
	}	
}
