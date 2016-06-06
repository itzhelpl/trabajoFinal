/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author Andrea Itzhel
 */
public class daMedicos {
    private String tipo_sangre;
    private String sector;
    private String acceso_vas;
    private String turno;
    private String horario;
    private int costo;
    
//    public int agregardaMedicos(String tipo_sangre, String sector, String acceso_vas, 
//            String turno, String horario, int costo){
//        return 1;
//    }

    public daMedicos(String tipo_sangre, String sector, String acceso_vas,
            String turno, String horario, int costo) {
        this.tipo_sangre=tipo_sangre;
        this.sector=sector;
        this.acceso_vas=acceso_vas;
        this.turno=turno;
        this.horario=horario;
        this.costo=costo;
    }

    daMedicos(String tipo_sangre, String sector, String acceso_vas, String turno, String horario, String costo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setTipoSangre(String tipo_sangre){
        this.tipo_sangre=tipo_sangre;
    }
    public void setSector(String sector){
        this.sector=sector;
    }
    public void setAccesoVas(String acceso_vas){
        this.acceso_vas=acceso_vas;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public void setCosto(int costo){
        this.costo=costo;
    }
    
    public String getTipoSangre(){
        return tipo_sangre;
    }
    public String getSector(){
        return sector;
    }
    public String getAccesoVas(){
        return acceso_vas;
    }
    public String getTurno(){
        return turno;
    }
    public String getHorario(){
        return horario;
    }
    public int getCosto(){
        return costo;
    }
    
    
}
