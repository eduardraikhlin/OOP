package Homework2;

import java.util.ArrayList;
import java.util.Scanner;

import Homework2.Proposal.Beverage;
import Homework2.Proposal.Food;
import Homework2.Proposal.HotBeverage;
import Homework2.Proposal.Product;

public class MakeOrder {

    /**
     * @param list_product
     * @return
     */
    public ArrayList <Order> getList_order(ArrayList<Product> list_product){  
        try (Scanner scan = new Scanner(System.in)) {
            ArrayList <Order> list_order  = new ArrayList<>();
            int idCommand;
            boolean no_exit = true;
            int id_product;
            int quantity;
            int count;
            int id_category;

            while (no_exit){ 
                int sum = 0;
                System.out.println();
                System.out.println("Список выбранных товаров");
                System.out.println(list_order);  
                for (Order order : list_order) {
                    sum = sum + order.getPrice() * order.getQuantity();
                }
                System.out.print("Итого к оплате: ");
                System.out.println(sum);


                System.out.println();
                System.out.println("[1] Показать товар из категории");
                System.out.println("[2] Поиск товара по названию");
                System.out.println("[3] Добавить продукт в корзину по ID");  
                System.out.println("[4] Убрать продукт в корзину по ID");
                System.out.println("[9] Покинуть покупки");
                System.out.println("[0]Перейти к оплате");
                System.out.print("Выберете команду: ");
                idCommand = scan.nextInt();
                scan.nextLine();

            
                if (idCommand==1){
                    System.out.println();
                    System.out.println("[1] Показать продукты категории: Еда");
                    System.out.println("[2] Показать продукты категории: Напитки"); 
                    System.out.println("[3] Показать продукты категории: Горячии напитки");
                    System.out.print("Выберете команду: ");
                    id_category = scan.nextInt();
                    scan.nextLine();
                    if (id_category==1){
                        for (Product el : list_product) {  
                            if (el instanceof Food ){    
                                if (el.getQuantity()>0){
                                    System.out.print(el);                                       
                                }
                            }
                        }    
                    }        
                    if (id_category== 2){ 
                        for (Product el : list_product) { 
                            if (el instanceof Beverage ){
                                if (el.getQuantity()>0){
                                    System.out.print(el);
                                }
                            }
                        }
                    }
                    if (id_category == 3){
                        for (Product el : list_product) {
                            if (el instanceof HotBeverage ){
                                if (el.getQuantity()>0){
                                    System.out.print(el);
                                }
                            }
                        }
                    }
                }
                
                if (idCommand==2){ 
                    System.out.println();
                    System.out.print("Введите название: ");
                    String name = scan.nextLine();
                    for (Product order : list_product) {
                        if (order.getName().equals(name)){
                        System.out.println(new Automat().findProduct(list_product,name).toString());    
                        }
                    }
                }

                if (idCommand==3){
                    System.out.print("Выберете ID товара: ");
                    id_product = scan.nextInt();
                    scan.nextLine();
                    for (Product product : list_product) {
                        if (id_product == product.getID()){
                            count = product.getQuantity();
                            System.out.println("Доступно для покупки: "+count);
                            System.out.print("Выберете кол-во товара: ");
                            quantity = scan.nextInt();
                            scan.nextLine();
                            if (quantity <0){ 
                                System.out.println();
                                System.out.println("Вы ввели отрицательное число");
                                break;
                            }
                            if (quantity <= count){ 
                                list_order.add(new Order(product.getID(),product.getName(),product.getPrice(),quantity));
                                product.setQuantity(count-quantity); 
                            }    
                            if (quantity>count) {
                                System.out.println("Вы запросили кол-ва большее чем в автомате");
                            }
                        break;
                        }
                    }
                }

                if (idCommand == 4){ 
                    System.out.print("Выберете ID товара на изменение: ");
                    id_product = scan.nextInt();
                    scan.nextLine();
                    for (Order pr : list_order) { 
                        if (id_product == pr.getID()){ 
                            count = pr.getQuantity(); 
                            for (Product el : list_product) { 
                                if (id_product == el.getID()){ 
                                    count = el.getQuantity() + pr.getQuantity();
                                    System.out.println("Доступно для покупки: "+count);
                                    System.out.print("Выберете кол-во товара: ");
                                    quantity = scan.nextInt();
                                    scan.nextLine();
                                    if (quantity <0){
                                        System.out.println();
                                        System.out.println("Вы ввели отрицательное число");
                                        break;
                                    }
                                    if (quantity == 0){                                       
                                        list_order.remove(pr);
                                    }
                                    if (quantity <= count){
                                        pr.setQuantity(quantity);
                                        el.setQuantity(count-quantity);
                                    }
                                    if (quantity> count){
                                        System.out.println();
                                        System.out.println("Вы запросили кол-ва большее чем в автомате");
                                    }
                                    break; 
                                }
                            }
                        break;   
                        }
                    }
                }

                if (idCommand == 0) { 
                    System.out.print("Введите сумму для оплаты: ");
                    int summa = scan.nextInt();
                    scan.nextLine();
                    if (summa < sum){ 
                        System.out.println();
                        System.out.println("Недостаточно средст отмените часть товара");
                        System.out.println();
                    }
                    else {
                        System.out.println();
                        System.out.println("Спасибо за покупку");
                        System.out.print("Ваша сдача: ");
                        System.out.println(summa-sum);
                        System.out.println("Не забудьте ваш товар и сдачу");
                        System.out.println();
                        no_exit =false;
                    }
                }

                if (idCommand == 9){
                    System.out.println("Спасибо за покупку");
                    no_exit =false;
                }
            }
   return list_order;
        }
    }
}
