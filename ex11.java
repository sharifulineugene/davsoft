import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ex11 {
	public static void main(String[] args){
		if(args.length < 1) {
			System.out.println("Pass the name of the file to read as an argument\n");
			System.exit(1);
		}
		BufferedReader fr = null;
		BufferedWriter fw = null;
	
		try {
			fr = new BufferedReader(new FileReader(args[0]));
			fw = new BufferedWriter(new FileWriter("ex11_file.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		while(true) {
			String str = null;
			try {
				str = fr.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str == null)
				break;
			String strs[] = str.split(" ");
			for(int i = 0; i < strs.length; ++i) {
				strs[i] = strs[i].substring(0,1).toUpperCase() + strs[i].substring(1).toLowerCase();
			}
			StringBuilder strbld = new StringBuilder(str.length());
			for(int i = 1; i < strs.length; ++i) {
				strbld.append(strs[i]);
				if(i != strs.length-1)
					strbld.append(" ");
			}
			try {
				fw.write(strbld.toString());
				fw.write("\n");
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
