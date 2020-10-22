//Holds the clubs
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class GolfBag {
	private ArrayList<GolfClub> Clubs;
	
	public GolfBag() {
		this.Clubs=new ArrayList<GolfClub>();
	}
	public GolfBag(String filename)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + "clubs"));
			while(input.hasNext())
			{
				this.Clubs.add(new GolfClub(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}
	public void addclub(GolfClub c) {
		this.Clubs.add(c);
	}
	public void addclub(String colonDelimitedData)
	{
		this.Clubs.add(new GolfClub(colonDelimitedData));
	}
	public void clubChooser()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How far do you want to hit: ");
		int input = keyboard.nextInt();
		for (int i = 0; i < this.Clubs.size()-1; i++)
		{
			if(input <= this.Clubs.get(i).getdistance())
			{
				System.out.println("Use the '" + this.Clubs.get(i).getclub() + "' which can hit up to " + this.Clubs.get(i).getdistance() + " yards");
				return;
			}
		}
	}
	
	public void display()
	{
		for(GolfClub c : this.Clubs)
		{
			c.display();
		}
	}

}
