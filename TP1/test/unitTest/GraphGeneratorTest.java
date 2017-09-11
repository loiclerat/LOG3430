package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorTest {

	private static final String SIMPLE_TYPE_NAME = "simple";
	private static final String COMPLETE_TYPE_NAME = "complete";
	
	@Test
	public void simple1()
	{
		
	}
	
	@Test
	public void simple2()
	{
		Graph graphGenerated = GraphGenerator.simple(5, 0.7);
		assertEquals("Should be a graph of type complete.", SIMPLE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test ( expected = IllegalArgumentException.class )
	public void complete()
	{
		GraphGenerator.complete(-1);
	}

	@Test
	public void completeBipartie()
	{
		
	}
	
	@Test
	public void bipartite1()
	{
		
	}
	
	@Test
	public void bipartite2()
	{
		
	}
	
	@Test
	public void path()
	{
		
	}
	
	@Test
	public void binaryTree()
	{
		
	}
	
	@Test
	public void cycle()
	{
		
	}
	
	@Test
	public void eulerianCycle()
	{
		
	}
	
	@Test
	public void eulerianPath()
	{
		
	}
	
	@Test
	public void wheel()
	{
		
	}
	
	@Test
	public void star()
	{
		
	}
	
	@Test
	public void regular()
	{
		
	}
	
	@Test
	public void tree()
	{
		
	}
}
