package unitTestTP2;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphSimpleTest {
	
	private static final String SIMPLE_TYPE_NAME = "simple";
	
	/**
	 * Return the maximum number of edges that could be created for a regular graph with a given number of vertices
	 */
	private int maxEdges(int nbVertices)
	{
		return nbVertices*(nbVertices-1)/2;
	}
	
	
	//=====================================================
	// Test catégorie-partition Each-Choice (EC)
	
	/**
	 * Test with invalid value for nb of vertices and probability -> *Error*
	 *//*
	@Test ( expected = IllegalArgumentException.class )
	public void EC1()
	{
		GraphGenerator.simple(-2, -0.2);
	}
	
	*//**
	 * Test with valid value for nb of vertices and probability -> *Succes*
	 *//*
	@Test 
	public void EC2()
	{
		final int nbOfVertices = 40;
		Graph graphGenerated = GraphGenerator.simple(40, 0.3);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should be a graph of type simple.", SIMPLE_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVertices);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	*//**
	 * Test with valid value for nb of vertices and invalid probability -> *Error*
	 *//*
	@Test ( expected = IllegalArgumentException.class )
	public void EC3()
	{
		GraphGenerator.simple(5, 2.0);
	}*/
	
	

	//=====================================================
	// Test catégorie-partition All-Combinations (AC)
	
	/**
	 * Test with invalid value for nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC1()
	{
		GraphGenerator.simple(-2, -0.5);
	}
	
	/**
	 * Test with invalid value for nb of vertices and valid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC2()
	{
		GraphGenerator.simple(-2, 0.5);
	}
	
	/**
	 * Test with invalid value for nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC3()
	{
		GraphGenerator.simple(-2, 2.0);
	}
	
	/**
	 * Test with valid value for nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC4()
	{
		GraphGenerator.simple(10, -0.5);
	}
	
	/**
	 * Test with valid value for nb of vertices and valid probability -> *Succes*
	 */
	@Test
	public void AC5()
	{
		final int nbOfVertices = 10;
		Graph graphGenerated = GraphGenerator.simple(nbOfVertices, 0.5);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should be a graph of type simple.", SIMPLE_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVertices);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	/**
	 * Test with valid value for nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC6()
	{
		GraphGenerator.simple(10, 2.0);
	}
}
