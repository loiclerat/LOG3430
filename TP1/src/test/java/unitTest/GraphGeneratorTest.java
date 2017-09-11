package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorTest {

	private static final String SIMPLE_TYPE_NAME = "simple";
	private static final String COMPLETE_TYPE_NAME = "complete";
	private static final String COMPLETE_BIPARTITE_TYPE_NAME = "completeBipartite";
	private static final String BIPARTITE_TYPE_NAME = "bipartite";
	private static final String PATH_TYPE_NAME = "path";
	private static final String BINARY_TREE_TYPE_NAME = "binaryTree";
	private static final String CYCLE_TYPE_NAME = "cycle";
	private static final String EULARIAN_CYCLE_TYPE_NAME = "eulerianCycle";
	private static final String EULARIAN_PATH_TYPE_NAME = "eulerianPath";
	private static final String WHEEL_TYPE_NAME = "wheel";
	private static final String STAR_TYPE_NAME = "star";
	private static final String REGULAR_TYPE_NAME = "regular";
	private static final String TREE_TYPE_NAME = "tree";
	
	@Test
	public void simple1()
	{
		final int nbOfVertices = 5;
		Graph graphGenerated = GraphGenerator.simple(nbOfVertices, 2);
		assertEquals("Should be a graph of type simple.", SIMPLE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test ( expected = IllegalArgumentException.class )
	public void simple2()
	{
		GraphGenerator.simple(-1, 0.7);
	}
	
	@Test
	public void complete()
	{
		final int nbOfVertices = 6;
		Graph graphGenerated = GraphGenerator.complete(nbOfVertices);
		assertEquals("Should be a graph of type complete.", COMPLETE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}

	@Test
	public void completeBipartie()
	{
		final int nbOfVerticesFirst = 4;
		final int nbOfVerticesSecond = 3;
		Graph graphGenerated = GraphGenerator.completeBipartite(nbOfVerticesFirst, nbOfVerticesSecond);
		assertEquals("Should be a graph of type complete bipartite.", COMPLETE_BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVerticesFirst + nbOfVerticesSecond + " vertices created.", nbOfVerticesFirst + nbOfVerticesSecond, graphGenerated.V());
	}
	
	@Test
	public void bipartite1()
	{
		final int nbOfVerticesFirst = 1;
		final int nbOfVerticesSecond = 2;
		Graph graphGenerated = GraphGenerator.bipartite(1, 2, 0.8);
		assertEquals("Should be a graph of type bipartite.", BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVerticesFirst + nbOfVerticesSecond + " vertices created.", nbOfVerticesFirst + nbOfVerticesSecond, graphGenerated.V());
	}
	
	@Test
	public void bipartite2()
	{
		final int nbOfVerticesFirst = 4;
		final int nbOfVerticesSecond = 5;
		Graph graphGenerated = GraphGenerator.bipartite(4, 5, 8);
		assertEquals("Should be a graph of type bipartite.", BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVerticesFirst + nbOfVerticesSecond + " vertices created.", nbOfVerticesFirst + nbOfVerticesSecond, graphGenerated.V());
	}
	
	@Test
	public void path()
	{
		final int nbOfVertices = 8;
		Graph graphGenerated = GraphGenerator.path(nbOfVertices);
		assertEquals("Should be a graph of type path.", PATH_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void binaryTree()
	{
		final int nbOfVertices = 12;
		Graph graphGenerated = GraphGenerator.binaryTree(nbOfVertices);
		assertEquals("Should be a graph of type binary tree.", BINARY_TREE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void cycle()
	{
		final int nbOfVertices = 8;
		Graph graphGenerated = GraphGenerator.cycle(nbOfVertices);
		assertEquals("Should be a graph of type cycle.", CYCLE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void eulerianCycle()
	{
		final int nbOfVertices = 5;
		Graph graphGenerated = GraphGenerator.eulerianCycle(nbOfVertices, 5);
		assertEquals("Should be a graph of type eularian cycle.", EULARIAN_CYCLE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void eulerianPath()
	{
		final int nbOfVertices = 3;
		Graph graphGenerated = GraphGenerator.eulerianPath(nbOfVertices, 3);
		assertEquals("Should be a graph of type eularian path.", EULARIAN_PATH_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void wheel()
	{
		final int nbOfVertices = 4;
		Graph graphGenerated = GraphGenerator.wheel(nbOfVertices);
		assertEquals("Should be a graph of type wheel", WHEEL_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void star()
	{
		final int nbOfVertices = 5;
		Graph graphGenerated = GraphGenerator.star(nbOfVertices);
		assertEquals("Should be a graph of type star", STAR_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void regular()
	{
		final int nbOfVertices = 5;
		Graph graphGenerated = GraphGenerator.regular(nbOfVertices, 6);
		assertEquals("Should be a graph of type regular", REGULAR_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
	
	@Test
	public void tree()
	{
		final int nbOfVertices = 8;
		Graph graphGenerated = GraphGenerator.tree(nbOfVertices);
		assertEquals("Should be a graph of type tree", TREE_TYPE_NAME, graphGenerated.getTypeName());
		assertEquals("Should have " + nbOfVertices + " vertices created.", nbOfVertices, graphGenerated.V());
	}
}
