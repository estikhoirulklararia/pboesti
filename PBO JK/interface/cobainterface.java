import javax.swing.*;

interface JenisMakanan
{
	public void makanan();
}
class pedas implements JenisMakanan
{
	public void makanan()
	{
		System.out.println("Saya Suka Makanan Pedas,Keripik Pedas");
	}
}
class manis implements JenisMakanan
{
	public void makanan()
	{
		System.out.println("Saya Suka Makanan Manis, Keripik Manis");
	}
}
public class cobainterface
{
	public static void main(String args[])
	{
		manis inimanis = new manis();
		pedas inipedas = new pedas();
		inimanis.makanan();
		inipedas.makanan();
	}
}