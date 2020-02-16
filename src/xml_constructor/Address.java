package xml_constructor;

public class Address {
    private String add;
    private String tel;

    @Override
    public String toString() {
        return "Address{" +
                "add='" + add + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
