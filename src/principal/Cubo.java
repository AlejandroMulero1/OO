package principal;

public class Cubo {
    //Atributos de la clase
    String material, color;
    boolean asa;
    int capMaxima, contenidoActual;

    //Constructor por defecto
    public Cubo(){

    }

    //Consructor por parametros
    public Cubo(String material, String color, boolean asa, int capMaxima, int contenidoActual){
        this.material=material;
        this.color=color;
        this.asa=asa;
        this.capMaxima=capMaxima;
        this.contenidoActual=contenidoActual;
    }

    //Constructor "copia"
    public Cubo(Cubo cuboCopia){
        this.material=cuboCopia.getMaterial();
        this.color=cuboCopia.getColor();
        this.asa=cuboCopia.isAsa();
        this.capMaxima=cuboCopia.getCapMaxima();
        this.contenidoActual=cuboCopia.getContenidoActual();
    }

        //Metodos

    //Metodos para llenar, vaciar y volcar el cubo
    public void LlenarCubo(int capMaxima, int contenidoActual){

    }

    public void VaciarCubo(int capMaxima, int contenidoActual){

    }

    public void VolcarCubo(int capMaxima, int contenidoActual){

    }


    //Get y set de los atributos

        //Get y set de material
    public String getMaterial() {return material;}

    public void setMaterial(String material) {this.material = material;}

        //Get y set de color
    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

        //Is y set de asa
    public boolean isAsa() {return asa;}

    public void setAsa(boolean asa) {this.asa = asa;}

        //Get y set de capMaxima
    public int getCapMaxima() {return capMaxima;}

    public void setCapMaxima(int capMaxima) {this.capMaxima = capMaxima;}

        //Get y set contenidoActual
    public int getContenidoActual() {return contenidoActual;}

    public void setContenidoActual(int contenidoActual) {this.contenidoActual = contenidoActual;}
}
