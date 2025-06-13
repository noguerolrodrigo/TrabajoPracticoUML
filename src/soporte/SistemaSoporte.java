package soporte;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;
    private static int contadorTickets = 0;

    public SistemaSoporte() {
        tickets = new ArrayList<>();
    }

    public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        TicketSoporte ticket = new TicketSoporte(++contadorTickets, descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    public void asignarTecnico(int ticketId, Tecnico tecnico) {
        for (TicketSoporte t : tickets) {
            if (t.getId() == ticketId) {
                t.asignarTecnico(tecnico.getNombre());
                break;
            }
        }
    }

    public void listarTickets() {
        for (TicketSoporte t : tickets) {
            System.out.println(t.mostrarDetalle());
            System.out.println("-----------");
        }
    }

    public void listarPorEstado(String estado) {
        for (TicketSoporte t : tickets) {
            if (t.getEstado().equalsIgnoreCase(estado)) {
                System.out.println(t.mostrarDetalle());
                System.out.println("-----------");
            }
        }
    }
}

