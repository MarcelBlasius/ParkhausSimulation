package produktionscode;

public class Ampel implements AmpelIF{
	Parkhaus Haus;
	private String Farbe = "Rot";
	public  Ampel(int Gelb,int Grün ,Parkhaus Haus) throws Exception {
		this.Haus= Haus;
		int tmp= Haus.getfreieParkplaetzeKunde();
		if(Grün>=Gelb) {
			if(Grün <= tmp) {
				Farbe = "Grün";
			}else {
				if(Gelb <=tmp) {
					Farbe ="Gelb";
				}else {
					Farbe ="Rot";
				}
			}
		}else {
			throw new Exception(); 
		}
	}
	public void SetFarbeGrenze(int Gelb,int Grün  ) throws Exception {
		int tmp= Haus.getfreieParkplaetzeKunde();
		if(Grün>=Gelb) {
			if(Grün <= tmp) {
				Farbe = "Grün";
			}else {
				if(Gelb <=tmp) {
					Farbe ="Gelb";
				}else {
					Farbe ="Rot";
				}
			}
		}else {
			throw new Exception(); 
		}
	}

	public String getFarbe(Parkhaus haus) {
		
		return Farbe;
		
	}
}
