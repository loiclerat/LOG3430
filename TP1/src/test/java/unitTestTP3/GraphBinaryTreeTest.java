package unitTestTP3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphBinaryTreeTest {

	private static final String TYPE_NAME = "binaryTree";
	
	@Test 
	public void Jeu1()
	{
		final int nbOfVertices = 10;
		Graph graphGenerated = GraphGenerator.binaryTree(nbOfVertices);
		assertEquals("Should be a graph of type binaryTree.", TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
		assertEquals("Should have " + (nbOfVertices - 1) + " edges created.", nbOfVertices - 1, graphGenerated.E());
	}
}
