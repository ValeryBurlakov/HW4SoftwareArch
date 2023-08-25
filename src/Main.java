
public class Main {
    public static void main(String[] args) {
        // продавец билетов
        SellerMetro sellerMetro  = new MetroSeller("Барыга");

        // покупатели билетов
        MetroCustomer customer1 = new MetroCustomer("Лидия", 2500);
        MetroCustomer customer2 = new MetroCustomer("Иван", 150);
        MetroCustomer customer3 = new MetroCustomer("Таисия", 200);
        MetroCustomer customer4 = new MetroCustomer("Вермонт", 20000000);
        MetroCustomer customer5 = new MetroCustomer("Галина", 2700);

        // сделка между покупателем и продавцом
        sellerMetro.sellMetroTicket(customer1, TicketTypeMetro.ONETIME);
        sellerMetro.sellMetroTicket(customer2, TicketTypeMetro.MONTHLY);
        sellerMetro.sellMetroTicket(customer3, TicketTypeMetro.ONETIME);
        sellerMetro.sellMetroTicket(customer4, TicketTypeMetro.STUDENTMONTHLY);
        sellerMetro.sellMetroTicket(customer5, TicketTypeMetro.MONTHLY);
        sellerMetro.sellMetroTicket(customer1, TicketTypeMetro.ONETIME);
        sellerMetro.sellMetroTicket(customer4, TicketTypeMetro.MONTHLY);
        sellerMetro.sellMetroTicket(customer4, TicketTypeMetro.ONETIME);

        // список билетов
        System.out.println("у Вермонта билеты: " + customer4.getPurchasedTickets());

    }
}