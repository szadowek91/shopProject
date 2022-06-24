package pl.szadowek91.shopProject.ViewDTOs.AdvertPage;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import pl.szadowek91.shopProject.entity.Category;

import java.math.BigDecimal;

@ToString
@Getter
@RequiredArgsConstructor
public class AdvertAP {

    private Long id;

    private Category category_id;

    private String title;

    private BigDecimal price;

    private String description;
}
