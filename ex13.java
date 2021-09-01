import java.io.*;
import java.util.*;

public class ex13 {
	public static void main(String[] args) throws Exception{
		if(args.length < 1) {
			System.out.println("Pass the name of the file to read as an argument\n");
			System.exit(1);
		}
		BufferedReader fr = new BufferedReader(new FileReader(args[0]));
		FileWriter fw = new FileWriter("ex13_file.txt");
		float kol = 0;
		float summa = 0;
		while(true) {
			String str = fr.readLine();
			if(str == null)
				break;
			
			ArrayList<String> strs = new ArrayList<>(Arrays.asList(str.split(";")));
			float price = Float.valueOf(strs.get(1));
			float amount = Float.valueOf(strs.get(2));
			kol += amount;
			double sum = price * amount;
			summa += sum;
			strs.add(String.format("%.2f",sum));
			StringBuilder strbld = new StringBuilder();
			for(int i = 0; i < strs.size(); ++i) {
				strbld.append(strs.get(i));
				if(i != strs.size()-1)
					strbld.append(';');
			}
			fw.write(strbld.toString()+'\n');
		}
		fw.write("_______________________________\n");
		fw.write("______________" + String.format("%.3f",kol) + ";" + String.format("%.2f",summa)+'\n');
		fr.close();
		fw.close();
	}
}
