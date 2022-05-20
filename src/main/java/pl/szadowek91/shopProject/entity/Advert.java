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
public class Advert {

    @Id
    @GenericGenerator(name = "advertId", strategy = "increment")
    @GeneratedValue(generator = "advertId")
    @Column(updatable = false)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "CATEGORY_ID")
    private Category category_id;

    private String title;

    private Integer price;

    private String description;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private ShopUser shopUserId;
}
