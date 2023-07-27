package Homework2;

import java.util.ArrayList;

import Homework2.Proposal.Product;


public class Main {
    public static void main(String[] args) {

        ArrayList <Product> list_products = new ArrayList<>();

        list_products = new Market().getBase();
        new MakeOrder().getList_order(list_products);
    }
}
