
package appliances;
/**
 * <b>Here you can find the main class of the project and you can test your program</b>
 * @version <font color="33FFDD">2.1</font>
 * @since <font color="33FFDD">22/02/2022</font>
 * @author <font color="33FFDD">Rafael Rodriguez</font>
 */
public class Appliances {
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Washer [] ws = new Washer[2];
        Television [] tvs = new Television[2];
        Washer ws1 = new Washer(100,80,12);
        
        ws[0] = ws1;
        ws1 = new Washer(500,100,100);
        ws[0].setLetter('B');
        ws[1] = new Washer(150,50,8);
        ws[1].setColor("gray");
        tvs[0]= new Television(50,10,30);
        tvs[0].setLetter('B');
        tvs[0].setWIFI(true);
        tvs[1]= new Television(200,65,50);
        tvs[1].setLetter('A');
        tvs[1].setColor("gray");
        for (Television t :tvs) {
            System.out.println(t);
        }
        Appliance [] as = new Appliance[4];
        as[0]=ws1;
        as[1]=ws[1];
        as[2]=tvs[0];
        as[3]=tvs[1];
        for(Appliance a : as){
            System.out.println(a);
        }
        Valuable [] vs = new Valuable[2];
        vs[0]=ws[0];
        vs[1]=tvs[0];
        for(Valuable v : vs){
            System.out.println(v);
        }
    }
    
}
