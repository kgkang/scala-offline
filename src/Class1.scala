
object Class1 extends App {
  class BankAccount(initialBalance: Double) {
    var balance = initialBalance
    def deposit(amount: Double) = {balance += amount;balance}
    def withdraw(amount: Double) = {balance -= amount;balance}
  }
  
  class CheckAccount(initialBalance: Double, val comission: Double = 1.0)
    extends BankAccount(initialBalance) {
    override def deposit(amount: Double) = super.deposit(amount - comission)
    override def withdraw(amount: Double) = super.withdraw(amount + comission)
  }
  
  val bank = new CheckAccount(1000.0, 2.0)
  bank.deposit(1.0)
  println(bank.balance)
  
  bank.withdraw(1.0)
  println(bank.balance)
}
