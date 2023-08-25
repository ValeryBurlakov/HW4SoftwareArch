import java.util.Date;

public enum TicketTypeMetro implements TicketType, TicketInfo {
    ONETIME("Единоразовый", 70),
    STUDENTMONTHLY("Месячный_для_студентов", 740),
    MONTHLY("Месячный", 2700);

    private final String type;
    private final double price;
    private final Date date;
    private static int ticketCounter = 1;
    private int numberTicket = 1;


    TicketTypeMetro(String type, double price) {
        this.type = type;
        this.price = price;
        this.date = new Date(); // Присваиваем текущую дату и время при покупке билета
//        this.numberTicket = ++ticketCounter; // Присваиваем уникальный номер билету
    }

    public void assignNumberTicket() {
        this.numberTicket = ++ticketCounter;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public int numberTicket() {
        return numberTicket;
    }
}