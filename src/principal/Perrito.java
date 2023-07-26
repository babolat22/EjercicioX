package principal;

/**
 *
 * @author juanj
 */
class Perrito {
    private String nombre;
    private String raza;
    private int edad;
    
    public Perrito() { }
    public Perrito(String n, String r, int e){
        nombre= n;
        raza= r;
        edad = comprobarEdad(e);
    }
     
    public void cumpleanios(){
        edad++;
        System.out.println("Tu perro cumplio anios!!!");
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre( ){
        return nombre;
    }
    
    public void crearPerrito(String nombre, String raza){
        this.nombre=nombre;
        this.raza = raza;
        edad=1;
    }
    
    @Override
    public String toString(){
        return ("Perro-> Nombre: "+nombre + "\nRaza: "+raza+" Edad: "+ edad);
    }

    private int comprobarEdad(int x) {
        edad= x;
        return edad;
    }

    
}
