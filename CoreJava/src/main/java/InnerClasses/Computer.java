package InnerClasses;

public class Computer {
    private String brand;
    private String model;
    private String osName;
    private OperatingSystem os;

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs() {
        return os;
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
