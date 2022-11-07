package ActTema4.herencia;

import ActTema4.SmartDevice.smartDevice;

public class SmartPhone extends smartDevice {


    boolean sumergible;
    String pantalla;
    int mpxCamara;

    //CONSTRUCTOR
    public SmartPhone(){

    }
    public SmartPhone(String marca, String modelo, String sistemaOperativo, String procesador, int bateria, String material,
                      String color, double peso,
                      boolean sumergible, String pantalla, int mpxCamara) {
        super(marca, modelo, sistemaOperativo, procesador, bateria, material, color, peso);
        this.sumergible = sumergible;
        this.pantalla = pantalla;
        this.mpxCamara = mpxCamara;
    }

    public String getDatosMovil(){
    return "El movil es de la marca: " + getMarca() +
            " el modelo es: " + getModelo() + " tiene el sistema Operativo " + getSistemaOperativo() +
            "\ncon un procesador de: " + getProcesador() + "la bateria es de : " + getBateria() + " mAperios" +
            " \nhecho con el material " + getMaterial() + " de color " + getColor() + " con un peso de "  +
            getPeso() + " \ngramos. " + getSumergible()  + " con una pantala de tipo " + getPantalla() +
            " \ny por ultimo dispone de una camara de :" + getMpxCamara() + " Mpx";
    }



    public void setSumergible(String sumergible) { // creamos metodo para saber si es sumergible ono
        if (sumergible.equalsIgnoreCase("si")) {
            this.sumergible = true;// con el this le decimos que es la variable de la clase objeto
        } else {
            this.sumergible = false;
        }
    }

    public String getSumergible() {
        if (sumergible) {
            return "El movil es sumergible";
        } else {
            return "El movil no es sumergible";
        }
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public int getMpxCamara() {
        return mpxCamara;
    }

    public void setMpxCamara(int mpxCamara) {
        this.mpxCamara = mpxCamara;
    }

    // COMPORTAMIENTOS MOVIL
    public void Llamada() {
        System.out.println(" Riiiinnng, Riiiinnng ");
    }
    public void Mensaje() {
        System.out.println(" Bliinnng, Bliinnng ");
    }
}