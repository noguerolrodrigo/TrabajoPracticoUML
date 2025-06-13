package soporte;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1, "Ana García", "ana@mail.com");
        Tecnico tecnico1 = new Tecnico(1, "Luis Martínez", "Redes");

        SistemaSoporte sistema = new SistemaSoporte();

        TicketSoporte ticket1 = sistema.crearTicket("No hay acceso a internet.", usuario1);
        sistema.asignarTecnico(ticket1.getId(), tecnico1);

        ticket1.cerrarTicket();

        sistema.listarTickets();
        System.out.println("---- Tickets Cerrados ----");
        sistema.listarPorEstado("Cerrado");
    }
}
