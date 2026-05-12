public class Computer {
    String brand;
    String name;
    int ram;
    int storage;
    String color;

    //Constructor - Java will default create one (with no param) if there is none
    public Computer(){
        System.out.println("Creating a new Computer with normal Constructor");
    }
    
    //Parametered Constructor
    public Computer(String brand, String name, int ram, int storage, String color){
        //'this' refer to the object we create
        System.out.println("Creating a new Computer with param Constructor");
        this.brand = brand;
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
    }

    //Methods
    public void bootUp(){
        System.out.println("Booting up computer");
    }

    public void shutdown(){
        System.out.println("Shutting down computer");
    }

    public void playGame(){
        System.out.println("Playing game with computer");
    }
}


