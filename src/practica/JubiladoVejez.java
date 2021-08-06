package practica;

public class JubiladoVejez extends Persona{

    public JubiladoVejez() {
    }
    
    

    public JubiladoVejez(String cedula, String nombre, float salarioBase, int aniosAporte) {
        super(cedula, nombre, salarioBase, aniosAporte);
    }            

    @Override
    public float calcularPension() {
        float jubilacion;
        jubilacion = super.calcularPension();
        jubilacion += getSalarioBase() * 0.15;                    
        return jubilacion;
    }
    
    @Override
    public String toString(){
        String datos = "\nJubilado por vejez\n\n";
        datos += super.toString();
        datos += "\nPension: " + calcularPension();
        
        return datos;
    }
    
    
    
}