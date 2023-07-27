package Homework2.Proposal;

import java.util.Calendar;

public class HotBeverage extends Beverage{

    private int temperature;

    public HotBeverage(int id, String name, int price, int quantity, Calendar best_before, double volume, int temperature ){
        super(id, name, price, quantity, best_before, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString(){
        
        return "\n"+"ID: "+getID()+"  "+getName() + "  Цена: " + getPrice() + "  Кол-во: " + getQuantity() + "  Объем: " + getVolume() + "  Температура: " + temperature 
                              + "  Годен до: " +getBest_before().get(Calendar.DAY_OF_MONTH) +"."+ getBest_before().get(Calendar.MONTH)
                              +"." + getBest_before().get(Calendar.YEAR) ;
    }


}