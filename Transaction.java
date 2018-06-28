import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction implements  Comparable<Transaction>{
     private  double amount;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    String who;
     Date date;

     public Transaction(String who, Double amount, Date date) {
         this.who = who;
         this.amount = amount;
         this.date=date;
     }

     public Transaction(String Transaction){
         String [] trans=Transaction.split("//s+");
         this.who=trans[0];
          stringToDate(trans[1]);
          this.amount=Double.parseDouble(trans[2]);

     }
     public void  stringToDate(String string){
         SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");

         try {
             this.date= dateFormat.parse(string);
         } catch (ParseException e) {
             e.printStackTrace();
         }

     }
         
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }

     public int compareTo (Transaction that){

        if(this.amount>that.amount) return +1;
        if(this.amount<that.amount) return -1;
         return 0;
     }


}
