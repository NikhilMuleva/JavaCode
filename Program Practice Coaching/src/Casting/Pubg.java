package Casting;

public class Pubg {
	Gun getgun() {
		Gun g1 = new Gun();
		return g1;
	}
	Pan getpan()
	{
		Pan p1 = new Pan();
		return p1;
		
	}
	Granade getgranade()
	{
		Granade  g2 = new Granade();
		return g2;
		
	}
	public static void main(String[] args) {
		Pubg  pg = new Pubg();
		Gun x=pg.getgun();
		System.out.println(x);
		Pan y =pg.getpan();
		System.out.println(y);
		Granade z =pg.getgranade();
		System.out.println(z);
	}
		
	}
	
  