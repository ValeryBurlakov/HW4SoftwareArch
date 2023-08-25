public class MetroSeller implements SellerMetro{
    private String name;
    public MetroSeller(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void sellMetroTicket(Customer customer, TicketTypeMetro ticket) {
        customer.buyTicket(ticket);

    }

    @Override
    public void sellTicket(Customer customer, TicketType ticket) {
        System.out.println("Не используемый метод");
    }
}
