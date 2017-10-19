package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphBipartiteTest {

	private static final String TYPE_NAME = "bipartite";
	
	
	@Test ( expected = IllegalArgumentException.class )
	public void Jeu1()
	{
		GraphGenerator.bipartite(1, 1, 2);
	}
	
	@Test ( expected = IllegalArgumentException.class )
	public void Jeu2()
	{
		GraphGenerator.bipartite(1, 1, -1);
	}
	
	@Test 
	public void Jeu3()
	{
		final int nbOfVerticesFirst = 10;
		final int nbOfVerticesSecond = 10;
		final int nbOfEdges = 30;
		Graph graphGenerated = GraphGenerator.bipartite(nbOfVerticesFirst, nbOfVerticesSecond, nbOfEdges);
		assertEquals("Should be a graph of type bipartite.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVerticesFirst + nbOfVerticesSecond + " vertices created.", nbOfVerticesFirst + nbOfVerticesSecond, graphGenerated.V());
		assertEquals("Should have " + nbOfEdges + " edges created.", nbOfEdges, graphGenerated.E());
	}
}
