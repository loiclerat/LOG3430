package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphSimpleTest {

	private static final String TYPE_NAME = "simple";
		

	@Test ( expected = IllegalArgumentException.class )
	public void Jeu1()
	{
		GraphGenerator.simple(0, 1);
	}
	
	@Test ( expected = IllegalArgumentException.class )
	public void Jeu2()
	{
		GraphGenerator.simple(2, -1);
	}
	
	@Test 
	public void Jeu3()
	{
		final int nbOfVertices = 10;
		final int nbOfEdges = 30;
		Graph graphGenerated = GraphGenerator.simple(nbOfVertices, nbOfEdges);
		assertEquals("Should be a graph of type simple.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should have " + nbOfEdges + " edges created.", nbOfEdges, graphGenerated.E());
	}
}
