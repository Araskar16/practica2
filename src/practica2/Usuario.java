/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author soporte
 */
public class Usuario extends Trabajador {
    private String departamento;
    private String puesto;
    private int antiguedad;
    private int nomina; 
    public Usuario(){
        
    }
    public Usuario (String nombre,
            String sexo
            , String direccion,
            int nomina
            , String departamento,
            int antiguedad ){
        //super indica que los atributos pertenecen ala clase padre
        super(nombre, sexo, direccion);
        this.nomina = nomina;
        this.departamento = departamento;
        this.antiguedad = antiguedad;
        this.puesto = puesto;   
               
}

    Usuario(String juan, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Usuario(String juan, String string, String hombre, String celaya, int i, String jefe_de_TI, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getNomina() {
        return nomina;
    }

   
    }
  
