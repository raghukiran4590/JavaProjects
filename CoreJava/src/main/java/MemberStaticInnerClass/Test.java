package MemberStaticInnerClass;

public class Test {
    public static void main(String[] args) {
         Computer cmp = new Computer("Dell", "Inspiron");
         Computer.OperatingSystem osx = cmp.new OperatingSystem("osx");
         osx.displayInfo();

        Computer.USB usb1 = new Computer.USB("toshiba");
        Computer.USB usb2 = new Computer.USB("LG");


    }
}
