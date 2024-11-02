package MemberStaticInnerClass;

public class Computer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    static class USB {
        private String usbName;

        public USB(String usbName) {
            this.usbName = usbName;
        }
    }

    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo() {
            System.out.println("Computer Brand : "+brand+" OS : "+osName);
        }
    }
}

