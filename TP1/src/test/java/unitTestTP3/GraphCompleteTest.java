package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphCompleteTest {

	private static final String TYPE_NAME = "complete";
	
	/**
	 * Return the maximum number of edges that could be created for a regular graph with a given number of vertices
	 */
	private int maxEdges(int nbVertices)
	{
		return nbVertices*(nbVertices-1)/2;
	}
	
	
	@Test 
	public void Jeu1()
	{
		final int nbOfVertices = 10;
		Graph graphGenerated = GraphGenerator.complete(nbOfVertices);
		assertEquals("Should be a graph of type complete.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		int maxEdges = maxEdges(nbOfVertices);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
}
