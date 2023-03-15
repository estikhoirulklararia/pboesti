public class Barang {
    String nama_barang;
    String nama_pembeli;
    int harga;
    int total_harga;
   
    //overloading
    public Barang(){
    }
   
    public Barang(String nama_pembeli, String nama_barang, int harga){
        this.nama_barang = nama_barang;
        this.nama_pembeli = nama_pembeli;
        this.harga = harga;
        infoBarang();
    }
 
    private void infoBarang() {
        System.out.println("Barang berhasil dibuat dengan rincian sbb :\n"
            + "Nama Barang : " + this.nama_barang
            + "\n Nama Pembeli : "+ this.nama_pembeli
            + "\n Harga Barang : "+ this.harga);
         //To change body of generated methods, choose Tools | Templates.
    }
 
    public int hitungHargaBeli(int jumlah){
        this.total_harga = this.harga * jumlah;
        return this.total_harga;
    }
   
    public int sisaKembalian(int nominalUang){
        return nominalUang - this.total_harga;
    }
   
}