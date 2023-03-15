interface Pengajar
{
	void mengajar();
}
class Guru implements Pengajar
{
	public void mengajar()
	{
		System.out.println("Guru mengajar...");
	}
}
class Dosen implements Pengajar
{
	public void mengajar()
	{
		System.out.println("Dosen mengajar...");
	}
}
public class BelajarInterface
{
	static void tesPengajar(Pengajar p)
	{
		p.mengajar();
	}
	public static void main(String a[])
	{
		Guru pakGuru = new Guru();
		Dosen buDosen = new Dosen();
		tesPengajar(pakGuru);
		tesPengajar(buDosen);
	}
}