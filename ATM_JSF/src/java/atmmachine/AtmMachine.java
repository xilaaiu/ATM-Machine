/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

/**
 *
 * @author alexa
 */
public class AtmMachine {
    public static AtmMachine instance = new AtmMachine();
    public AtmMachine(){}
    public static AtmMachine getInstance() {
        return instance;
    }
    
   public void displayPesan(String message){  
     System.out.print(message);  
   }
   
   public void displayPesanBaris(String message){  
     System.out.println(message);  
   }
   
   public void displaySaldo(int jumlah){  
     System.out.println(jumlah);  
   }
}
