package unitTestTP6;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.BipartiteX;
import edu.princeton.cs.algs4.BipartiteXExtended;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntegrationTest {
	private static final String NEWLINE = System.getProperty("line.separator");
	
	
	// === Niveau 1 : Bag, Queue, Stack ===
	
	// == Bag ==
	
	/**
	 * Classe Bag - méthode Bag()
	 */
	@Test
	public void test01(){
		Bag<Object> bag = new Bag<Object>();
		assertEquals("Should create an instance of class : " + Bag.class + " .", Bag.class, bag.getClass());
	}
	
	/**
	 * Classe Bag - méthode isEmpty()
	 */
	@Test
	public void test02(){
		Bag<Object> bag = new Bag<Object>();
		assertTrue("Should be empty", bag.isEmpty());
	}
	
	/**
	 * Classe Bag - méthode size()
	 */
	@Test
	public void test03(){
		Bag<Object> bag = new Bag<Object>();
		assertEquals("Should have 0 elements.", 0, bag.size());
	}

	/**
	 * Classe Bag - méthode add()
	 */
	@Test
	public void test04(){
		Bag<Object> bag = new Bag<Object>();
		bag.add(new Object());
		assertEquals("Should have 1 element.", 1, bag.size());
	}
	
	/**
	 * Classe Bag - méthode iterator()
	 */
	@Test
	public void test05(){
		Bag<Object> bag = new Bag<Object>();
		Object ob1 = new Object();
		bag.add(ob1);
		assertEquals("Should return an iterator on the object : "+ ob1 + ".", ob1, bag.iterator().next());
	}
	
	
	
	// == Queue ==
	
	/**
	 * Classe Queue - méthode Queue()
	 */
	@Test
	public void test06(){
		Queue<Object> queue = new Queue<Object>();
		assertEquals("Should create an instance of class : " + Queue.class + " .", Queue.class, queue.getClass());
	}
	
	/**
	 * Classe Queue - méthode isEmpty()
	 */
	@Test
	public void test07(){
		Queue<Object> queue = new Queue<Object>();
		assertTrue("Should be empty", queue.isEmpty());
	}
	
	/**
	 * Classe Queue - méthode size()
	 */
	@Test
	public void test08(){
		Queue<Object> queue = new Queue<Object>();
		assertEquals("Should have 0 elements.", 0, queue.size());
	}

	/**
	 * Classe Queue - méthode enqueue()
	 */
	@Test
	public void test09(){
		Queue<Object> queue = new Queue<Object>();
		queue.enqueue(new Object());
		assertEquals("Should have 1 element.", 1, queue.size());
	}
	
	/**
	 * Classe Queue - méthode dequeue()
	 */
	@Test
	public void test10(){
		Queue<Object> queue = new Queue<Object>();
		queue.enqueue(new Object());
		queue.dequeue();
		assertEquals("Should have 0 element.", 0, queue.size());
	}
	
	/**
	 * Classe Queue - méthode peek()
	 */
	@Test
	public void test11(){
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		assertEquals("Should return the object : " + object + " .", object, queue.peek());
	}
	
	/**
	 * Classe Queue - méthode toString()
	 */
	@Test
	public void test12(){
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		assertEquals("Should display : " + object.toString() + " ", object.toString() + " ", queue.toString());
	}
	
	/**
	 * Classe Queue - méthode getLast()
	 */
	@Test
	public void test13(){
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		assertEquals("Should return the object : " + object + " .", object, queue.getLast());
	}
	
	/**
	 * Classe Queue - méthode iterator()
	 */
	@Test
	public void test14(){
		Queue<Object> queue = new Queue<Object>();
		Object object = new Object();
		queue.enqueue(object);
		assertEquals("Should return an iterator on the object : "+ object + ".", object, queue.iterator().next());
	}


	
	// == Stack ==
	
	/**
	 * Classe Stack - méthode Stack()
	 */
	@Test
	public void test15(){
		Stack<Object> stack = new Stack<Object>();
		assertEquals("Should create an instance of class : " + Stack.class + " .", Stack.class, stack.getClass());
	}
	
	/**
	 * Classe Stack - méthode isEmpty()
	 */
	@Test
	public void test16(){
		Stack<Object> stack = new Stack<Object>();
		assertTrue("Should be empty", stack.isEmpty());
	}
	
	/**
	 * Classe Stack - méthode size()
	 */
	@Test
	public void test17(){
		Stack<Object> stack = new Stack<Object>();
		assertEquals("Should have 0 elements.", 0, stack.size());
	}

	/**
	 * Classe Stack - méthode push()
	 */
	@Test
	public void test18(){
		Stack<Object> stack = new Stack<Object>();
		stack.push(new Object());
		assertEquals("Should have 1 element.", 1, stack.size());
	}
	
	/**
	 * Classe Stack - méthode pop()
	 */
	@Test
	public void test19(){
		Stack<Object> stack = new Stack<Object>();
		Object object = new Object();
		stack.push(object);
		assertEquals("Should return the object : " + object + " .", object, stack.pop());
		assertEquals("Should have 0 element.", 0, stack.size());
	}
	
	/**
	 * Classe Stack - méthode peek()
	 */
	@Test
	public void test20(){
		Stack<Object> stack = new Stack<Object>();
		Object object = new Object();
		stack.push(object);
		assertEquals("Should return the object : " + object + " .", object, stack.peek());
	}
	
	/**
	 * Classe Stack - méthode toString()
	 */
	@Test
	public void test21(){
		Stack<Object> stack = new Stack<Object>();
		Object object = new Object();
		stack.push(object);
		assertEquals("Should display : " + object.toString() + " ", object.toString() + " ", stack.toString());
	}
	
	
	/**
	 * Classe Stack - méthode iterator()
	 */
	@Test
	public void test22(){
		Stack<Object> stack = new Stack<Object>();
		Object object = new Object();
		stack.push(object);
		assertEquals("Should return an iterator on the object : "+ object + ".", object, stack.iterator().next());
	}
	
	
	
	// === Niveau 2 : Graph ===
	
	/**
	 * Classe Graph - méthode Graph(int V)
	 */
	@Test
	public void test23(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		assertEquals("Should create an instance of class : " + Graph.class + " .", Graph.class, graph.getClass());
		assertEquals("Should have " + nbVertices + " vertices .", nbVertices, graph.V());
	}
	
	/**
	 * Classe Graph - méthode Graph(Graph G)
	 */
	@Test
	public void test24(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		Graph graph1 = new Graph(graph);
		assertEquals("Should create an instance of class : " + Graph.class + " .", Graph.class, graph1.getClass());
		assertEquals("Should have " + nbVertices + " vertices .", nbVertices, graph1.V());
	}
	
	/**
	 * Classe Graph - méthode V()
	 */
	@Test
	public void test25(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		assertEquals("Should have " + nbVertices + " vertices .", nbVertices, graph.V());
	}
	
	/**
	 * Classe Graph - méthode E()
	 */
	@Test
	public void test26(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		assertEquals("Should have a 0 edges .", 0, graph.E());
	}
	
	/**
	 * Classe Graph - méthode addEdge()
	 */
	@Test
	public void test27(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		graph.addEdge(1, 2);
		assertEquals("Should have 1 edge .", 1, graph.E());
	}
	
	/**
	 * Classe Graph - méthode adj()
	 */
	@Test
	public void test28(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		graph.addEdge(1, 2);
		assertEquals("Should have the adjacent vertex : 2 .", new Integer(2), graph.adj(1).iterator().next());
	}
	
	/**
	 * Classe Graph - méthode degree()
	 */
	@Test
	public void test29(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		assertEquals("Should have a degree of 2 .", 2, graph.degree(1));
	}
	
	/**
	 * Classe Graph - méthode getTypeName()
	 */
	@Test
	public void test30(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		assertNull("Should be null.", graph.getTypeName());
	}
	
	/**
	 * Classe Graph - méthode setTypeName()
	 */
	@Test
	public void test31(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		graph.setTypeName("typeTest");
		assertEquals("Should be a graph of type typeTest.", "typeTest", graph.getTypeName());
	}
	
	/**
	 * Classe Graph - méthode toString()
	 */
	@Test
	public void test32(){
		final int nbVertices = 2;
		Graph graph = new Graph(nbVertices);
		graph.addEdge(0, 1);
		
		StringBuilder s = new StringBuilder();
		s.append(nbVertices + " vertices, " + 1 + " edges " + NEWLINE);
		s.append("0: ");
		s.append("1 ");
		s.append(NEWLINE);
		s.append("1: ");
		s.append("0 ");
		s.append(NEWLINE);
		
		assertEquals("Should display : " + s.toString(), s.toString(), graph.toString());
	}
	
	
	
	// === Niveau 3 : BibartiteX ===
	
	/**
	 * Classe BipartiteX - méthode BipartiteX(Graph g)
	 */
	@Test
	public void test33(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		BipartiteX bip = new BipartiteX(graph);
		assertEquals("Should create an instance of class : " + BipartiteX.class + " .", BipartiteX.class, bip.getClass());
	}
	
	/**
	 * Classe BipartiteX - méthode isBipartite()
	 */
	@Test
	public void test34(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		BipartiteX bip = new BipartiteX(graph);
		assertFalse("Should not be bipartite.", bip.isBipartite());
	}
	
	/**
	 * Classe BipartiteX - méthode color()
	 */
	@Test ( expected = UnsupportedOperationException.class )
	public void test35(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		BipartiteX bip = new BipartiteX(graph);
		bip.color(2);
	}
	
	/**
	 * Classe BipartiteX - méthode oddCycle()
	 */
	@Test
	public void test36(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		BipartiteX bip = new BipartiteX(graph);
		assertNull(bip.oddCycle());
	}
	
	
	
	
	// === Niveau 4 : BipartiteXExtended ===
	
	/**
	 * Classe BipartiteXExtended - méthode BipartiteXExtended(Graph g)
	 */
	@Test
	public void test37(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		BipartiteXExtended bip = new BipartiteXExtended(graph);
		assertEquals("Should create an instance of class : " + BipartiteXExtended.class + " .", BipartiteXExtended.class, bip.getClass());
	}
	
	/**
	 * Classe BipartiteXExtended - méthode getVerticesWithAnEdgeToB()
	 */
	@Test
	public void test38(){
		final int nbVertices = 5;
		Graph graph = new Graph(nbVertices);
		graph.addEdge(1, 2);
		BipartiteXExtended bip = new BipartiteXExtended(graph);
		assertEquals("Should return : 1 .", new Integer(1), bip.getVerticesWithAnEdgeToB(2).get(0));
	}
	
}
