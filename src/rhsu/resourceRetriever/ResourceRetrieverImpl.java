package rhsu.resourceRetriever;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ResourceRetrieverImpl implements ResourceRetriever
{
	private final BufferedReader bufferedReader;
	
	public ResourceRetrieverImpl(String filename, String location)
	{
		bufferedReader = new BufferedReader(new InputStreamReader( getClass().getResourceAsStream(location + filename)));
	}
	
	@Override
	public BufferedReader getReader() { return this.bufferedReader; }
		
	public static ResourceRetriever getResourceRetriever(String filename, String location)
	{
		return new ResourceRetrieverImpl(filename, location);
	}	
}
