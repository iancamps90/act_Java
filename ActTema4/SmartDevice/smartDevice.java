package ActTema4.SmartDevice;

public class smartDevice {
// CLASE BASE O SUPERCLASE O CLASE PADRE

    // ATRIBUTOS BASE

    protected String marca;
    private String modelo;
    private String sistemaOperativo;
    private String procesador;
    private int bateria;
    private String material;
    private String color;
    private double peso;
    private String Llamada;
    private String Mensaje;


    // METODO CONSTRUCTOR

    public smartDevice(){ // CONSTRUCTOR VACIO

    }
    public smartDevice(String marca, String modelo, String sistemaOperativo, String procesador,
                       int bateria, String material, String color, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.bateria = bateria;
        this.material = material;
        this.color = color;
        this.peso = peso;
    }



    // METODOS GETTER AND SETTER DE LOS ATRIBUTOS


    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public String getSistemaOperativo() {

        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {

        return procesador;
    }

    public void setProcesador(String procesador) {

        this.procesador = procesador;
    }

    public int getBateria() {

        return bateria;
    }

    public void setBateria(int bateria) {

        this.bateria = bateria;
    }

    public String getMaterial() {

        return material;
    }

    public void setMaterial(String material) {

        this.material = material;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }
}
