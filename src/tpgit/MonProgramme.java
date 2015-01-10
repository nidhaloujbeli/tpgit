package tpgit;

public class MonProgramme {
	public static void main(String[]args)
	{
		System.out.println("Sbe7 l5ir!");
		System.out.println("Bonjour!");
		Avion a1= new Avion();
		Avion a2= new Avion();
		a1.setAltitude(1000);
		a2.setAltitude(70000);
		a1.setAltitude(2000);
		a2.setAltitude(8000);
		EspaceAerien espaceParis=new EspaceAerien();
		espaceParis.addAvion(a1);
		espaceParis.addAvion(a2);
		System.out.println(espaceParis.verificationAltitude());
		a1.setAltitude(7500);
		System.out.println(espaceParis.verificationAltitude());
	}

}
