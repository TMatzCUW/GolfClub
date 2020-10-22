//Club and distance
public class GolfClub extends Object {
	private String club;
	private int distance;
	
	public GolfClub(String club, int distance) {
		this.club=club;
		this.distance=distance;
	}
	
	
	public GolfClub(String s)
	{
		String[] parts = s.split(":");
		this.club = parts[0];
		this.distance = Integer.parseInt(parts[1]);
	}
	public void setClub(String club){
		this.club=club;
	}
	public void setdistance(int distance) {
		this.distance=distance;
	}
	public int getdistance() 
	{
		return distance;
	}

	public String getclub() 
	{
		return club;
	}
	public void display(){
		System.out.println("Club: "+club+" Distance: "+distance);
	}

}
