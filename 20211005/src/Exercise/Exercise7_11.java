package Exercise;

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int	prevCh;

	final int MAX_VOLUME  = 100;
	final int MIN_VOLUME  = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if ( channel < MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		this.prevCh = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if ( volume < MIN_VOLUME || volume > MAX_VOLUME)
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevCh);
	}
}

class Exercise7_11 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();

		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
