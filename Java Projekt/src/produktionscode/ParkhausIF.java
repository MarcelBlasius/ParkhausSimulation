package produktionscode;

public interface ParkhausIF {
	
	public int getfreieParkplaetzeKunde();
	public int getfreieParkplaetzeFrauen();
	public int getfreieParkplaetzeBehinderten();
	public void setfreieParkplaetzeKunde(int freieParkplaetzeKunde);
	public void setfreieParkplaetzeFrauen(int freieParkplaetzeFrauen);
	public void setfreieParkplaetzeBehinderten(int freieParkplaetzeBehinderten);
}
