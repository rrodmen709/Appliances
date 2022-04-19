
package appliances;
/**
 * A <b>washer</b> is a <b>appliance</b> where you can introduce your clothes with differents
 * products and in a certain time, it can clean your clothes
 * @version <font color="33FFDD">2.1</font>
 * @since <font color="33FFDD">22/02/2022</font>
 * @author <font color="33FFDD">Rafael Rodriguez</font>
 */
public class Washer extends Appliance{
    private int load;
    /**
     * In  this <h2>constructor</h2> you can find the following params
     * @param priceBase <b>double</b>
     * @param weight <b>integer</b>
     * @param load <b>integer</b>
     */
    public Washer(double priceBase, int weight, int load) {
        super(priceBase, weight);
        this.load = load;
    }
    /**
     * 
     * @return a <b>integer</b> with the load of washers
     */
    public int getLoad() {
        return load;
    }
    /**
     * This is a <b>method</b> that you can use to set the value of the following parameter
     * @param load <b>integer</b>
     */
    public void setLoad(int load) {
        this.load = load;
    }
    /**
     * 
     * @return a <b>string</b> of washer where you can see the load of the washer and 
     * her total price
     */
    @Override
    public String toString() {
        return super.toString()+"Washer{" + "load=" + load + '}'+calculatePrice();
    }
    /**
     * 
     * @return a <b>double</b> with the price of the washer depending if this appliance
     * has more than 10 Kilograms
     * @see appliances.Appliance#calculatePrice() 
     * @see appliances.Valuable#calculatePrice() 
     */
    @Override
    public double calculatePrice() {
        double price = 0;
        if(load>10) price = 50; 
        return super.calculatePrice()+price;
    }
    
}
