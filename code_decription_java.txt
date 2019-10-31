import java.io.*;
import java.util.*;
public class Freq {
	public static void decrypt(char [] tekst) {
		char [] azbuka = {'А', 'Б','В', 'Г','Д', 'Ѓ','Е', 'Ж','З', 'Ѕ','И', 'Ј','К', 'Л','Љ', 'М','Н', 'Њ','О', 'П','Р', 'С','Т', 'Ќ','У', 'Ф','Х', 'Ц','Ч', 'Џ','Ш'};
		//char [] tekst = in.readLine().toCharArray();
		for(int i = 0; i< tekst.length; i++) {
			if(tekst[i]==azbuka[0]) {
				tekst[i] = 'ж';
			}
			if(tekst[i]==azbuka[1]) {
				tekst[i] = 'ј';
			}
			if(tekst[i]==azbuka[2]) {
				tekst[i] = 'з';
			}
			if(tekst[i]==azbuka[3]) {
				tekst[i] = 'к';
			}
			if(tekst[i]==azbuka[4]) {
				tekst[i] = ' ';
			}
			if(tekst[i]==azbuka[5]) {
				tekst[i] = 'и';
			}
			if(tekst[i]==azbuka[6]) {
				tekst[i] = ' ';
			}
			if(tekst[i]==azbuka[7]) {
				tekst[i] = 'у';
			}
			if(tekst[i]==azbuka[8]) {
				tekst[i] = 'м';
			}
			if(tekst[i]==azbuka[9]) {
				tekst[i] = 'н';
			}
			if(tekst[i]==azbuka[10]) {
				tekst[i] = 'л';
			}
			if(tekst[i]==azbuka[11]) {
				tekst[i] = 'о';
			}
			if(tekst[i]==azbuka[12]) {
				tekst[i] = 'њ';
			}
			if(tekst[i]==azbuka[13]) {
				tekst[i] = 'т';
			}
			if(tekst[i]==azbuka[14]) {
				tekst[i] = ' ';
			}
			if(tekst[i]==azbuka[15]) {
				tekst[i] = 'ц';
			}
			if(tekst[i]==azbuka[16]) {
				tekst[i] = 'ф';
			}
			if(tekst[i]==azbuka[17]) {
				tekst[i] = 'х';
			}
			if(tekst[i]==azbuka[18]) {
				tekst[i] = ' ';
			}
			if(tekst[i]==azbuka[19]) {
				tekst[i] = 'ш';
			}
			if(tekst[i]==azbuka[20]) {
				tekst[i] = 'б';
			}
			if(tekst[i]==azbuka[21]) {
				tekst[i] = 'в';
			}
			if(tekst[i]==azbuka[22]) {
				tekst[i] = 'ч';
			}
			if(tekst[i]==azbuka[23]) {
				tekst[i] = 'д';
			}
			if(tekst[i]==azbuka[24]) {
				tekst[i] = 'г';
			}
			if(tekst[i]==azbuka[25]) {
				tekst[i] = 'с';
			}
			if(tekst[i]==azbuka[26]) {
				tekst[i] = ' ';
			}
			if(tekst[i]==azbuka[27]) {
				tekst[i] = 'п';
			}
			if(tekst[i]==azbuka[28]) {
				tekst[i] = 'р';
			}
			if(tekst[i]==azbuka[29]) {
				tekst[i] = 'е';
			}
			if(tekst[i]==azbuka[30]) {
				tekst[i] = 'а';
			}
			
		}
		
		for(int i = 0; i< tekst.length; i++) {
			System.out.print(tekst[i]);
		}
	}
	public static void freq_bukvi(char []tekst) {
		int [] c = new int[31];
		char [] azbuka = {'А', 'Б','В', 'Г','Д', 'Ѓ','Е', 'Ж','З', 'Ѕ','И', 'Ј','К', 'Л','Љ', 'М','Н', 'Њ','О', 'П','Р', 'С','Т', 'Ќ','У', 'Ф','Х', 'Ц','Ч', 'Џ','Ш'};
		//char [] tekst = in.readLine().toCharArray();
		for(int i = 0; i< tekst.length; i++) {
			if(tekst[i]==azbuka[0]) {
				c[0]++;
			}
			if(tekst[i]==azbuka[1]) {
				c[1]++;
			}
			if(tekst[i]==azbuka[2]) {
				c[2]++;
			}
			if(tekst[i]==azbuka[3]) {
				c[3]++;
			}
			if(tekst[i]==azbuka[4]) {
				c[4]++;
			}
			if(tekst[i]==azbuka[5]) {
				c[5]++;
			}
			if(tekst[i]==azbuka[6]) {
				c[6]++;
			}
			if(tekst[i]==azbuka[7]) {
				c[7]++;
			}
			if(tekst[i]==azbuka[8]) {
				c[8]++;
			}
			if(tekst[i]==azbuka[9]) {
				c[9]++;
			}
			if(tekst[i]==azbuka[10]) {
				c[10]++;
			}
			if(tekst[i]==azbuka[11]) {
				c[11]++;
			}
			if(tekst[i]==azbuka[12]) {
				c[12]++;
			}
			if(tekst[i]==azbuka[13]) {
				c[13]++;
			}
			if(tekst[i]==azbuka[14]) {
				c[14]++;
			}
			if(tekst[i]==azbuka[15]) {
				c[15]++;
			}
			if(tekst[i]==azbuka[16]) {
				c[16]++;
			}
			if(tekst[i]==azbuka[17]) {
				c[17]++;
			}
			if(tekst[i]==azbuka[18]) {
				c[18]++;
			}
			if(tekst[i]==azbuka[19]) {
				c[19]++;
			}
			if(tekst[i]==azbuka[20]) {
				c[20]++;
			}
			if(tekst[i]==azbuka[21]) {
				c[21]++;
			}
			if(tekst[i]==azbuka[22]) {
				c[22]++;
			}
			if(tekst[i]==azbuka[23]) {
				c[23]++;
			}
			if(tekst[i]==azbuka[24]) {
				c[24]++;
			}
			if(tekst[i]==azbuka[25]) {
				c[25]++;
			}
			if(tekst[i]==azbuka[26]) {
				c[26]++;
			}
			if(tekst[i]==azbuka[27]) {
				c[27]++;
			}
			if(tekst[i]==azbuka[28]) {
				c[28]++;
			}
			if(tekst[i]==azbuka[29]) {
				c[29]++;
			}
			if(tekst[i]==azbuka[30]) {
				c[30]++;
			}
			
		}
		
		for(int i = 0; i< azbuka.length; i++) {
			System.out.println(azbuka[i] +" " +c[i]);
		}
	}
	public static void dve_freq(String text) {
		String [] a = text.split("(?<=\\G.{2})");
		//int c = 0;
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
	}
	public static void tri_freq(String text) {
		String [] a = text.split("(?<=\\G.{3})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
	}
	public static void chetiri_freq(String text) {
		String [] a = text.split("(?<=\\G.{4})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
	}
	public static void pet_freq(String text) {
		String [] a = text.split("(?<=\\G.{5})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
	
	}
	public static void shest_freq(String text) {
		String [] a = text.split("(?<=\\G.{6})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
		
	}
	public static void sedum_freq(String text) {
		String [] a = text.split("(?<=\\G.{7})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
		
	}
	public static void osum_freq(String text) {
		String [] a = text.split("(?<=\\G.{8})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
	
	}
	public static void devet_freq(String text) {
		String [] a = text.split("(?<=\\G.{9})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
	}
	public static void deset_freq(String text) {
		String [] a = text.split("(?<=\\G.{10})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
		
	}
	public static void edinaeset_freq(String text) {
		String [] a = text.split("(?<=\\G.{11})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
	
	}
	public static void dvanaeset_freq(String text) {
		String [] a = text.split("(?<=\\G.{12})");
		int [] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				if(a[i].compareTo(a[j])==0) {
					c[i]++;
				}
			}
		
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			arr.add(a[i]);
			}
		duplikati(arr);
		for(int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i) + " "+ c[i]);
		}
		
	
	}
	public static <T> ArrayList<T> duplikati(ArrayList<T> list) 
    { 
  
        // Create a new LinkedHashSet 
        Set<T> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(list); 
  
        // Clear the list 
        list.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        list.addAll(set); 
  
        // return the list 
        return list; 
    } 
        
public static void main(String[] args) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String Crypto = in.readLine();
	char [] tekst = Crypto.toCharArray();
	freq_bukvi(tekst);
	dve_freq(Crypto);
	tri_freq(Crypto);
	chetiri_freq(Crypto);
	pet_freq(Crypto);
	shest_freq(Crypto);
	sedum_freq(Crypto);
	osum_freq(Crypto);
	devet_freq(Crypto);
	deset_freq(Crypto);
	edinaeset_freq(Crypto);
	dvanaeset_freq(Crypto);
	decrypt(tekst);
	

}
}
