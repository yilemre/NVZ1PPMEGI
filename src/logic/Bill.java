package logic; 
import java.sql.Timestamp;


public class Bill {
    private final int bill_id;
    private static int count_id = 0; 
    private final Timestamp bill_date; 
    private String billName;
    private int billStatus;
    private int payKind;
    private double amount;
    
    Bill(String name, int status,int payKind, double amount){
	this.bill_id = count_id; 
	count_id++; 
	this.bill_date = new Timestamp(System.currentTimeMillis()); 
	this.billName = name; 
	this.billStatus = status; 
	this.payKind = payKind; 
	this.amount = amount; 
    }
    
    public int getBill_id() {
        return bill_id;
    }

    public static int getCount_id() {
        return count_id;
    }

    public static void setCount_id(int count_id) {
        Bill.count_id = count_id;
    }

    public Timestamp getBill_date() {
        return bill_date;
    }
    
    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public int getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(int billStatus) {
        this.billStatus = billStatus;
    }

    public int getPayKind() {
        return payKind;
    }

    public void setPayKind(int payKind) {
        this.payKind = payKind;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
