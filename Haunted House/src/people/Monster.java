package people;
import java.util.Random;

public class Monster extends Person {
	private String[] types = {"zombie","ghoul","banshee"};
	//Random r = new Random();
	public Monster(String type, int[] location) {
		super(type,location);
	}
	
	public String[] getTypes()
	{
		return types;
	}
}
