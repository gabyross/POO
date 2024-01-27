package reservas;
import clientes.Cliente;
import enums.Estado;
import enums.TipoCliente;
import habitaciones.Habitacion;
import hoteles.Hotel;

import java.util.*;

public class Reserva {

    private Cliente cliente;
    private Habitacion habitacion;
    private Date fechaComienzo;
    private int cantDiasDeEstadia;
    private float importeTotal;
    private float sena;
    private Estado estado;
    private float aPagar;
    private Hotel hotel;

    public Reserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantDiasDeEstadia, float sena, Hotel hotel) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaComienzo = fechaComienzo;
        this.cantDiasDeEstadia = cantDiasDeEstadia;
        this.importeTotal = calcularImporte(cliente, habitacion);

        if (cliente.getTipoCliente() == TipoCliente.Habitual) {
            this.sena = 0;
        } else if (sena > 0) {
            this.sena = sena;
        } else {
            throw new IllegalArgumentException("Como el cliente es esporádico, la seña debe ser mayor a cero");
        }

        this.estado = Estado.Activa;
        this.aPagar = this.importeTotal;
        this.hotel = hotel;
    }

    public float calcularImporte(Cliente cliente, Habitacion habitacion) {
        return (100 - cliente.getDescuento()) * habitacion.getPrecio() / 100;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public int getCantDiasDeEstadia() {
        return cantDiasDeEstadia;
    }

    public void setCantDiasDeEstadia(int cantDiasDeEstadia) {
        this.cantDiasDeEstadia = cantDiasDeEstadia;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    public float getSena() {
        return sena;
    }

    public void setSena(float sena) {
        this.sena = sena;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public float getaPagar() {
        return aPagar;
    }

    public void setaPagar(float aPagar) {
        this.aPagar = aPagar;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void acreditarSena() {
        float monto = getImporteTotal();
        this.setaPagar(monto - this.getSena());
        this.setEstado(Estado.Senada);
    }


    public void pagoImporte() {
        this.setaPagar(0);
    }

    public void llegadaCliente() {
        this.setEstado(Estado.Tomada);
        this.habitacion.setEstaDisponible(false);
    }

    public void salidaCliente(){
        this.setEstado(Estado.Cumplida);
    }

    public void verificarVencimiento(){
        Date fechaActual = new Date();
        if ( fechaActual.after(fechaComienzo)) {
            this.setEstado(Estado.Vencida);
        }
    }

    public void cancelarReserva(){
        this.setEstado(Estado.Cancelada);
        this.hotel.eliminarReserva(this);
    }
}