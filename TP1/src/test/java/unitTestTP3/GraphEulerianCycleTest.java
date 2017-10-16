package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphEulerianCycleTest {

	private static final String TYPE_NAME = "eulerianCycle";
	
	
	@Test ( expected = IllegalArgumentException.class )
	public void Jeu1()
	{
		GraphGenerator.eulerianCycle(-1, 30);
	}
	
	@Test ( expected = IllegalArgumentException.class )
	public void Jeu2()
	{
		GraphGenerator.eulerianCycle(10, -1);
	}

	@Test 
	public void Jeu3()
	{
		final int nbOfVertices = 10;
		final int nbOfEdges = 30;
		Graph graphGenerated = GraphGenerator.eulerianCycle(nbOfVertices, nbOfEdges);
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should have " + nbOfEdges + " edges created.", nbOfEdges, graphGenerated.E());
		assertEquals("Should be a graph of type simple.", TYPE_NAME, graphGenerated.getTypeName());
	}	
}
