import java.io.*;

public class DEMO{
	public static void main (String[]args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print ("Masukkan Banyak Buah : ");
		int buah = Integer.parseInt (br.readLine()); 
		
		String namabuah [] = new String [buah];
		
		for (int i=0;i<buah;i++){
			System.out.print ("Nama Buah "+(i+1)+" : ");
			namabuah [i] = br.readLine ();
		}
			
		System.out.println ("=====================================");
		for (int i=0;i<buah;i++){
			System.out.println ("Buah ke-"+(i+1));
			System.out.println ("Nama Buah : "+namabuah[i]);
		}
	}
}