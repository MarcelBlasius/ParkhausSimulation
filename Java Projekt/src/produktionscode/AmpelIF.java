package produktionscode;

import uebung2.Parkhaus;

public interface AmpelIF {
	public void SetFarbeGrenze(int Gelb,int Grün  ) throws Exception ;
	public String getFarbe(Parkhaus haus) ;

}
