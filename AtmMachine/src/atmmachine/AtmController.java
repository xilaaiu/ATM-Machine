/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

/**
 *
 * @author alexa
 */
public class AtmController {
    public AtmView view;
    public AtmModel model;
    public AtmMachine tampil;
    int pilihan;
    
    public AtmController(){
        this.view = new AtmView();
        this.model = new AtmModel();
        
        while(pilihan!=4){
            pilihan = view.mainMenu();
            switch(pilihan){
                case 1 :
                    view.cekSaldo(model);
                    break;
                case 2:
                    view.tarikTunai(model);
                    break;
                case 3 :
                    view.setorTunai(model);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
