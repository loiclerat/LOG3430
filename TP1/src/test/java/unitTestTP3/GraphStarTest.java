package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphStarTest {

	private static final String TYPE_NAME = "star";
	
	@Test ( expected = IllegalArgumentException.class )
	public void Jeu1()
	{
		GraphGenerator.star(-1);
	}

	@Test 
	public void Jeu3()
	{
		final int nbOfVertices = 10;
		Graph graphGenerated = GraphGenerator.star(nbOfVertices);
		assertEquals("Should be a graph of type star.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should have " + (nbOfVertices - 1) + " edges created.", nbOfVertices - 1, graphGenerated.E());
	}	
}
