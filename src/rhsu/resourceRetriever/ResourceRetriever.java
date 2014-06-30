package rhsu.resourceRetriever;

import java.io.BufferedReader;

public interface ResourceRetriever
{
	public BufferedReader getResource(String filename);
	public BufferedReader getResource(String filename, String location);
}
