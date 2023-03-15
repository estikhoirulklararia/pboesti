import javax.swing.*;

interface PerkenalkanSaya
{
	public void biodata();
}
class Nama implements PerkenalkanSaya
{
	public void biodata()
	{
		System.out.println("Esti Khoirul Klararia");
	}
}
class Alamat implements PerkenalkanSaya
{
	public void biodata()
	{
		System.out.println("Rumah Indonesia");
	}
}
class Gas
{
	public void data()
	{
		System.out.print("Nama Saya ");
	}
	public void data(String umur)
	{
		System.out.println("Saya Berumur " + umur);
	}
}
public class EstiKhoirul
{
	public static void main(String [] args)
	{
		Nama ininama = new Nama();
		Alamat inialamat = new Alamat();
		Gas test = new Gas();
		test.data();
		ininama.biodata();
		test.data("17m00");
		inialamat.biodata();	
	}
}