package pl.szadowek91.shopProject.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@DynamicUpdate
@Table(name = "ADDRESS")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

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
    private UserEntity userId;
}
