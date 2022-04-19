package appliances;

/**
 * A appliance is a <b>device</b> or <b>piece of equipment</b> designed to perform a specific
 * task
 *
 * @version <font color="33FFDD">2.1</font>
 * @since <font color="33FFDD">22/02/2022</font>
 * @author <font color="33FFDD">Rafael Rodriguez</font>
 * 
 */
public abstract class Appliance implements Valuable, Comparable {

    private double priceBase;
    private String color = "white";
    char letter = 'F';
    int weight;

    /**
     * In this <h2>constructor</h2> you can find the following params
     *
     * @param priceBase <b>double</b>
     * @param weight <b>integer</b>
     */
    public Appliance(double priceBase, int weight) {
        this.priceBase = priceBase;
        this.weight = weight;
    }

    /**
     *
     * @return a <b>double</b> with the price base
     */
    public double getPriceBase() {
        return priceBase;
    }

    /**
     * This is <b>method</b> that youcan use to set the value of the following
     * parameter
     *
     * @param priceBase <b>double</b>
     */
    public void setPriceBase(double priceBase) {
        this.priceBase = priceBase;
    }

    /**
     *
     * @return a <b>string</b> with the color that the persons choose for their
     * appliances
     */
    public String getColor() {
        return color;
    }

    /**
     * This is a <b>method</b> that you can use to set the value of the following
     * parameter
     *
     * @param color <b>string</b>
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return a <b>char</b> depending the energy efficiency of the appliances
     */
    public char getLetter() {
        return letter;
    }

    /**
     * This is a <b>method</b> that you can use to set the value of the following
     * parameter
     *
     * @param letter <b>char</b>
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }

    /**
     *
     * @return a <b>integer</b> with hw weigth of the appliances
     */
    public int getWeight() {
        return weight;
    }

    /**
     * This is a <b>method</b> that youcan use to set the value of the following
     * parameter
     *
     * @param weight <b>integer</b>
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     *
     * @return 100 default when the methods calculate the price
     */
    @Override
    public double calculatePrice() {
        return 100;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return a <b>string</b> of the appliances with therir price base, their colors,
     * their letters and therir weigth
     */
    @Override
    public String toString() {
        return "Appliance{" + "priceBase=" + priceBase + ", color=" + color + ", letter=" + letter + ", weight=" + weight + '}';
    }

}
