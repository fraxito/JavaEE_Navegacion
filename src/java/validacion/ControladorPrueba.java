/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author xp
 */
@ManagedBean
@RequestScoped
public class ControladorPrueba {

    private String mensaje = "";
    /**
     * Creates a new instance of ControladorPrueba
     */
    public ControladorPrueba() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String cambiaPagina(){
        if (mensaje.length() < 2){
            return ("paginaError");
        }
        else {
            String[] resultados = {"pagina1", "pagina2", "pagina3"};
            Random r = new Random();
            
            return (resultados[r.nextInt(2)]);
            
        }
    
    
    }
}
