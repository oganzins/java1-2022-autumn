package lv.javaguru.training.lesson15.optional;

import java.util.Optional;

public class Address {

    private static String UNSPECIFIED_VALUE = "UNSPECIFIED";

    private String country;
    private String postalIndex;
    private String addressLine;

    public Address(String country, String postalIndex, String addressLine) {
        this.country = country;
        this.postalIndex = postalIndex;
        this.addressLine = addressLine;
    }

    public String getCountry() {
        return Optional.ofNullable(country)
                .orElse(UNSPECIFIED_VALUE);
    }

    public String getPostalIndex() {
        return Optional.ofNullable(postalIndex)
                .orElse(UNSPECIFIED_VALUE);
    }

    public String getAddressLine() {
        return Optional.ofNullable(addressLine)
                .orElse(UNSPECIFIED_VALUE);
    }

    public String getFullAddress() {
        return getAddressLine() + ", " + getCountry() + ", " + getPostalIndex();
    }

}
