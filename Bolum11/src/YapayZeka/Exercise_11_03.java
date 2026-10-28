package YapayZeka;

//Ana Account sınıfının varsayıldığı varsayımıyla alt sınıflar:
public class Exercise_11_03 {
 public static void main(String[] args) {
     Account account = new Account(1122, 20000);
     Account.setAnnualInterestRate(4.5);
     
     CheckingAccount checking = new CheckingAccount(1123, 1000, -500);
     SavingsAccount savings = new SavingsAccount(1124, 3000);
     
     checking.withdraw(1200); // Eksi limit dahilinde çekebilir
     savings.withdraw(3500);  // Bakiyeden fazlasını çekemez
     
     System.out.println(checking);
     System.out.println(savings);
 }
}

//Örnek CheckingAccount Sınıfı
class CheckingAccount extends Account {
 private double overdraftLimit;

 public CheckingAccount(int id, double balance, double overdraftLimit) {
     super(id, balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (getBalance() - amount >= overdraftLimit) {
         setBalance(getBalance() - amount);
     } else {
         System.out.println("Hata: Limit aşıldı!");
     }
 }

 @Override
 public String toString() {
     return "Checking Account, Bakiye: " + getBalance();
 }
}

//Örnek SavingsAccount Sınıfı
class SavingsAccount extends Account {
 public SavingsAccount(int id, double balance) {
     super(id, balance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= getBalance()) {
         super.withdraw(amount);
     } else {
         System.out.println("Hata: Tasarruf hesabında eksi bakiye olamaz!");
     }
 }
}