class shinobi{
  private String noregistrasi,nama,peringkat;

  public void setNoregistrasi(String noregistrasi){
    this.noregistrasi = noregistrasi;
  }
  public String getNoregistrasi(){
    return noregistrasi;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public String getNama(){
    return nama;
  }
  public void setPeringkat(String peringkat){
    this.peringkat = peringkat;
  }
  public String getPeringkat(){
    return peringkat;
  }
}
public class konoha{
  public static void main(String[] args) {
    shinobi[] k = new shinobi[3];

    k[0] = new shinobi();
    k[0].setNoregistrasi("012606");
    k[0].setNama("Uchiha Sasuke");
    k[0].setPeringkat("Genin");

    k[1] = new shinobi();
    k[1].setNoregistrasi("012607");
    k[1].setNama("Uzumaki Naruto");
    k[1].setPeringkat("Genin");

    k[2] = new shinobi();
    k[2].setNoregistrasi("012601");
    k[2].setNama("Haruno Sakura");
    k[2].setPeringkat("Chunin");
    for(shinobi x:k){
    System.out.println("noregistrasi : " + x.getNoregistrasi());
    System.out.println("Nama : " + x.getNama());
    System.out.println("Nama : " + x.getPeringkat());
    System.out.println();
    }
  }
}
