package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import application.SequenceCache;

public class SequenceCacheTest 
{
	@Test
	public void testSequenceCacheCreation()
	{
		SequenceCache cache = new SequenceCache();
		
		assertEquals(cache, new SequenceCache());
	}
	
	@Test
	public void testSequenceCacheWithEntries()
	{
		SequenceCache cache = new SequenceCache();
		int expected = 6;
		
		cache.length(10);
		
		assertEquals(cache.length(10), expected);
	}
	
	@Test
	public void testSequenceCacheWithoutEntries()
	{
		SequenceCache cache = new SequenceCache();
		int expected = 6;
		
		assertEquals(cache.length(10), expected);
	}
}
