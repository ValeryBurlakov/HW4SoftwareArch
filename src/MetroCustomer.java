import java.util.ArrayList;
import java.util.List;

public class MetroCustomer implements Customer{
    private String name;

    private double payment;
    private List<String> purchasedTickets;
    public MetroCustomer(String name, double payment) {
        this.name = name;
        this.payment = payment;
        this.purchasedTickets = new ArrayList<String>();
    }

    public  String getName() {
        return name;
    }

    public double getPayment() {
        return payment;
    }
    public List<String> getPurchasedTickets() {
        return purchasedTickets;
    }

    @Override
    public void buyTicket(TicketTypeMetro ticket) {
        if (payment >= ticket.getPrice()) {
            System.out.println(name + " \033[1mкупил билет\033[0m '" + ticket.getType() + "'"
                    + " цена - " + ticket.getPrice()
                    + ", \033[1mдата покупки:\033[0m " + ticket.getDate() + ", \033[1mномер билета:\033[0m " + ticket.getType() + "_" + ticket.numberTicket() + " <-");
            ticket.assignNumberTicket();
            purchasedTickets.add(ticket.getType() + "_" + ticket.numberTicket());

        } else {
            System.out.println(name + ", у Вас недостаточно средств для покупки билета - " + ticket.getType());
        }
    }
}
