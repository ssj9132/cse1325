package library;
import java.time.Duration;

public class InvalidRuntimeException extends ArithmeticException
{
	public InvalidRuntimeException()
	{
		super();
	}
	
	public InvalidRuntimeException(String msg)
	{
		super(msg);
	}
	
	public InvalidRuntimeException(String title, int time)
	{
		super(title + ": invalid runtime " + time);
	}
}
