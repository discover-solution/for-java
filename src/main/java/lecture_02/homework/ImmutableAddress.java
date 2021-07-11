package lecture_02.homework;

import java.io.Serializable;
import java.util.Date;

public final class ImmutableAddress implements Serializable{
    private static final long serialVersionUID = -6754014180485545814L;
    private static final int defaultPinCode = 123456;

    private String addressType;
    private Integer pinCode;
    private Date lastVisitDate;

    ImmutableAddress(String addressType, Integer pinCode, Date date){
        this.addressType = addressType;
        this.pinCode = (pinCode > 999999 || pinCode < 000000) ? defaultPinCode : pinCode;
        this.lastVisitDate = new Date(date.compareTo(lastVisitDate));
    }

    public String getAddressType(){
        return addressType;
    }

    public Integer getPinCode(){
        return pinCode;
    }

    public Date getLastVisitDate(){
        return new Date(lastVisitDate.getTime());
    }
}