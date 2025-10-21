public class Car
{
    public int id,made_year,price;
    public String marka,model,color,registr; 
    public Car(int id,int made_year,int price, String marka,String model,String color,String registr)
    {
        this.id= id;this.made_year=made_year;this.price = price;
        this.marka=marka;this.model=model;this.registr=registr;this.color=color; 
    }
    public int get_id(){return id;}
    public void set_id(int id){this.id = id;}

    public int get_made_year(){return made_year;}
    public void set_made_year(int made_year){this.made_year = made_year;}

    public int get_price(){return price;}
    public void set_price(int price){this.price = price;}

    public String get_marka(){return marka;}
    public void set_marka(String marka){this.marka = marka;}

    public String get_model(){return model;}
    public void set_model(String model){this.model = model;}

    public String get_color(){return color;}
    public void set_color(String color){this.color = color;}

    public String get_registr(){return registr;}
    public void set_registr(String registr){this.registr = registr;}
}
