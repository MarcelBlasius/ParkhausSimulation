package produktionscode;

import java.time.Instant;

public abstract class Parkhauskunde implements ParkhauskundeIF{
	
	private Instant einfahrtszeit;
	
	public Parkhauskunde() {
	}
	
	@Override
	public Instant getEinfahrtszeit() {
		return einfahrtszeit;
	}

	@Override
	public void einfahren() {
		this.einfahrtszeit = Instant.now();
	}
	@Override
	public void ausfahren() {
		einfahrtszeit = null;
	}

	@Override
	public String getParkplatz() {
		return null;
	}

}
