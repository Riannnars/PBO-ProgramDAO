import java.util.List;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Program {
static void insert (){
    Fasilitas perintah = new Fasilitas();
    Barang atk = new Barang();
    atk.setKode_barang("B004");
    atk.setNama_barang("Buku Gambar");
    atk.setJumlah(17);
    atk.setHarga(3500);
    perintah.insert(atk);
    }
    

static void update(){
    Fasilitas perintah = new Fasilitas();
    Barang atk = new Barang();
    atk.setKode_barang("B002");
    atk.setNama_barang("BUKU GAMBAR");
    atk.setJumlah(12);
    atk.setHarga(3000);
    perintah.update(atk);
}
static void delete(){
    Fasilitas perintah = new Fasilitas();
perintah.delete("B002");
}
static void selectAll(){
    Fasilitas perintah = new Fasilitas();
List<Barang> list = perintah.selectAll();
for(Barang barang : list){
System.out.println(barang.getKode_barang());
System.out.println(barang.getNama_barang());
System.out.println(barang.getJumlah());
System.out.println(barang.getHarga());
System.out.println("-------------------------");
}
}


public static void main(String[] args) {
    insert();
        
}
}