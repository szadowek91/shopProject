package pl.szadowek91.shopProject.ViewDTOs.AdvertPage;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public class AddressAP {

    private Long id;

    private String country;  // kraj

    private String province; // województwo

    private String city;  // miasto
}
