abstract class SepedaMotor
{
	void melaju(String k)
	{
		System.out.println(k+" ");
	}
	abstract void cepat();
}
class Honda extends SepedaMotor
{
	void cepat()
	{
		System.out.println("One heart");
	}
}
class Yamaha extends SepedaMotor
{
	void cepat()
	{
		System.out.println("Yamaha semakin didepan");
	}
}
class Kendaraan
{
	public static void main(String args[])
	{
		Honda h=new Honda();
		Yamaha b= new Yamaha();
		h.melaju("Honda");
		h.cepat();
		b.melaju("Yamaha");
		b.cepat();
		
	}
}