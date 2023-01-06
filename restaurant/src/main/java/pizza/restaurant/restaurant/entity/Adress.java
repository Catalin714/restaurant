package pizza.restaurant.restaurant.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "adress")
public class Adress {

    @Id
    @Column(name="add_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name="delivery_adress1")
    String deliveryAdress1;
    @Column(name="delivery_adress2")
    String deliveryAdress2;
    @Column(name ="delivery_city")
    String city;
    @Column(name = "delivery_zipcode")
    String zipcode;

    @OneToOne(mappedBy = "adress", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Orders orders;

}
