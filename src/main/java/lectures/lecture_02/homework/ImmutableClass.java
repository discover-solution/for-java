package lectures.lecture_02.homework;

import java.util.Date;
import java.util.List;

/**
 * ImmutableClass example
 */
public final class ImmutableClass {
    private final Integer id;
    private final String name;
    private final Date joiningDate;
    private List<ImmutableAddress> addresses;

    public ImmutableClass(Integer id, String name, Date joiningDate, List<ImmutableAddress> addresses){
        this.id = id;
        this.name = name;
        this.joiningDate = new Date();
        this.addresses = addresses;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getJoiningDate() {
        return joiningDate;
    }
    public List<ImmutableAddress> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<ImmutableAddress> addresses) {
        this.addresses = addresses;
    }
}