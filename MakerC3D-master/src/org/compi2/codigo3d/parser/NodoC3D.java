package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad,verdad,falsa;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
     public NodoC3D(String v,String f) {
        this.verdad=v;
        this.falsa=f;
    }

    public String getVerdad() {
        return verdad;
    }

    public void setVerdad(String verdad) {
        this.verdad = verdad;
    }

    public String getFalsa() {
        return falsa;
    }

    public void setFalsa(String falsa) {
        this.falsa = falsa;
    }
    
    public String getCad(){
        return cad;
    }
        
}
