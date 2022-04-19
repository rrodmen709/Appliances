package appliances;

/**
 * A <b>television</b> is a <b>appliance</b> where you can see images and you can heard sounds
 * about somethimg that you are watching like serie or movie.
 *
 * @version <font color="33FFDD">2.1</font>
 * @since <font color="33FFDD">22/02/2022</font>
 * @author <font color="33FFDD">Rafael Rodriguez</font>
 */
public class Television extends Appliance {

    private int lenght;
    private boolean WIFI = false;

    /**
     * In this <h2>constructor</h2> you can find the following params
     *
     * @param priceBase <b>double</b>
     * @param weight <b>integer</b>
     * @param lenght <b>integer</b>
     */
    public Television(double priceBase, int weight, int lenght) {
        super(priceBase, weight);
        this.lenght = lenght;
        super.setColor("black");
    }

    /**
     *
     * @return a <b>integer</b> with the length of tvs
     */
    public int getLenght() {
        return lenght;
    }

    /**
     * This is a <b>method</b> that youcan use to set the value of the following
     * parameter
     *
     * @param lenght <b>integer</b>
     */
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    /**
     *
     * @return a <b>boolean</b> indicating if the TV has wifi
     */
    public boolean isWIFI() {
        return WIFI;
    }

    /**
     * This is a <b>method</b> that youcan use to set the value of the following
     * parameter
     *
     * @param WIFI <b>boolean</b>
     */
    public void setWIFI(boolean WIFI) {
        this.WIFI = WIFI;
    }

    /**
     *
     * @return a <b>double</b> called price that calculate the total price depending
     * the extras that the tv can contain like wifi
     * @see appliances.Appliance#calculatePrice()
     * @see appliances.Valuable#calculatePrice() 
     */
    public double calculatePrice() {
        double price = 0;
        if (WIFI) {
            price = 40;
        }
        if (lenght > 40) {
            price = (super.calculatePrice() + price) * 1.25;
        }
        return price;
    }

    /**
     *
     * @return a <b>string</b> of television with the lenght, if that contain wifi and
     * the total price
     */
    @Override
    public String toString() {
        return "Television{" + "lenght=" + lenght + ", WIFI=" + WIFI + '}' + calculatePrice();
    }

}
