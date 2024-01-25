public class address {
    public String street;
    public String city;
    public int zip; 
    public String state;
    
    public address(String street, String city, String state, int zip)
    {
        this.street = street; 
        this.city = city; 
        this.zip = zip; 
        this.state = state; 
    }

    public String toString()
    {
        return "Address[street= "+ street+", zip="+ zip+ ", city="+city+", state="+state+"]";
    }
}
