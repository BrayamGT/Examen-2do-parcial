
package practica;



public abstract class Persona implements Jubilado{
    
    private String cedula;
    private String nombre;
    private float salarioBase;
    private int aniosAporte;   

    public Persona() {
    }
    
   
    public Persona(String cedula, String nombre, float salarioBase, int aniosAporte) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.aniosAporte = aniosAporte;
    }
    
    
    
    @Override
    public float calcularPension(){
        float jubilacion;
        if(aniosAporte <= 10){
            jubilacion = salarioBase * 0.5f;
        }else if(aniosAporte <=20){
            jubilacion = salarioBase * 0.6f;
        }else if(aniosAporte <=30){
            jubilacion = salarioBase * 0.7f;
        }else if(aniosAporte <=35){
            jubilacion = salarioBase * 0.8f;
        }else if(aniosAporte <=39){
            jubilacion = salarioBase * 0.9f;
        }else{
            jubilacion = salarioBase;
        }
        return jubilacion;
    }

    @Override
    public String toString(){
        String datos;
        datos = "Cedula: " + cedula +
                "\nNombre: " + nombre +
                "\nSalario base: " + salarioBase +
                "\nAños de aporte: " + aniosAporte;
        return datos;
                
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAniosAporte() {
        return aniosAporte;
    }

    public void setAniosAporte(int aniosAporte) {
        this.aniosAporte = aniosAporte;
    }
    
}