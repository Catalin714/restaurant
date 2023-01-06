package pizza.restaurant.restaurant.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
public class Inventory {

    @Id
    @Column(name = "inv_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ing_id",  referencedColumnName = "ing_id")
    private Recipe recipe;


    @Column(name = "quantity")
    private Integer quantity;

    public Inventory(Recipe recipe, Integer quantity) {
        this.recipe = recipe;
        this.quantity = quantity;
    }
}
