public class Overloading
{
	static void cetak()
	{
		System.out.println("cetak tanpa parameter"); 
	}
	static void cetak(String s)
	{
		System.out.println("cetak dengan 1 parameter "+s);
	}
	static void cetak (String x, String y)
	{
		System.out.println("cetak dengan 2 parameter "+x+ " dan "+y);
	}
	public static void main (String [] p)
	{
		cetak();
		cetak("satu");
		cetak("satu","dua");
	}
}