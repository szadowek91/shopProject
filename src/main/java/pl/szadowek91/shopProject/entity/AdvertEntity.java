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
@Table(name = "ADVERT")
public class AdvertEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @OneToOne()
    @JoinColumn(name = "CATEGORY_ID")
    private CategoryEntity category_id;

    private String title;

    private Integer price;

    private String description;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private Integer userId;
}
