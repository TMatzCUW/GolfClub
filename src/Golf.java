import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Golf {
	public static void main(String[] args)
	{
		GolfBag myGolfBag = new GolfBag("clubs");
		try
		{	
			myGolfBag.clubChooser();
		}
		catch(Exception e)
		{
			System.out.println("No Club Found");
		}
	}

}
