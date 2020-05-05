package produktionscode;
public class Ampel implements AmpelIF{
	Parkhaus Haus;
	private String Farbe = "Rot";
	public  Ampel(int Gelb,int Grün ,Parkhaus Haus) {
		this.Haus= Haus;
		int tmp= Haus.getfreieParkplaetzeKunde();
		if(Grün <= tmp) {
			Farbe = "Grün";
		}else {
			if(Gelb <=tmp) {
				Farbe ="Gelb";
			}else {
				Farbe ="Rot";
			}
		}
		
	}
	public void SetFarbeGrenze(int Gelb,int Grün  ) {
		int tmp= Haus.getfreieParkplaetzeKunde();
		if(Grün <= tmp) {
			Farbe = "Grün";
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
