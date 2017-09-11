package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorTest {

	private static final String SIMPLE_TYPE_NAME = "simple";
	private static final String COMPLETE_TYPE_NAME = "complete";
	
	@Test
	public void simple()
	{
		Graph graphGenerated = GraphGenerator.simple(5, 0.7);
		assertEquals("Should be a graph of type complete.", SIMPLE_TYPE_NAME, graphGenerated.getTypeName());
	}
	
	@Test ( expected = IllegalArgumentException.class )
	public void complete()
	{
		GraphGenerator.complete(-1);
	}

}
