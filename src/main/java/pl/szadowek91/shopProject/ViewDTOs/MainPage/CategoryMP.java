package pl.szadowek91.shopProject.ViewDTOs.MainPage;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class CategoryMP {

    private Long id;

    @NotEmpty
    @Size(min = 3,max = 30)
    private String categoryName;

    @NotEmpty
    @Size(min = 15, max = 150)
    private String categoryDescription;

}
