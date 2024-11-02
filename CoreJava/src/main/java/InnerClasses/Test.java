package InnerClasses;

public class Test {

    public static void main(String[] args) {
        Computer cmp = new Computer("Dell", "Inspiron", "osx");
        cmp.getOs().displayInfo();
    }

}
