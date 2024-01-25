public class customer {
    //name and address atributes

    public String name;
    public address address; 

    
    public customer(String name, address address)
    {
        this.name = name; 
        this.address = address;
    }

    public String toString()
    {
        return "Customer[name="+name+", address="+ address.toString() +"]";
    }
}
