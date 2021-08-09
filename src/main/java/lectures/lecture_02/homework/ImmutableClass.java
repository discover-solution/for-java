package lectures.lecture_02.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ImmutableClass example
 */
public final class ImmutableClass {
    private final Integer id;
    private final String name;
    private final Date joiningDate;
    private final List<ImmutableAddress> addresses;

    public ImmutableClass(Integer id, String name, Date joiningDate, List<ImmutableAddress> addresses){
        this.id = id;
        this.name = name;
        this.joiningDate = new Date(joiningDate.getTime());
        this.addresses = new ArrayList<>();
        this.addresses.addAll(addresses);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }
    public List<ImmutableAddress> getAddresses() {
        return new ArrayList<>(addresses);
    }
}