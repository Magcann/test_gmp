package model;

public class Customer {
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String phoneNumber;
    private final String dateReceipt;
    private final String comment;


public Customer(String name, String surname, String address, String metro, String phoneNumber, String dateReceipt, String comment)
    {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.phoneNumber = phoneNumber;
        this.dateReceipt = dateReceipt;
        this.comment = comment;
    }

public static Customer getFirstCustomer(){
        return new Customer(
                "Иван",
                "Иванов",
                "ул. Иванова 55",
                "Сокольники",
                "+7978676727",
                "29.03.2022",
                "Текст комента");
}

public static Customer getSecondCustomer(){
        return new Customer(
                "Петр",
                "Петров",
                "ул. Петра Великого",
                "Сокольники",
                "+7978676728",
                "29.03.2022",
                "Текст комента");
    }

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getAddress() {return address;}

    public String getMetro() {return metro;}

    public String getPhoneNumber() {return phoneNumber;}

    public String getDateReceipt() { return dateReceipt;}

    public String getComment() {return comment;}
}
