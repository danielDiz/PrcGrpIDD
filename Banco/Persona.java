package Banco;

public class Persona {
    //region Atributos
    private String nombre;
    private String DNI;

    //endregion
    //region Constructor
    public Persona(String nombre, String DNI){
        setNombre(nombre);
        setDNI(DNI);
    }

    //endregion
    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    //endregion
    //region Otros metodos
    public void printNombre(){
        System.out.print(getNombre());
    }

    public void printDNI(){
        System.out.print(getDNI());
    }

    //endregion
}
