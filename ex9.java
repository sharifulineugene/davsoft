import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ex9 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Pass the name of the file to read as an argument\n");
			System.exit(1);
		}
		BufferedReader fr = null;
		try {
			fr = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Collection<String> list = new LinkedHashSet<>();
		Pattern pattern = Pattern.compile("(.*)\\(.*\\).*");
		while(true) {
			String str = null;
			try {
				str = fr.readLine();
				if(str == null)
					break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Matcher matcher = pattern.matcher(str);
			if(matcher.find())
				str = matcher.group(1);
			list.add(str/*.split("(")[0]*/);
		}
		
		System.out.println("Numbers of unique strings: " + list.size());
		System.out.println(list);
		
		try {
			fr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
