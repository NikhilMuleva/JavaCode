package Array;
public class Player {
	String name,team;
	int jerseyNo;
	public Player(String name, String team, int jerseyNo) {
		super();
		this.name = name;
		this.team = team;
		this.jerseyNo = jerseyNo;
	}
	//@override
	public String toString() {
		return this.name+" "+this.team+" "+this.jerseyNo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("MSD","CSK", 7);
		Player p2 = new Player("Virat","RCB",18);
		Player p3 = new Player("Rohit","MI",45);
		
		Player x[]= {p1 ,p2, p3};
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
}
