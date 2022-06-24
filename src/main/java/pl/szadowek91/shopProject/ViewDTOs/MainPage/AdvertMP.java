package pl.szadowek91.shopProject.ViewDTOs.MainPage;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@RequiredArgsConstructor
@Getter
public class AdvertMP {

    private Long id;

    private String title;

    private BigDecimal price;
}
