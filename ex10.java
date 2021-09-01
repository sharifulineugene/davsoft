import java.util.*;

public class ex10 {
	public static void main(String[] args) {
		Random rand = new Random();
		List<Character> list = new ArrayList<>(10);
		StringBuilder strbuilder = new StringBuilder(10);
		while(strbuilder.length() < 10) {
			char value = (char)(rand.nextInt() % 1104);
			if((value >='0' && value <= '9') 
					|| (value >= 'А' && value <= 'я')) 
			{
				if (!list.contains(value))
				{
					if(value <= 'Я')
						list.add(value);
					else
						list.add((char)(value-32));
					strbuilder.append(value);
				}
			} 
		}
		System.out.println(strbuilder.toString());
	}
}
