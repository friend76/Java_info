import java.io.Console;
public class Main
{   
    static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years)
    {
        int counter=0;
        Car [] answer = new Car[5];
        for (int i = 0;i<5;i++)
        {
            if (cars[i].marka==brend && years>=2025-cars[i].made_year)
            {
                answer[counter]=cars[i];
                counter+=1;
            }
        }
        return answer;
    }
    void main(String[] argv)
    {//int id,int made_year,int price, str marka,str model,str color,str registr
        Car[] mashina = new Car[5];
        mashina[0] = new Car(256,19991,805,"УАЗ","Патриот","чёрный","A000BC");
        mashina[1] = new Car(0,0,0,"","","","");
        mashina[2] = new Car(351531,2004,300,"Toyota","celicia","white","C876AB");
        mashina[1].set_id(123);mashina[1].set_made_year(2007);mashina[1].set_price(25000);
        mashina[1].set_marka("Toyota");mashina[1].set_model("corolla");mashina[1].set_color("red");
        getCarByBrendAndYearOperational(mashina,"Toyota",10);
    }
}

