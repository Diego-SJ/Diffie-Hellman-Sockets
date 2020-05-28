package Main;

//@author juandiegosalasjimenez

import Cliente_DH.UI_Client;
import Servidor_DH.UI_Server;

 
public class RunProgram {
    public static void main(String[] args) {
        new UI_Client().setVisible(true);
        new UI_Server().setVisible(true);
    }

}
