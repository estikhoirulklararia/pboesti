import java.io.*;

class LuasPersegi
{
	public static void main(String args[])// throws IOException
	{
		int sisi,L;
		System.out.print("Masukan Nilai Sisi:");
		BufferedReader ini=new BufferedReader(new InputStreamReader(System.in));
		sisi=new Integer(ini.readLine()).intValue();
		L=sisi*sisi;
		System.out.println("Luas Persegi: "+L);
	}
}
