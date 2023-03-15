abstract class MakhlukHidup//parents class 
{
	void bernafas()//method
	{
		System.out.println("bernafas...");
	}
	abstract void berjalan();//method abstract
}
class Hewan extends MakhlukHidup
{
	void berjalan()//method
	{
		System.out.println("hewan berjalan...");
	}
}
class Burung extends MakhlukHidup
{
	void berjalan()//method
	{
		System.out.println("burung berjalan...");
	}
}
class KelasAbstrak
{
	public static void main(String []args)//method
	{   
		Hewan h = new Hewan();// h dan b adalah instansiasi
		Burung b = new Burung();
		h.berjalan();
		h.bernafas();//karena sudah diextends dimakhluk hidup
		h.berjalan();
		h.bernafas();
	}
} 

//contoh syntax absctact class
// abstract class nama kelas abstrak
//{ 
//	void nama_method_abstak();
//	void nama_method_abstak();
//	{
//	
//	(..."isi method non abstak");
//	
//	}
// }  