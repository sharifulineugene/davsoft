import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ex8 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Pass the name of the file to read as an argument\n");
			System.exit(1);
		}
		FileReader fr = null;
		try {
			fr = new FileReader(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		char ch[] = {'а','е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
		double counts[] = {0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d};
		char c = '\0';
		int count = 0;
		
		
		while(true) {
			try {
				int a = fr.read();
				if(a == -1)
					break;
				c = (char) a;
				++count;
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			switch(c) {
				case 'а' | 'А' :
					++counts[0];
					break;
				case 'е' | 'Е' :
					++counts[1];
					break;
				case 'ё' | 'Ё' :
					++counts[2];
					break;
				case 'и' | 'И' :
					++counts[3];;
					break;
				case 'о' | 'О' :
					++counts[4];;
					break;
				case 'у' | 'У' :
					++counts[5];;
					break;
				case 'ы' | 'Ы' :
					++counts[6];;
					break;
				case 'э' | 'Э' :
					++counts[7];;
					break;
				case 'ю' | 'Ю' :
					++counts[8];;
					break;
				case 'я' | 'Я' :
					++counts[9];;
					break;
				default:
					break;
			}
		}
		
		System.out.println(count);
		for (int i = 0; i < counts.length; ++i)
			counts[i] /= count;
		
		double tempd;
		char tempc;
		
		for(int i = 0; i < counts.length; ++i) {
			for(int j = i+1; j < counts.length; ++j) {
				if(counts[j] > counts[i]) {
					tempd = counts[i];
					counts[i] = counts[j];
					counts[j] = tempd;
					tempc = ch[i];
					ch[i] = ch[j];
					ch[j] = tempc;
				}
			}
		}
		System.out.print("{");
		for(int i = 0; i < 10; ++i) {
			System.out.print(ch[i] + "=" + counts[i]);
			if(i < 9)
				System.out.print(", ");
		}
		System.out.println("}");
		
		
		try {
			fr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
