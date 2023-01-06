package pizza.restaurant.restaurant.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "recipe")
@Getter
@Setter
@NoArgsConstructor
public class Recipe {

    @Id
    @Column(name="row_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "recipe_id")
    private String recipeId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ing_id",  referencedColumnName = "ing_id")
    private Ingredient ingredient;

    @Column(name = "quantity")
    private Integer quantity;

    @OneToOne(mappedBy = "recipe", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Item item;

    public Recipe(String recipeId, Ingredient ingredient, Integer quantity ){
        this.recipeId = recipeId;
        this.ingredient = ingredient;
        this.quantity = quantity;
    }
}
