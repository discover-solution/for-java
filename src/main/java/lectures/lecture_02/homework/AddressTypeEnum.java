package lectures.lecture_02.homework;

public enum AddressTypeEnum {
    HOME("HOME"),RESIDENCE("RESIDENCE");

    private final String addressType;

    AddressTypeEnum(String addressType){
        this.addressType = addressType;
    }

    public String getAddressType() {
        return addressType;
    }
}
