package clientes;
import enums.*;
import habitaciones.Habitacion;
import hoteles.Hotel;
import reservas.Reserva;

import java.util.*;

public class Cliente {

    private int numeroDocumento;
    private String nombre;
    private TipoCliente tipoCliente;
    private int cantReservasEnElYear;
    private float descuento;

    public Cliente(int numeroDocumento, String nombre, TipoCliente tipoCliente, float descuento) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.cantReservasEnElYear = 0;
        this.descuento = descuento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCantReservasEnElYear() {
        return cantReservasEnElYear;
    }

    public void setCantReservasEnElYear(int cantReservasEnElYear) {
        this.cantReservasEnElYear = cantReservasEnElYear;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void acreditarSena(Reserva reserva){
        if (this.getTipoCliente() == TipoCliente.Esporadico) {
            reserva.acreditarSena();
        } else {
            throw new IllegalArgumentException("Los clientes habituales no acreditan sena");
        }
    }

    public void llegarAlHotel(Reserva reserva){
        reserva.llegadaCliente();
    }

    public void pagarReserva(Reserva reserva){
        reserva.pagoImporte();
    }

    public void salirDellHotel(Reserva reserva){
        reserva.salidaCliente();
    }
    public void cancelarReserva(Reserva reserva){
        reserva.cancelarReserva();
    }

    public void hacerReserva(Hotel hotel, Habitacion habitacion, Date fechaComienzo, int cantDiasDeEstadia, float sena){
         hotel.crearReserva(this, habitacion, fechaComienzo, cantDiasDeEstadia, sena);
    }
}