package pfc;

import java.util.ArrayList;

public class Debit_List {
    Form form = new Form();
    
//  Food Category
        private ArrayList<Food> food = new ArrayList<>();

        public void InsertFood(Food foodInsert){
            this.food.add(foodInsert);
        }
        public void ListAllFood(){
            for(int i1=0; i1<this.food.size(); i1++){
                System.out.println("- Food");
                System.out.println("\nName: " + this.food.get(i1).getName());
                System.out.println("Description:" + this.food.get(i1).getDescription());
                System.out.println("Price: " + this.food.get(i1).getValue());
                System.out.println(form.separator);
            }
        }
        public void FoodGraphic(){
            double totalFood = 0;
            for(int j1=0; j1<this.food.size(); j1++){
                totalFood = this.food.get(j1).getValue() + totalFood;
            }
            System.out.println("\n- Food");
            int convertFo = (int)(totalFood / 30);
            for(int k1=0; k1<convertFo; k1++){
                System.out.print("[]");
            }
            System.out.println(" $" + totalFood);
        }
    
//  Home Category
        private ArrayList<Home> home = new ArrayList<>();

        public void InsertHome(Home homeInsert){
            this.home.add(homeInsert);
        }
        public void ListAllHome(){
            for(int i2=0; i2<this.home.size(); i2++){
                System.out.println("- Home");
                System.out.println("\nName: " + this.home.get(i2).getName());
                System.out.println("Description:" + this.home.get(i2).getDescription());
                System.out.println("Price: " + this.home.get(i2).getValue());
                System.out.println(form.separator);
            }
        }
        public void HomeGraphic(){
            double totalHome = 0;
            for(int j2=0; j2<this.home.size(); j2++){
                totalHome = this.home.get(j2).getValue() + totalHome;
            }
            System.out.println("\n- Home");
            int convertHo = (int)(totalHome / 30);
            for(int k2=0; k2<convertHo; k2++){
                System.out.print("[]");
            }
            System.out.println(" $" + totalHome);
        }
        
//  Services Category
        private ArrayList<Services> services = new ArrayList<>();
        
        public void InsertServices(Services servicesInsert){
            this.services.add(servicesInsert);
        }
        public void ListAllServices(){
            for(int i3=0; i3<this.services.size(); i3++){
                System.out.println("- Services");
                System.out.println("\nName: " + this.services.get(i3).getName());
                System.out.println("Description:" + this.services.get(i3).getDescription());
                System.out.println("Price: " + this.services.get(i3).getValue());
                System.out.println(form.separator);
            }
        }
        public void ServicesGraphic(){
            double totalServices = 0;
            for(int j3=0; j3<this.services.size(); j3++){
                totalServices = this.services.get(j3).getValue() + totalServices;
            }
            System.out.println("\n- Services");
            int convertSe = (int)(totalServices / 30);
            for(int k3=0; k3<convertSe; k3++){
                System.out.print("[]");
            }
            System.out.println(" $" + totalServices);
        }
        
//  Health Category
        private ArrayList<Health> health = new ArrayList<>();

        public void InsertHealth(Health healthInsert){
            this.health.add(healthInsert);
        }
        public void ListAllHealth(){
            for(int i4=0; i4<this.health.size(); i4++){
                System.out.println("- Health");
                System.out.println("\nName: " + this.health.get(i4).getName());
                System.out.println("Description:" + this.health.get(i4).getDescription());
                System.out.println("Price: " + this.health.get(i4).getValue());
                System.out.println(form.separator);
            }
        }
        public void HealthGraphic(){
            double totalHealth = 0;
            for(int j4=0; j4<this.health.size(); j4++){
                totalHealth = this.health.get(j4).getValue() + totalHealth;
            }
            System.out.println("\n- Health");
            int convertHe = (int)(totalHealth / 30);
            for(int k4=0; k4<convertHe; k4++){
                System.out.print("[]");
            }
            System.out.println(" $" + totalHealth);
        }
        
//  Leisure Category
        private ArrayList<Leisure> leisure = new ArrayList<>();

        public void InsertLeisure(Leisure leisureInsert){
            this.leisure.add(leisureInsert);
        }
        public void ListAllLeisure(){
            for(int i5=0; i5<this.leisure.size(); i5++){
                System.out.println("- Leisure");
                System.out.println("\nName: " + this.leisure.get(i5).getName());
                System.out.println("Description:" + this.leisure.get(i5).getDescription());
                System.out.println("Price: " + this.leisure.get(i5).getValue());
                System.out.println(form.separator);
            }
        }
        public void LeisureGraphic(){
            double totalLeisure = 0;
            for(int j5=0; j5<this.leisure.size(); j5++){
                totalLeisure = totalLeisure+ this.leisure.get(j5).getValue();
            }
            System.out.println("\n- Leisure");
            int convertLe = (int)(totalLeisure / 30);
            for(int k5=0; k5<convertLe; k5++){
                System.out.print("[]");
            }
            System.out.println(" $" + totalLeisure);
        }
        
//  Other Category
        private ArrayList<Other> other = new ArrayList<>();
        
        public void InsertOther(Other otherInsert){
            this.other.add(otherInsert);
        }
        public void ListAllOther(){
            for(int i6=0; i6<this.other.size(); i6++){
                System.out.println("- Other");
                System.out.println("\nName: " + this.other.get(i6).getName());
                System.out.println("Description:" + this.other.get(i6).getDescription());
                System.out.println("Price: " + this.other.get(i6).getValue());
                System.out.println(form.separator);
            }
        }
        public void OtherGraphic(){
            double totalOther = 0;
            for(int j6=0; j6<this.other.size(); j6++){
                totalOther = this.other.get(j6).getValue() + totalOther;
            }
            System.out.println("\n- Other");
            int convertOt = (int)(totalOther / 30);
            for(int k6=0; k6<convertOt; k6++){
                System.out.print("[]");
            }
            System.out.println(" $" + totalOther);
        }
        

    
    
}
