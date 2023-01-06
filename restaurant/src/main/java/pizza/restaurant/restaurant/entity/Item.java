package pizza.restaurant.restaurant.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Item")
public class Item {


    @Id
    @Column(name = "item_id")
    private String id;


    @OneToOne
    @JoinColumn(name = "recipe_id")
    Recipe recipe;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_cat")
    private String itemCat;

    @Column(name = "item_size")
    private String itemSize;

    @Column(name = "item_price")
    private String itemPrice;

}
