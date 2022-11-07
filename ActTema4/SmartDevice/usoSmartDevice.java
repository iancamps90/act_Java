package ActTema4.SmartDevice;

import ActTema4.herencia.SmartPhone;
import ActTema4.herencia.Smartwatch;

import javax.swing.*;

public class usoSmartDevice {



    public static void main(String[] args){

        smartDevice device = new smartDevice();

        SmartPhone movil = new SmartPhone("Samsung", "A-52s", "Android", "Quadcomm",
                5000, "Plastico", "Negro", 125.5, true, "Oled", 50  );

        Smartwatch reloj = new Smartwatch("Apple", "Watch Series 8", "iOS", "Apple So SiP (doble núcleo de 64 bits)",
                246, "Plastico y Metal", "Rosa", 38.8, true,  "Retina LTPO OLED",
                true, true);

        // DATOS MOVIL
        movil.setSumergible(JOptionPane.showInputDialog("¿ Es sumergible ?"));
        System.out.println(movil.getDatosMovil());

        // DATOS RELOJ
        reloj.setSumergible(JOptionPane.showInputDialog("¿ Es sumergible ?"));
        reloj.setLlamadas(JOptionPane.showInputDialog("¿ El reloj puede recibir llamadas ?"));
        reloj.setTarjetaSim(JOptionPane.showInputDialog("¿ al reloj se le puede insertar una tarjeta Sim ?"));
        System.out.println(reloj.getDatosReloj());

        // COMPORTAMIENTOS MOVIL
        movil.Llamada();
        movil.Mensaje();
        // COMPORTAMIENTOS RELOJ
        reloj.Llamada();
        reloj.Mensaje();










    }
}
