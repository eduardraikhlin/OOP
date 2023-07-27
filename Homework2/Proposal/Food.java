package Homework2.Proposal;

import java.util.Calendar;

public class Food extends Product{

  private double weight;

    public Food(int id, String name, int price, int quantity, Calendar best_before, double weight){
        super(id, name, price, quantity, best_before);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        
        return "\n"+"ID: "+getID()+"  "+getName() + "  Цена: " + getPrice() + "  Кол-во: " + getQuantity() + " Масса: " + weight 
                              + "  Годен до: " +getBest_before().get(Calendar.DAY_OF_MONTH) +"."+ getBest_before().get(Calendar.MONTH)
                              +"." + getBest_before().get(Calendar.YEAR) ;
    }
}
