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
		Graph graphGenerated = GraphGenerator.simple(5, 2);
		assertEquals("Should be a graph of type simple.", SIMPLE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test ( expected = IllegalArgumentException.class )
	public void simple2()
	{
		GraphGenerator.simple(-1, 0.7);
	}
	
	@Test
	public void complete()
	{
		Graph graphGenerated = GraphGenerator.complete(6);
		assertEquals("Should be a graph of type complete.", COMPLETE_TYPE_NAME, graphGenerated.getTypeName());
	}

	@Test
	public void completeBipartie()
	{
		Graph graphGenerated = GraphGenerator.completeBipartite(4, 3);
		assertEquals("Should be a graph of type complete bipartite.", COMPLETE_BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void bipartite1()
	{
		Graph graphGenerated = GraphGenerator.bipartite(1, 2, 0.8);
		assertEquals("Should be a graph of type bipartite.", BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void bipartite2()
	{
		Graph graphGenerated = GraphGenerator.bipartite(4, 5, 8);
		assertEquals("Should be a graph of type bipartite.", BIPARTITE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void path()
	{
		Graph graphGenerated = GraphGenerator.path(8);
		assertEquals("Should be a graph of type path.", PATH_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void binaryTree()
	{
		Graph graphGenerated = GraphGenerator.binaryTree(12);
		assertEquals("Should be a graph of type binary tree.", BINARY_TREE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void cycle()
	{
		Graph graphGenerated = GraphGenerator.cycle(8);
		assertEquals("Should be a graph of type cycle.", CYCLE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void eulerianCycle()
	{
		Graph graphGenerated = GraphGenerator.eulerianCycle(5, 5);
		assertEquals("Should be a graph of type eularian cycle.", EULARIAN_CYCLE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void eulerianPath()
	{
		Graph graphGenerated = GraphGenerator.eulerianPath(3, 3);
		assertEquals("Should be a graph of type eularian path.", EULARIAN_PATH_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void wheel()
	{
		Graph graphGenerated = GraphGenerator.wheel(4);
		assertEquals("Should be a graph of type wheel", WHEEL_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void star()
	{
		Graph graphGenerated = GraphGenerator.star(5);
		assertEquals("Should be a graph of type star", STAR_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void regular()
	{
		Graph graphGenerated = GraphGenerator.regular(5, 6);
		assertEquals("Should be a graph of type regular", REGULAR_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test
	public void tree()
	{
		Graph graphGenerated = GraphGenerator.tree(8);
		assertEquals("Should be a graph of type tree", TREE_TYPE_NAME, graphGenerated.getTypeName());
	}
}
