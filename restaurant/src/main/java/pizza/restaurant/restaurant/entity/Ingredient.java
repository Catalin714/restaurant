package pizza.restaurant.restaurant.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ingredients")
@Getter
@Setter
@NoArgsConstructor

public class Ingredient {

    @Id
    @Column(name = "ing_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "ing_name")
    private String ingredientName;

    @Column(name = "ing_weight")
    private int ingredientWeight;

    @Column(name = "ing_meas")
    private String ingredientMeas;

    @Column(name = "ing_price")
    private Double igredientPrice;

    @OneToOne(mappedBy = "ingredient", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Recipe recipe;

    public Ingredient(String ingredientName, int ingredientWeight, String ingredientMeas, Double igredientPrice) {
        this.ingredientName = ingredientName;
        this.ingredientWeight = ingredientWeight;
        this.ingredientMeas = ingredientMeas;
        this.igredientPrice = igredientPrice;

    }
}
