package Enumeration;

public enum Day {
    MONDAY("monday", "Lunes"),
    TUESDAY("tuesday", "Martes"),
    WEDNESDAY("wednesday", "Miércoles"),
    THURSDAY("thursday", "Jueves"),
    FRIDAY("friday", "Viernes"),
    SATURDAY("saturday", "Sábado"),
    SUNDAY("sunday", "Domingo");

    private Day(String lowerCase,String nativeCase) {
//        System.out.println("Constructor is called...");
        this.lowerCase = lowerCase;
        this.nativeCase = nativeCase;
    }

    private  String lowerCase;

    public String getLowerCase() {
        return this.lowerCase;
    }

    private String nativeCase;

    public String getNativeCase() {
        return nativeCase;
    }

    public static void main(String[] args) {
        Day mon = Day.MONDAY;
        System.out.println(mon.getLowerCase());
        System.out.println(mon.getNativeCase());
    }
}
