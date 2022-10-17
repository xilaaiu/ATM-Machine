/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package atmmachine;

/**
 *
 * @author alexa
 */
public interface AtmDao {
    int getSaldo();
    int cekTransaksi(int jumlah);
    void tambahSaldo(int jumlah);
    void tarikSaldo(int jumlah);
    boolean cekBatasSaldo();
}
