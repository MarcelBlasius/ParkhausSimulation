package produktionscode;
public class Ampel implements AmpelIF{
	Parkhaus Haus;
	private String Farbe = "Rot";
	public  Ampel(int Gelb,int Gr�n ,Parkhaus Haus) {
		this.Haus= Haus;
		int tmp= Haus.getfreieParkplaetzeKunde();
		if(Gr�n <= tmp) {
			Farbe = "Gr�n";
		}else {
			if(Gelb <=tmp) {
				Farbe ="Gelb";
			}else {
				Farbe ="Rot";
			}
		}
		
	}
	public void SetFarbeGrenze(int Gelb,int Gr�n  ) {
		int tmp= Haus.getfreieParkplaetzeKunde();
		if(Gr�n <= tmp) {
			Farbe = "Gr�n";
		}else {
			if(Gelb <=tmp) {
				Farbe ="Gelb";
			}else {
				Farbe ="Rot";
			}
		}
		
	}

	public String getFarbe(Parkhaus haus) {
		
		return Farbe;
		
	}
}
