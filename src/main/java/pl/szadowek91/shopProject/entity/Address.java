package pl.szadowek91.shopProject.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@DynamicUpdate
public class Address {

    @Id
    @GenericGenerator(name = "addressId", strategy = "increment")
    @GeneratedValue(generator = "addressId")
    @Column(updatable = false)
    private Long id;

    private String country;  // kraj

    private String province; // województwo

    private String city;  // miasto

    private String zipCode; // kod pocztowy

    private String district; // dzielnica

    private String street;// ulica

    private String houseNumber; // numer domu (lub bloku)

    private String flatNumber; // numer mieszkania

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private ShopUser shopUserId;
}
