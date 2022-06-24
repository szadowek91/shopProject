package pl.szadowek91.shopProject.ViewDTOs.AdvertPage;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public class SellerUserAP {

    private Long id;

    private String nick;

    private String firstName;

    private Integer phoneNumber;

    private String eMail;
}
