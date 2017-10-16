package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphCompleteBipartiteTest {

	private static final String TYPE_NAME = "completeBipartite";
	
	/**
	 * Return the maximum number of edges that could be created for a regular graph with a given number of vertices
	 */
	private int maxEdges(int nbVerticesA, int nbVerticesB)
	{
		return nbVerticesA*nbVerticesB;
	}
	
	
	@Test 
	public void Jeu1()
	{
		final int nbOfVerticesFirst = 5;
		final int nbOfVerticesSecond = 6;
		Graph graphGenerated = GraphGenerator.completeBipartite(nbOfVerticesFirst, nbOfVerticesSecond);
		assertEquals("Should have " + nbOfVerticesFirst + nbOfVerticesSecond + " vertices created.", nbOfVerticesFirst + nbOfVerticesSecond, graphGenerated.V());
		assertEquals("Should be a graph of type simple.", TYPE_NAME, graphGenerated.getTypeName());
		int maxEdges = maxEdges(nbOfVerticesFirst, nbOfVerticesSecond);
		assertTrue("Should have a number of edges between 0 and " + maxEdges + ".", graphGenerated.E() >= 0 && graphGenerated.E() <= maxEdges);
	}
}
