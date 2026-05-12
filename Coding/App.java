public class App {
    public static void main(String[] args) {
        System.out.println("________________________________________________");
        // Using `new` keyword to create a new object from class
        Computer pc = new Computer();

        // Alternative: using 'var' (JDK 11+)
        var asus = new Computer();

        // Setting object attributes
        pc.brand = "Lenovo";
        pc.name = "Legion";
        pc.ram = 32;
        pc.storage = 2048;
        pc.color = "Gray";

        // Getting object attributes
        System.out.println("Here are the computer info.");
        System.out.println("Brand: " + pc.brand);
        System.out.println("Name: " + pc.name);
        System.out.println("Ram: " + pc.ram + " GB");
        System.out.println("Storage: " + pc.storage + " GB");
        System.out.println("Color: " + pc.color);

        // Calling methods
        pc.bootUp();
        pc.shutdown();
        pc.playGame();

        // Using the parametered constructor
        var newPc = new Computer("Alienware", "APro", 12, 256, "Black");
        // Getting object attributes
        System.out.println("Here are the computer info.");
        System.out.println("Brand: " + newPc.brand);
        System.out.println("Name: " + newPc.name);
        System.out.println("Ram: " + newPc.ram + " GB");
        System.out.println("Storage: " + newPc.storage + " GB");
        System.out.println("Color: " + newPc.color);
    }
}
