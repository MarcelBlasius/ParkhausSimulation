package produktionscode;

public class Parkhaus implements ParkhausIF {
	private int freieParkplaetzeKunde;
	private int freieParkplaetzeFrauen;
	private int freieParkplaetzeBehinderten;
	
	public Parkhaus(int freieParkplaetzeKunde, int freieParkplaetzeFrauen,int freieParkplaetzeBehinderten){
		this.freieParkplaetzeFrauen= freieParkplaetzeFrauen;
		this.freieParkplaetzeBehinderten=freieParkplaetzeBehinderten;
		this.freieParkplaetzeKunde=freieParkplaetzeKunde;
	}
	public void ParkhausAendern(int freieParkplaetzeKunde, int freieParkplaetzeFrauen,int freieParkplaetzeBehinderten){
		this.freieParkplaetzeFrauen= freieParkplaetzeFrauen;
		this.freieParkplaetzeBehinderten=freieParkplaetzeBehinderten;
		this.freieParkplaetzeKunde=freieParkplaetzeKunde;
	}
	@Override
	public int getfreieParkplaetzeKunde() {
		return freieParkplaetzeKunde;
	}
	@Override
	public int getfreieParkplaetzeFrauen() {
		return freieParkplaetzeFrauen;
	}

	@Override
	public int getfreieParkplaetzeBehinderten() {
		return freieParkplaetzeBehinderten;
	}
	
	@Override
	public void setfreieParkplaetzeKunde(int freieParkplaetzeKunde) {
		this.freieParkplaetzeKunde=freieParkplaetzeKunde;
	}
	@Override
	public void setfreieParkplaetzeFrauen(int freieParkplaetzeFrauen) {
		this.freieParkplaetzeFrauen= freieParkplaetzeFrauen;
	}

}
