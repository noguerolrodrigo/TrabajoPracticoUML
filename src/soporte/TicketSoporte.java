package soporte;

import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnico;

    public TicketSoporte(int id, String descripcion) {
        this(id, descripcion, null);
    }

    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public void asignarTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String mostrarDetalle() {
        String detalle = "Ticket #" + id + " - " + descripcion +
                "\nEstado: " + estado +
                "\nFecha: " + fechaCreacion;
        if (usuario != null) detalle += "\nUsuario: " + usuario.getNombre();
        if (tecnico != null) detalle += "\nTécnico: " + tecnico;
        return detalle;
    }
}
