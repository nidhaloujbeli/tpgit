package tpgit;

public class Avion 
{
	private Position p=new Position();
	public int getAltitude()
	{
		return p.getAltitude();
	}
	public void setAltitude(int altitude)
	{
		p.setAltitude(altitude);
	}
	public Avion()
	{
		System.out.println("nouvel avion");
		System.out.println("New plane");
	}
}
