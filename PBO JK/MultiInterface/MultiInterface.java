class Manusia//class biasa
{
	void bernafas()
	{
		System.out.println("Bernafas...");
	}
}
interface Blantik
{
	void jualSapi();
}
interface Sniper
{
	void menembak();
}

class Amir extends Manusia implements Blantik,Sniper//induk : manusia,blantik,sniper
{
	public void jualSapi()
	{
		System.out.println("Jual Sapi...");
	}
	public void menembak()
	{
		System.out.println("Menembak...");
	}
}

public class MultiInterface
{
	static void testManusia(Manusia m)
	{
		m.bernafas();
	}
	static void testBlantik(Blantik b)
	{
		b.jualSapi();
	}
	static void testSniper(Sniper s)
	{
		s.menembak();
	} 
	
	public static void main(String [] args)//method biasa
	{
		//mahmud adalah object class yang bersifat general
		Amir mahmud=new Amir();//Amir() : konstruktor
		testManusia(mahmud); 
		testBlantik(mahmud);
		testSniper(mahmud);
	}
}
//compile mengubah bahasa manusia menjadi bahasa mesin
//interface : memiliki method kosong atau method abstrak
//class biasa : memiliki method yang ada isinya atau tidak memperbolehkan method abstrak
//inisialisasi : memberikan nilai awal(integer = 0)
//instansiasi : pembuatan objek baru(objek yang terbentuk antara nama class dan konstruktor)
//kelas abstrak : bisa berisi method kosong atau method isi
//ciri khas method : ada kurung buka kurung tutup
//package mengelompokkan file sejenis
//overriding, class induk sama class anak sama(konsep polymorfisme)dan inheritance
//overloading,namanya sama beda parameter(konsep polymorfisme)
//dari kelas biasa diturunkan ke kelas turunanan nya menggunakan keyword = extends
//dari interface diturunkan ke kelas biasa menggunkan keyword = implements