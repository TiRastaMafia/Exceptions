package Application;

public class Phone {
    private long phone;

    public Phone(String phone){
        this.phone = Long.parseLong(phone);
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "" + phone;
    }
}
