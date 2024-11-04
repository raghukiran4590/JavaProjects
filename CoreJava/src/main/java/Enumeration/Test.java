package Enumeration;

public class Test {
    public static void main(String[] args) {
  /*
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);
        Day d = Day.valueOf("MONDAY");
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.name());
        System.out.println(d.ordinal());

   */
        Day monday = Day.FRIDAY;
//        System.out.println(monday);

        String varam = switch (monday) {
            case MONDAY ->  "Somwar";
            case TUESDAY -> "Mangalwar";
            case WEDNESDAY -> "Budhwar";
            case THURSDAY -> "Guruwar";
            case FRIDAY -> "Shukrawar";
            case SATURDAY -> "Shaniwar";
            case SUNDAY -> "Raviwar";
            default -> "Nowar :)";
        };

        System.out.println(varam);

    }
}
