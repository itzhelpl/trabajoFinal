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
public class Paciente {
    private String idPac;
    private String nombre;
    private String domicilio;
    private String fecha_nac;
    private String no_afil;
    private String tel;
    private String fecha_ingre;
    private String fecha_sub;

   public Paciente() {
   }
    
//    public int agregarPaciente(String idPac, String nombre,String domicilio,
//            String fecha_nac, String tel, String fecha_ingre,
//            String fecha_sub, String no_afil){
//        return 1;
//    }
//    public boolean validaUsuario(String strUsuario, String strPassword) {
//        
//        return false;
//    }

    public Paciente(String idPac,String nombre,String domicilio,
            String fecha_nac,String no_afil, String tel, String fecha_ingre,
            String fecha_sub)
    {
        this.idPac=idPac;
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.fecha_nac=fecha_nac;
        this.no_afil=no_afil;
        this.tel=tel;
        this.fecha_ingre=fecha_ingre;
        this.fecha_sub=fecha_sub;
        
    }

    public void setIdPac(String idPac){
        this.idPac=idPac;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setFechaNaci(String fecha_nac){
        this.fecha_nac=fecha_nac;
    }
    public void setDomiclio(String domicilio){
        this.domicilio=domicilio;
    }
    public void setFechaSub(String fecha_sub){
        this.fecha_sub=fecha_sub;
    }
    public void setFechaIngre(String fecha_ingre){
        this.fecha_ingre=fecha_ingre;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public void setNoAfil(String no_afil){
        this.no_afil=no_afil;
    }
    
    
    public String getIdPac(){
        return idPac;
    }
    public String getNombre(){
        return nombre;
    }
    public String getFechaNac(){
        return fecha_nac;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public String getFechaIngre(){
        return fecha_ingre;
    }
    public String getFechaSub(){
        return fecha_sub;
    }
    public String getTel(){
        return tel;
    }
    public String getNoAfil(){
        return no_afil;
    }
    
    String[] getRow() {
        String [] row = new String[5];
        row[0] = idPac;
        row[1] = nombre;
        row[2] = domicilio;
        row[3] = fecha_nac;
        row[4] = no_afil;
        row[5] = tel;
        row[6] = fecha_ingre;
        row[7] = fecha_sub;
        
        
        return row;
    }
}
