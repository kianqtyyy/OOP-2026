
public class Main{
    public static void main(String[]args){
        Cellphone ver1 = new Cellphone();
        
        ver1.brand = "Iphone";
        ver1.version = "16 Pro Max";
        ver1.model = 2025;
        ver1.condition = "Brand New";


        var ver2 = new Cellphone();
        
        ver2.brand = "Infinix";
        ver2.version = "Note 10 Pro";
        ver2.model = 2023;
        ver2.condition = "Second Hand";

        ver1.printDetails();
        ver2.printDetails();
    }
}