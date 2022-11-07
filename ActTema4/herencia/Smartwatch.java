package ActTema4.herencia;

import ActTema4.SmartDevice.smartDevice;

public class Smartwatch extends smartDevice {
    // ATRIBUTOS CLASE HIJA
    boolean sumergible;
    String pantalla;
    boolean llamadas;
    boolean tarjetaSim;

    public Smartwatch() {

    }

    // METEDO HEREDADO Y SUS PROPIOS ATRIBUTOS ESTABLECER INSTANCIAS
    public Smartwatch(String marca, String modelo, String sistemaOperativo, String procesador, int bateria, String material,
                      String color, double peso,
                      boolean sumergible, String pantalla, boolean llamadas, boolean tarjetaSim ){
        super(marca, modelo, sistemaOperativo, procesador, bateria, material, color, peso);
        this.sumergible = sumergible;
        this.pantalla = pantalla;
        this.llamadas = llamadas;
        this.tarjetaSim = tarjetaSim;
    }

    // METODO PARA PEDIR LOS DATOS DEL SMARTWATCH

    public String getDatosReloj(){
        return "El reloj es de la marca: " + getMarca() +
                " el modelo es: " + getModelo() + " tiene el sistema Operativo " + getSistemaOperativo() +
                "\n con un procesador de: " + getProcesador() + "la bateria es de : " + getBateria() + " mAperios" +
                " \n hecho con el material " + getMaterial() + " de color " + getColor() + " con un peso de "  +
                getPeso() + " \n gramos. " + getSumergible()  + " con una pantala de tipo " + getPantalla() +
                " \n  ademas este dispositivo es capaz de: " + getLlamadas() + " y tambien  " + getTarjetaSim() ;
    }





    // METODOS GET Y SET

    public void setSumergible(String sumergible) { // creamos metodo para si es sumergible o no
        if (sumergible.equalsIgnoreCase("si")) {
            this.sumergible = true;// con el this le decimos que es la variable de la clase objeto
        } else {
            this.sumergible = false;
        }
    }

    public String getSumergible() {
        if (sumergible) {
            return "El reloj es sumergible";
        } else {
            return "El reloj no es sumergible";
        }
    }
    public void setLlamadas(String llamadas) { // creamos metodo para saber si recibe llamadas
        if (llamadas.equalsIgnoreCase("si")) {
            this.llamadas = true;// con el this le decimos que es la variable de la clase objeto
        } else {
            this.llamadas = false;
        }
    }

    public String getLlamadas() {
        if (llamadas) {
            return "El reloj puede recibir llamadas";
        } else {
            return "El reloj no recibe llamadas";
        }
    }

    public void setTarjetaSim(String tarjetaSim) { // creamos metodo para si tiene tarjeta sim
        if (tarjetaSim.equalsIgnoreCase("si")) {
            this.tarjetaSim = true;// con el this le decimos que es la variable de la clase objeto
        } else {
            this.tarjetaSim = false;
        }
    }

    public String getTarjetaSim() {
        if (tarjetaSim) {
            return "El reloj tiene tarjeta sim";
        } else {
            return "El reloj no se le puede poner tarjeta Sim";
        }
    }

    public String getPantalla() {

        return pantalla;
    }

    public void setPantalla(String pantalla) {

        this.pantalla = pantalla;
    }
    public void Llamada() {
        System.out.println(" Riiiinnng, Riiiinnng ");
    }
    public void Mensaje() {
        System.out.println(" Bliinnng, Bliinnng ");
    }
}
