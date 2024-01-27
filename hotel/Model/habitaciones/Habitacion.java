package habitaciones;
import enums.*;

import java.util.*;
public class Habitacion {
    private int numero;
    private int piso;
    private float precio;
    private boolean estaDisponible;
    private TipoHabitacion tipoHabitacion;

    public Habitacion(int numero, int piso, float precio, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.piso = piso;
        this.precio = precio;
        this.estaDisponible = true;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
}