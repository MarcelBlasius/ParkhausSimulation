package produktionscode;

import uebung2.Parkhaus;

public interface AmpelIF {
	public void SetFarbeGrenze(int Gelb,int Gr�n  ) throws Exception ;
	public String getFarbe(Parkhaus haus) ;

}
