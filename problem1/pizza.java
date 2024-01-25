public class pizza 
{
    //size, array of toppings, number of toppings
    int size; 
    String [] toppings; 
    int numbToppings; 

    public pizza(int size, String[] toppings, int numbToppings)
    {
        this.size = size; 
        this.toppings = toppings;
        this.numbToppings = numbToppings;
    }

    public String toString()
    {
        String listOfToppings="";
        for(String topping : toppings)
        {
            listOfToppings = listOfToppings + " " + topping;
        }
        return size + " " + listOfToppings;
    }
}
