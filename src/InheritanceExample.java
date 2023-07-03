

class Account {
    private String accountNumber;
    private String accountName;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    protected long balance;
    
    public Account(String accNumber, String accName, String accAddress, String accPhoneNumber, String accDateOfBirth){
        accountNumber=accNumber;
        accountName=accName;
        address=accAddress;
        phoneNumber=accPhoneNumber;
        dateOfBirth=accDateOfBirth;
        balance= 0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public long getBalance(){
        return balance;
    }
    
    public void setAddress(String updateAddress){
        updateAddress = address;
    }
    
    public void setPhoneNumber(String phn){
        phn = phoneNumber;
    }
    

}

class SavingAccount extends Account{
    public SavingAccount(String accNumber, String accName, String accAddress, String accPhoneNumber, String accDateOfBirth) {
        super(accNumber, accName, accAddress, accPhoneNumber, accDateOfBirth);
    }

    //    public double savingAmount;
//    public double savingInterestRate;
    public void deposit(long amt){
        balance +=amt;
    }
}

class LoanAccount extends Account{
    public double loanAmount;
    public double loanInterestRate;

    public LoanAccount(String accNumber, String accName, String accAddress, String accPhoneNumber, String accDateOfBirth) {
        super(accNumber, accName, accAddress, accPhoneNumber, accDateOfBirth);
    }
}

public class InheritanceExample {

    public static void main (String[] args){

    }
}
