package m2m.app.api;

//an object to store information about a pin
public class PinInfoObj {
	private int pinNumber;
	private String pinName;
	private boolean pinFunction;
	private boolean pinState;
	private boolean persistent;
	private String highLabel;
	private String lowLabel;
	
	public PinInfoObj(int num, String name, boolean fun, boolean state, boolean pers, String hi, String lo)
	{
		pinNumber = num;
		pinName = name;
		pinFunction = fun;
		pinState = state;
		persistent = pers;
		highLabel = hi;
		lowLabel = lo;
	}
	
	public int number()
	{
		return pinNumber;
	}
	
	public String name()
	{
		return pinName;
	}
	
	public boolean function()
	{
		return pinFunction;
	}
	
	public boolean state()
	{
		return pinState;
	}
	
	public boolean persistent()
	{
		return persistent;
	}
	
	public String highLabel()
	{
		return highLabel;
	}
	
	public String lowLabel()
	{
		return lowLabel;
	}
	
}
