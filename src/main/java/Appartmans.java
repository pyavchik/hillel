/**
 * Created by User on 12.02.2016.
 */
public class Appartmans {
    public static void main(String[] args) {
        int days = 1;
        int payForDay = 40;
        int payForAll = 40 * 30;

        if(days > 7){
            payForAll = payForDay*30 - 50;
        } else if ((days > 3)&(days <= 7)){
            payForAll = payForDay*30 - 20;
        }

        //System.out.println(payForAll);
    }
}
