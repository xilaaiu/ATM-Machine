/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class AtmView {
    Scanner myObj = new Scanner(System.in);
    private static AtmView view = new AtmView();
    AtmMachine object = AtmMachine.getInstance();
    
    public AtmView(){   
    }
    
    public static AtmView getInstance(){   
        return view;
    }
    
    public int mainMenu(){
        object.displayPesan("\nMenu : \n1. Cek Saldo \n2. Tarik Tunai\n3. Setor Tunai\n4. Keluar\n\nMasukkan Pilihan : ");
        return myObj.nextInt();
    }
    
    public void cekSaldo(AtmModel model){
        object.displayPesan("Saldo Anda : Rp.");
        object.displaySaldo(model.getSaldo());
    }
    
    public void tarikTunai(AtmModel model){
        int jumlah;
        object.displayPesan("Masukkan jumlah (kelipatan 50000) : Rp.");
        jumlah = myObj.nextInt();
        
        if(model.cekBatasSaldo()){
            object.displayPesanBaris("Saldo Anda Mencapai Limit \n Kembali ke menu utama");
        } else if((model.getSaldo()-jumlah)< model.limitSaldo()){
            object.displayPesanBaris("Jumlah Penarikan melebihi limit penarikan");
        } else if((model.getSaldo()> jumlah) && (model.cekTransaksi(jumlah) == 1)){
            model.tarikSaldo(jumlah);
            object.displayPesan("Anda Mengambil Uang Sejumlah : Rp.");
            object.displaySaldo(jumlah);
        } else{
            object.displayPesanBaris("Transaksi gagal! Penarikan harus kelipatan 50000");
        }
    }
    
    public void setorTunai(AtmModel model){
        int jumlah;
        object.displayPesan("Masukkan jumlah (kelipatan 50000): Rp.");
        jumlah = myObj.nextInt();
        if(model.cekTransaksi(jumlah)==1){
            model.tambahSaldo(jumlah);
            object.displayPesan("Anda berhasil menambahkan saldo sebesar Rp.");
            object.displaySaldo(jumlah);
        } else{
            object.displayPesanBaris("Transaksi gagal! Inputan harus kelipatan 50000");
        }
        
    }
}