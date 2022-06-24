package pl.szadowek91.shopProject.ViewDTOs.AdvertPage;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@ToString
@RequiredArgsConstructor
@Getter
public class CategoryAP {

    private Long id;

    @NotEmpty
    @Size(min = 3,max = 30)
    private String categoryName;
}
