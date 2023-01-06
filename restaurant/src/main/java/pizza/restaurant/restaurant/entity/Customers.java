package pizza.restaurant.restaurant.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
public class Customers {

    @Id
    @Column(name="cust_id")
    @GeneratedValue(strategy = GenerationType.AUTO)

    Integer id;

    @Column(name = "cust_firstname")
    String firstName;

    @Column(name="cust_lastname")
    String lastName;

    @OneToOne(mappedBy = "customers", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Orders orders;

    public Customers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
