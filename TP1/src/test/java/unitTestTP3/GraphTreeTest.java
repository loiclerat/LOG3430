package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphTreeTest {

	private static final String TYPE_NAME = "tree";

	@Test 
	public void Jeu1()
	{
		final int nbOfVertices = 1;
		Graph graphGenerated = GraphGenerator.tree(nbOfVertices);
		assertEquals("Should be a graph of type tree.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should have 0 edge created", 0, graphGenerated.E());
	}

	@Test 
	public void Jeu2()
	{
		final int nbOfVertices = 10;
		Graph graphGenerated = GraphGenerator.tree(nbOfVertices);
		assertEquals("Should be a graph of type tree.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should have " + (nbOfVertices - 1) + " edges created.", nbOfVertices - 1, graphGenerated.E());
	}
}
