package xml_constructor;

public class Person {
    private String pname;
    private Integer age;

    private Address homeAdd;
    private Address compAdd;

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", age=" + age +
                ", homeAdd=" + homeAdd +
                ", compAdd=" + compAdd +
                '}';
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(Address homeAdd) {
        this.homeAdd = homeAdd;
    }

    public Address getCompAdd() {
        return compAdd;
    }

    public void setCompAdd(Address compAdd) {
        this.compAdd = compAdd;
    }
}
