package unitTestTP2;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphBipartiteTest {
	
	private static final String BIPARTITE_TYPE_NAME = "bipartite";
	
	private int maxEdges(int nbVerticesA, int nbVerticesB)
	{
		return nbVerticesA*nbVerticesB;
	}
	
	
	//=====================================================
	// Test catégorie-partition Each-Choice (EC)
	
	/**
	 * Test with invalid value for first nb of vertices, invalid second nb of vertices and valid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void EC1()
	{
		GraphGenerator.bipartite(-2, -2, 0.2);
	}
	
	/**
	 * Test with valid value for first nb of vertices, valid second nb of vertices and valid probability -> *Succes*
	 */
	@Test
	public void EC2()
	{
		final int nbOfVerticesFirst = 40;
		final int nbOfVerticesSecond = 10;
		Graph graphGenerated = GraphGenerator.bipartite(nbOfVerticesFirst, nbOfVerticesSecond, 0.3);
		assertEquals("Should have " + nbOfVerticesFirst + nbOfVerticesSecond + " vertices created.", nbOfVerticesFirst + nbOfVerticesSecond, graphGenerated.V());
		assertEquals("Should be a graph of type bipartite.", BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVerticesFirst, nbOfVerticesSecond);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	/**
	 * Test with valid value for first nb of vertices, valid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void EC3()
	{
		GraphGenerator.bipartite(-2, 10, 2.0);
	}
	

	//=====================================================
	// Test catégorie-partition All-Combinations (AC)
	
	/**
	 * Test with invalid value for first nb of vertices, invalid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC1()
	{
		GraphGenerator.bipartite(-2, -2, -0.2);
	}
	
	/**
	 * Test with invalid value for first nb of vertices, invalid second nb of vertices and valid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC2()
	{
		GraphGenerator.bipartite(-2, -2, 0.4);
	}
	
	/**
	 * Test with invalid value for first nb of vertices, invalid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC3()
	{
		GraphGenerator.bipartite(-2, -2, 2.0);
	}
	
	/**
	 * Test with invalid value for first nb of vertices, valid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC4()
	{
		GraphGenerator.bipartite(-2, 10, -0.2);
	}
	
	/**
	 * Test with invalid value for first nb of vertices, valid second nb of vertices and valid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC5()
	{
		GraphGenerator.bipartite(-2, 10, 0.4);
	}
	
	/**
	 * Test with invalid value for first nb of vertices, valid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC6()
	{
		GraphGenerator.bipartite(-2, 10, 2.0);
	}
	
	/**
	 * Test with valid value for first nb of vertices, invalid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC7()
	{
		GraphGenerator.bipartite(40, -2, -0.2);
	}
	
	/**
	 * Test with valid value for first nb of vertices, invalid second nb of vertices and valid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC8()
	{
		GraphGenerator.bipartite(40, -2, 0.4);
	}
	
	/**
	 * Test with valid value for first nb of vertices, invalid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC9()
	{
		GraphGenerator.bipartite(40, -2, 2.0);
	}
	
	/**
	 * Test with valid value for first nb of vertices, valid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC10()
	{
		GraphGenerator.bipartite(40, 10, -0.2);
	}
	
	/**
	 * Test with valid value for first nb of vertices, valid second nb of vertices and valid probability -> *Succes*
	 */
	@Test
	public void AC11()
	{
		final int nbOfVerticesFirst = 40;
		final int nbOfVerticesSecond = 10;
		Graph graphGenerated = GraphGenerator.bipartite(nbOfVerticesFirst, nbOfVerticesSecond, 0.4);
		assertEquals("Should have " + nbOfVerticesFirst + nbOfVerticesSecond + " vertices created.", nbOfVerticesFirst + nbOfVerticesSecond, graphGenerated.V());
		assertEquals("Should be a graph of type bipartite.", BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVerticesFirst, nbOfVerticesSecond);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	/**
	 * Test with valid value for first nb of vertices, valid second nb of vertices and invalid probability -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC12()
	{
		GraphGenerator.bipartite(40, 10, 2.0);
	}
}
