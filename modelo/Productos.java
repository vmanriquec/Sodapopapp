
package com.food.sistemas.sodapopapp.modelo;

/**
 * Created by Perseo on 05/08/2014.
 */
public class Productos {
    
    
    private int idproducto;
    private String nombreproducto,estadoproducto;
    private Double precventa;
    

        
        public Productos(int idproducto, String nombreproducto, String estadoproducto, Double precventa )
    {
        super();
        this.idproducto=idproducto;
        this.nombreproducto=nombreproducto;
        this.estadoproducto=estadoproducto;
        this.precventa=precventa;
    }
    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getEstadoproducto() {
        return estadoproducto;
    }

    public void setEstadoproducto(String estadoproducto) {
        this.estadoproducto = estadoproducto;
    }

    public Double getPrecventa() {
        return precventa;
    }

    public void setPrecventa(Double precventa) {
        this.precventa = precventa;
    }
@Override
    public String toString(){

    return this.idproducto+"  ."+this.nombreproducto+" S/.  "+this.precventa;
}

        
        
}

