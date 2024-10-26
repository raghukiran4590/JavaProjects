package AccessModifiers1;

 public class AccessMod {

    String name;
    String address;
    String phone;
    protected int age;

    public AccessMod(String name, String address, String phone, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

     public void getContact() {
        System.out.println("The Contact Details are : "+name+"/"+address+"/"+phone+"/"+age);
    }

    public static void main(String[] args) {
        AccessMod ad = new AccessMod("Raghu", "Tampa", "9443175350", 35);
        ad.getContact();
    }
}
