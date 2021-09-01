import java.io.*;
import java.util.regex.Pattern;

public class ex12 {
	public static void main(String[] args) throws Exception{
		if(args.length < 1) {
			System.out.println("Pass the name of the file to read as an argument\n");
			System.exit(1);
		}
		BufferedReader fr = new BufferedReader(new FileReader(args[0]));
		int count = 0;
		//Pattern pattern = Pattern.compile
		while(true) {
			String str = fr.readLine();
			if(str == null)
				break;
			++count;
			str = str.trim();
			String strs[] = str.split("\\.{1,}|\\?{1,}|\\!{1,}");
			for(String s : strs) {
				s = s.trim();
				if(Character.isLowerCase(s.charAt(0))) {
					System.out.println(count + ". " + s.split(" ")[0]);
				}
			}
		}
		fr.close();
	}
}
