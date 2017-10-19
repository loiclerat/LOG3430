package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphCycleTest {

	private static final String TYPE_NAME = "cycle";
	
	@Test 
	public void Jeu1()
	{
		final int nbOfVertices = 10;
		Graph graphGenerated = GraphGenerator.cycle(nbOfVertices);
		assertEquals("Should be a graph of type cycle.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should have " + nbOfVertices + " edges created.", nbOfVertices, graphGenerated.E());
	}
}
