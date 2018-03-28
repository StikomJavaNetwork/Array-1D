import java.io.*;

public class soal{
	public static void main (String[]args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print ("Masukkan Banyak Mahasiswa : ");
		int mahasiswa = Integer.parseInt (br.readLine()); 
		
		String nim [] = new String [mahasiswa];
		String nama [] = new String [mahasiswa];
		double uts [] = new double [mahasiswa];
		double uas [] = new double [mahasiswa];
		double ratarata [] = new double [mahasiswa];
		
		for (int i=0;i<mahasiswa;i++){
			System.out.print ("NIM Mahasiswa "+(i+1)+" : ");
			nim [i] = br.readLine ();
			System.out.print ("Nama Mahasiswa "+(i+1)+" : ");
			nama [i] = br.readLine ();
			System.out.print ("Nilai UTS Mahasiswa "+(i+1)+" : ");
			uts [i] = Double.parseDouble (br.readLine());
			System.out.print ("Nilai UAS Mahasiswa "+(i+1)+" : ");
			uas [i] = Double.parseDouble (br.readLine());
			System.out.println ();
		}
			
		for (int i=0;i<mahasiswa;i++){
			ratarata [i] = (uts[i]+uas[i])/2;	
		}
			
		System.out.println ("=====================================");
		System.out.println ("         REKAP NILAI MAHASISWA       ");
		System.out.println ("=====================================");
		for (int i=0;i<mahasiswa;i++){
			System.out.println ("Mahasiswa ke-"+(i+1));
			System.out.println ("NIM Mahasiswa : "+nim[i]);
			System.out.println ("Nama Mahasiswa : "+nama[i]);
			System.out.println ("Nilai UTS Mahasiswa : "+uts[i]);
			System.out.println ("Nilai UAS Mahasiswa : "+uas[i]);
			System.out.println ("Nilai Rata-rata Mahasiswa : "+ratarata[i]);
			
			if (ratarata[i] >=70 && ratarata[i] <=100) {
				System.out.println ("Nilai Huruf Mahasiswa : A");
			}
			else if (ratarata[i] >=50 && ratarata[i] <=69) {
				System.out.println ("Nilai Huruf Mahasiswa : B");
			}
			else if (ratarata[i] <=50) {
				System.out.println ("Nilai Huruf Mahasiswa : C");
			}
			System.out.println ();
		}
	}
}