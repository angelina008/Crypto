package cipher;
import java.io.*;
import java.util.*;

/*
 * Used from the Trivium specifications
 *
 * t1    =   s66 + s93  
 * t2    =   s162 + s177
 * t3    =   s243 + s288
 *        
 * z     =   t1 + t2 + t3
 *        
 * t1    =   t1 + s91  s92 + s171
 * t2    =   t2 + s175  s176 + s264
 * t3    =   t3 + s286  s287 + s69
 * (s1; s2; : : : ; s93) --> (t3; s1; : : : ; s92)
 * (s94; s95; : : : ; s177) --> (t1; s94; : : : ; s176)
 * (s178; s279; : : : ; s288) --> (t2; s178; : : : ; s287)   
 */


public class TriviumChiper {
	 public static short keysize;
	 public static short ivsize;
	 static byte KEYSIZE_B = (byte) ((keysize+7)/8);
	 static byte IVSIZE_B = (byte) ((ivsize+7)/8);
	 public static byte array[];
	 public static byte table[]  = {
			 	0x00, 0x08, 0x04, 0x0C,   /* 0000 1000 0100 1100 */
				0x02, 0x0A, 0x06, 0x0E,   /* 0010 1010 0110 1110 */
				0x01, 0x09, 0x05, 0x0D,   /* 0001 1001 0101 1101 */
				0x03, 0x0B, 0x07, 0x0F    /* 0011 1011 0111 1111 */
			 
	 };
	 
	 public static byte iS (int i) {
		 return (byte)((array[i/8] >> (byte) (i%8))&1);
	 }
	 public static void Trv(int i, int t) {
		 array[i/8] = (byte) ((array[i/8])&(byte)~(1<<(i%8))|(t<<(i%8)));
	 }
	 public static byte triviumEncrpt (byte [] arr) {
		byte t1, t2, t3, z;
		
		t1 = (byte) (iS(66) ^ iS(93));
		t2 = (byte) (iS(162) ^ iS(177));
		t3 = (byte) (iS(243) ^ iS(288));
		
		z = (byte) (t1 ^ t2 ^ t3);
		t1 = (byte) (t1 ^ iS(91) & iS(92) ^ iS(171));
		t2 = (byte) (t1 ^ iS(175) & iS(176) ^ iS(264));
		t3 = (byte) (t1 ^ iS(286) & iS(287) ^ iS(69));
		byte c1=0,c2;
		for(int i=0; i<arr.length; ++i){
			c2=(byte) (((arr[i])>>7));
			arr[i] = (byte) (((arr[i])<<1)|c1);
			c1=c2;
		}
		Trv(0, t3);
		Trv(93, t1);
		Trv(177, t2);
		
		return (byte) (z==1?0x080:0x00);
	 }
	 
	 private static byte read_byte(byte b) {
			byte read_b = trivium_getbyte();
			return (byte)(read_b&b);
		}
	 
	 public static byte trivium_getbyte(){
			byte r=0, i=0;
			while(++i<8){
				r>>=1;
				r |= triviumEncrpt(array);
			}
			return r;
		
	 }
	 public static void TR_init(int []key, int []iv, byte [] arr) {
		 	
		   // short i;
			byte c1,c2;
			byte t1,t2;
			
			Arrays.fill(arr, 0, 35-KEYSIZE_B, arr[KEYSIZE_B]);
			c2=0;
			c1=KEYSIZE_B;
			while(c1!=0){
				t1 = (byte) key[--c1];
				t2 = (byte) ((read_byte((table[t1&0x0f]))<<4)|(read_byte((table[t1>>4]))));
				arr[c2++] = t2;
			}
			
			c2=12;
			c1=IVSIZE_B;
			while(c1!=0){
				t1 = (byte) iv[--c1];
				t2 = (byte) ((read_byte((table[t1&0x0f]))<<4)|(read_byte((table[t1>>4]))));
				arr[c2++] = t2;
			}
			for(int i=12+IVSIZE_B; i>10; --i){
				c2=(byte) ((arr[i])<<5);
				arr[i] = (byte) (((arr[i])>>3)|c1);
				c1=c2;
			}
			arr[35] = (byte) 0xE0;
			for(int i=0; i<4*288; ++i){
				triviumEncrpt(arr);
			}
	 } 
	 public static void main(String [] args) {
		 
		 Scanner s = new Scanner(System.in);
		 //byte read_b = s.nextByte();
		 
		 String [] a = s.next().split("");
		 int [] key = new int [36];
		 String [] b = s.next().split("");
		 int [] iv = new int [36];
		 for(int i = 0; i < a.length; i++) {
			 key[i] = Integer.parseInt(a[i]);
		 }
		 for(int i = 0; i < b.length; i++) {
			 iv[i] = Integer.parseInt(b[i]);
		 }
		 String [] txt = s.next().split("");
		 int [] tt = new int [36];
		 for(int i = 0; i < txt.length; i++) {
			 tt[i] = Byte.parseByte(txt[i]);
		 }
		 s.close();
		TR_init(key, iv, array);
		triviumEncrpt(array);
	 }
	
}
