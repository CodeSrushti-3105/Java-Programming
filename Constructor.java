class car{
    String brand;
    int years;
    static String type = "Vehicles"; 

    car(String brand,int years){
         this.brand = brand ;
         this.years = years; 
        }

    void display(){
        System.out.println("Type: "+ type);
        System.out.println("Brand: "+ brand);
        System.out.println("Years: "+ years);
    }
    
    static void showType(){
        System.out.println("This is a " + type);
    }
}

public class Constructor {
    public static void main(String[] args) {
        car.showType();

        car car1 = new car("Suzuki",2005);
        car car2 = new car("Honda",2006);

        System.out.println("-----Car1-----");
        car1.display();
        System.out.println("-----Car2-----");
        car2.display();
        
    }
}
