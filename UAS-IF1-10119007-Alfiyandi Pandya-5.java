package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*
NIM : 10119007
Nama : Alfiyandi Pandya K
Kelas : IF 1
Tgl : 20 Februari 2021
No : 5
 */
    public class Mahasiswa  extends ModelMahasiswa {
        private String nim;
        private String nama;
        }
        public String getNim(){
            return nim;
        }
        public void setNim(String nim){
            this.nim = nim;
        }
        public String getNama(){
            return nama;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public void biodata(){
            System.out.println("Nim Mahasiswa : "+nim);
            System.out.println("Nim Mahasiswa : "+nama);
        }
    public class ModelMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119007");
        mahasiswa.setNama("Alfiyandi Pandya Khalfani");
        mahasiswa.biodata();
    }
}
