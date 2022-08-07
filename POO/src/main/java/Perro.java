public class Perro {
    private String nombre;
    private boolean vacunado;
    private int edad;
    private String raza;
    private String color;
    private int numeroPatas;

    //constructor
    public Perro(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    public boolean isVacunado(boolean b){
        return vacunado;
    }
    public void setVacunado(boolean Vacunado){
        this.vacunado = Vacunado;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int Edad){
        this.edad = Edad;
    }

    public  String getRaza(){
        return raza;
    }
    public void setRaza(String Raza){
        this.raza = Raza;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String Color){
        this.color = Color;
    }

    public int getNumeroPatas(){
        return numeroPatas;
    }
    public void setNumeroPatas(int NumeroPatas){
        this.numeroPatas = NumeroPatas;
    }
}
