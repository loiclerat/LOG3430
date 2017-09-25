package unitTestTP2;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphRegularTest {
	
private static final String REGULAR_TYPE_NAME = "regular";
	
	private int maxEdges(int nbVertices, int degree)
	{
		return nbVertices*degree/2;
	}
	
	
	//=====================================================
	// Test catégorie-partition Each-Choice (EC)
	
	/**
	 * Test with invalid value for nb of vertices and invalid degree -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void EC1()
	{
		GraphGenerator.regular(-2, -2);
	}
	
	/**
	 * Test with valid value for nb of vertices and valid degree -> *Succes*
	 */
	@Test
	public void EC2()
	{
		final int nbOfVertices = 40;
		final int degree = 5;
		Graph graphGenerated = GraphGenerator.regular(nbOfVertices, degree);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should be a graph of type regular.", REGULAR_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVertices, degree);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	/**
	 * Test with valid value for nb of vertices and valid degree -> *Succes*
	 */
	@Test
	public void EC3()
	{
		final int nbOfVertices = 35;
		final int degree = 10;
		Graph graphGenerated = GraphGenerator.regular(nbOfVertices, degree);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should be a graph of type regular.", REGULAR_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVertices, degree);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	

	//=====================================================
	// Test catégorie-partition All-Combinations (AC)

	/**
	 * Test with invalid value for nb of vertices and invalid degree -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC1()
	{
		GraphGenerator.regular(-2, -1);
	}
	
	/**
	 * Test with invalid value for nb of vertices and valid degree -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC2()
	{
		GraphGenerator.regular(-2, 4);
	}
	
	/**
	 * Test with invalid value for nb of vertices and valid degree -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC3()
	{
		GraphGenerator.regular(-2, 5);
	}
	
	/**
	 * Test with valid value for nb of vertices and invalid degree -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC4()
	{
		GraphGenerator.regular(6, -1);
	}
	
	/**
	 * Test with valid value for nb of vertices and valid degree -> *Succes*
	 */
	@Test 
	public void AC5()
	{
		final int nbOfVertices = 6;
		final int degree = 4;
		Graph graphGenerated = GraphGenerator.regular(nbOfVertices, degree);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should be a graph of type regular.", REGULAR_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVertices, degree);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	/**
	 * Test with valid value for nb of vertices and valid degree -> *Succes*
	 */
	@Test 
	public void AC6()
	{
		final int nbOfVertices = 6;
		final int degree = 5;
		Graph graphGenerated = GraphGenerator.regular(nbOfVertices, degree);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should be a graph of type regular.", REGULAR_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVertices, degree);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	/**
	 * Test with valid value for nb of vertices and invalid degree -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC7()
	{
		GraphGenerator.regular(5, -1);
	}
	
	/**
	 * Test with valid value for nb of vertices and valid degree -> *Succes*
	 */
	@Test
	public void AC8()
	{
		final int nbOfVertices = 5;
		final int degree = 4;
		Graph graphGenerated = GraphGenerator.regular(nbOfVertices, degree);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should be a graph of type regular.", REGULAR_TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVertices, degree);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
	
	/**
	 * Test with valid value for nb of vertices and valid degree but the multiplication is odd -> *Error*
	 */
	@Test ( expected = IllegalArgumentException.class )
	public void AC9()
	{
		GraphGenerator.regular(5, 3);
	}
}
