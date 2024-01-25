import java.util.Scanner;



public class order 
{
    //customer, array of pizzas, number of pizzas
    customer customer; 
    pizza[] pizzas;
    int numbOfPizzas; 
    public order(customer customer, pizza[] pizzas, int numbPizzas)
    {
        this.customer = customer; 
        this.pizzas = pizzas; 
        this.numbOfPizzas = numbPizzas; 
    }

    public String toString()
    {
        String listOFPizzas = "";
        for(pizza pizza : pizzas)
        {
            listOFPizzas = listOFPizzas + " " + pizza.toString() + "\n";
        }
        return customer.toString() + "\n" + numbOfPizzas + "Pizza/s: \n" + listOFPizzas; 
    }






    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("please enter your information");
        System.out.println("please enter your name:");
        String name = kb.nextLine();
        System.out.println("please enter your address:");
        System.out.println("please enter the street:");
        String street = kb.nextLine();
        System.out.println("please enter city:");
        String city = kb.nextLine();
        System.out.println("please enter state:");
        String state = kb.nextLine();
        System.out.println("please enter zip code");
        int zip = kb.nextInt();
        address custAddress = new address(street, city, state, zip);
        customer customerInfo = new customer(name, custAddress);
        System.out.println("how many pizzas do you want to order?");
        int pizzaCount = kb.nextInt();
        pizza [] pizzas = new pizza[pizzaCount];
        for(int i= 1; i <= pizzaCount; i++)
        {
            System.out.println("info for pizza-" + i);
            System.out.println("please enter the size:");
            String size = kb.next();
            System.out.println("please enter the number of toppings");
            int numbToppings = kb.nextInt();
            String [] toppings = new String[numbToppings];
            System.out.println("choices are: \n mushroom \n pineapple \n zucchini \n tomato \n spinach \n artichoke");
            for(int j=1; j <= numbToppings; j++)
            {
                System.out.println("choose topping-" + j + ":");
                String topping = kb.next();
                toppings[j-1] = topping; 
            }
            pizza pizza = new pizza(i, toppings, numbToppings);
            pizzas[i-1] = pizza;
        }
        order order = new order(customerInfo, pizzas, pizzaCount);
        System.out.println("Order Confirmation:");
        System.out.println(order.toString());



        kb.close();
    }
}



