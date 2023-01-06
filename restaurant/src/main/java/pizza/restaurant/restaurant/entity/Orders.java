package pizza.restaurant.restaurant.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "row_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name="order_id")
    String orderId;

    @Column(name="created_at")
    Date createdAd;

    //@Column(name="item_id")
   // String itemId;

    @Column(name="quantity")
    Integer quantity;



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cust_id")
    private Customers customers;

    @Column(name="delivery")
    boolean delivery;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="add_id")
    Adress adress;

    public Orders (String orderId, Date createdAd, Integer qunatity, Customers customers, boolean delivery, Adress adress) {
        this.createdAd = createdAd;
        this.quantity = qunatity;
        this.customers = customers;
        this.delivery = delivery;
        this.adress=adress;
    }
}
