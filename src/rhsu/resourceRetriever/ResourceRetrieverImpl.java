package rhsu.resourceRetriever;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ResourceRetrieverImpl implements ResourceRetriever
{
	private final BufferedReader bufferedReader;
	
	private ResourceRetrieverImpl(String filename, String location)
	{
		bufferedReader = new BufferedReader(new InputStreamReader( getClass().getResourceAsStream(location + filename)));
	}
	
	@Override
	public BufferedReader getResource(String filename)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BufferedReader getResource(String filename, String location)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	public static ResourceRetriever getResourceRetriever(String filename, String location)
	{
		return new ResourceRetrieverImpl(filename, location);
	}
	
}
