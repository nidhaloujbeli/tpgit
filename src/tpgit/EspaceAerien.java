package tpgit;

import java.util.ArrayList;

public class EspaceAerien {
	private ArrayList<Avion> espaceAerien=new ArrayList<Avion>();
	private final int separationMin=1000;
	public void addAvion(Avion avion)
	{
	 espaceAerien.add(avion);
	}
	public void deleteAvion(Avion avion)throws Exception
	{
		if(espaceAerien==null)
			throw new Exception("Espace Aerien vide");
		else if(espaceAerien.contains(avion)==false)
				throw new Exception("L'avion ne fait pas partie de l'espace aerien");
		else
		{
			espaceAerien.remove(espaceAerien.indexOf(avion));
		}	
	}
	public ArrayList<Avion> verificationAltitude()
	{
		ArrayList<Avion> listeAlerte= new ArrayList<Avion>();
		for(Avion a1:espaceAerien)
			for(Avion a2:espaceAerien)
			{
				if(!a1.equals(a2))
				{
					if(Math.abs(a1.getAltitude()-a2.getAltitude())<separationMin)
					{
						if(!listeAlerte.contains(a1))
							listeAlerte.add(a1);
						if(! listeAlerte.contains(a2))
							listeAlerte.add(a2);
					}
				}
			}
		return listeAlerte;
	}

}
