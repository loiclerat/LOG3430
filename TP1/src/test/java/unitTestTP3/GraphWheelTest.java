package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphWheelTest {
	
	private static final String TYPE_NAME = "wheel";
	
	/**
	 * Return the number of edges that are created for a wheel graph with a given number of vertices.
	 */
	private int maxEdges(int nbVertices)
	{
		return 2*(nbVertices-1);
	}
	
	
	@Test ( expected = IllegalArgumentException.class )
	public void Jeu1()
	{
		GraphGenerator.wheel(-1);
	}

	@Test 
	public void Jeu2()
	{
		final int nbOfVertices = 10;
		Graph graphGenerated = GraphGenerator.wheel(nbOfVertices);
		assertEquals("Should be a graph of type wheel.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		int maxEdges = maxEdges(nbOfVertices);
		assertEquals("Should have " + maxEdges + " edges created.", maxEdges, graphGenerated.E());
	}
}
