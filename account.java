public class Account {
    private String name=null;
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated;
    private double counter;
    Account(){
        this.name="moataz";
        this.id=100;
        this.balance=500;
        this.annualInterestRate=1; 
        counter=11122220;
    }
    Account(String newName,int id_no,int newbalance){
        this.name=newName;
        this.id=id_no;
        this.balance=newbalance;
        counter++;
    }
    public double withDraw(double amountOfWithdraw){
        if (balance>amountOfWithdraw){
              return this.balance-amountOfWithdraw;
        }
        else{
            System.out.println("your balance is smaller than"+amountOfWithdraw+"\n exit");
        }
        return balance;
    }

    public double deposit(double amountOfDepoisit){
this.balance=this.balance+amountOfDepoisit;
      return this.balance;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
     public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
  
    }
      public double getMonthlyInterRate(){
        return this.getMonthlyInterRate()/12;
      }
     public double getMonthlyInter(){
        return this.getMonthlyInterRate()-50.0/12;
      }
}
