public enum Color
{
	PURPLE(8388736), ORANGE(16731904), INDIGO(4915330), MAROON(8388608);
	
	private int rgb;
	
	private Color(int rgb)
	{
		this.rgb = rgb;	
	}
	
	
	public String toString()
	{
	return name()+ " (0x"+ Integer.toHexString(rgb)+") ";
	}
}
