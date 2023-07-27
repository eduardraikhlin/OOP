package Homework2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import Homework2.Proposal.Beverage;
import Homework2.Proposal.Food;
import Homework2.Proposal.HotBeverage;
import Homework2.Proposal.Product;

public class Market {

    public ArrayList <Product> getBase(){
        ArrayList <Product> my_list = new ArrayList<>();
        my_list.add(new Food(15,"Twix", 80, 10, new GregorianCalendar(2026, 10, 15, 0, 0),80));
        my_list.add(new Food(16,"Mars", 90, 9, new GregorianCalendar(2026, 10,0, 0, 0), 150));
        my_list.add(new Food(13,"Snickers", 60, 15, new GregorianCalendar(2026, 10,0, 0, 0),150));
        my_list.add(new Food(14,"Bounty", 85, 18, new GregorianCalendar(2026, 9, 13, 0, 0, 0), 120));
        my_list.add(new Beverage(32,"Coca-Cola", 150, 7, new GregorianCalendar(2026, 3, 8, 0, 0, 0), 0.33));
        my_list.add(new HotBeverage(21,"Nesсafe", 150, 35, 
                    new GregorianCalendar(2024, 5, 12, 0, 0, 0), 0.33, 25));
        my_list.add(new HotBeverage(22,"Jacobs", 120, 3, 
                    new GregorianCalendar(2024, 6, 07, 0, 0, 0), 0.33, 20));
        my_list.add(new HotBeverage(24,"Bushido", 170, 12, 
                    new GregorianCalendar(2024, 03, 11, 0, 0, 0), 0.33, 25));
        return my_list;

    }
}
