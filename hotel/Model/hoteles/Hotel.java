package hoteles;

import clientes.Cliente;
import habitaciones.Habitacion;
import reservas.Reserva;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

public class Hotel {
    List<Habitacion> habitaciones;
    List<Cliente> clientes;
    List<Reserva> reservas;

    public Hotel(List<Habitacion> habitaciones, List<Cliente> clientes, List<Reserva> reservas) {
        this.habitaciones = habitaciones;
        this.clientes = clientes;
        this.reservas = reservas;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    private void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void crearReserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantDiasDeEstadia, float sena) {
        Reserva reserva = new Reserva(cliente, habitacion, fechaComienzo, cantDiasDeEstadia, sena, this);
        this.addReserva(reserva);
        System.out.println("Reserva creada");
    }

    public void llegaCliente(Cliente cliente, Reserva reserva) {
        cliente.llegarAlHotel(reserva);
    }

}
