package dev.marvinrosa.model;

public class Order {

    private int id;
    private static int lastId;
    private String description;
    private Customer customer;
    private OrderDetail[] items;
    private int indexItems;
    public static final int MAX_ITEMS = 1000;

    public Order(String description,Customer customer) {
       this.description = description;
        this.customer = customer;
        this.items = new OrderDetail[MAX_ITEMS];
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderDetail[] getItems() {
        return items;
    }

    /**
     * Interface
     */

    public void addItems(OrderDetail item) {
        if(indexItems < MAX_ITEMS){
            this.items[indexItems++] = item;
        }
    }


    /**
     *  Sum of articles
     */


    public float TotalCalc() {
        float total = 0.0f;
        for (OrderDetail item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.subTotalCalc();
        }
        return total;
    }

    public String OrderPrint(){
        StringBuilder sb = new StringBuilder("Order Nº: ");
        sb.append(id)
                .append("\nCliente: ")
                .append(this.customer.getName())
                .append("\t Email: ")
                .append(customer.getEmail())
                .append("\nDescripción: ")
                .append(this.description)
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(OrderDetail orderDetail: this.items){
            if(orderDetail == null){
                continue;
            }
            sb.append(orderDetail)
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(TotalCalc());

        return sb.toString();
    }

    @Override
    public String toString() {
        return OrderPrint();
    }
}
