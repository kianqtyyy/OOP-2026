public class Cellphone {
    String brand;
    String version;
    int model;
    char capacity;
    String condition;

    void printDetails(){
        System.out.printf("""
            %s %s %d
                
                """,brand,version );
    }
}