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
public class Category {

    @Id
    @GenericGenerator(name = "categoryId", strategy = "increment")
    @GeneratedValue(generator = "categoryId")
    @Column(updatable = false)
    private Integer id;

    private String categoryName;

    private String categoryDescription;
}
