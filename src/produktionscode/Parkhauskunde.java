package produktionscode;

public abstract class Parkhauskunde implements ParkhauskundeIF{
	
	private long einfahrtszeit = -1;
	
	public Parkhauskunde() {
	}
	
	@Override
	public long getEinfahrtszeit() {
		return einfahrtszeit;
	}

	@Override
	public void einfahren() {
		einfahrtszeit = System.currentTimeMillis();
	}

	@Override
	public void ausfahren() {
		einfahrtszeit = -1;
	}

	@Override
	public String getParkplatz() {
		return null;
	}

}
