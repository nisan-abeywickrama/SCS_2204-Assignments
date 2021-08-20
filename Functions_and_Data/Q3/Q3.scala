//Index No 19000032
object Q3 extends App{

    val acc1 = new Account("323434", 1, 2500);
    val acc2 = new Account("456456", 2, 1000);

    println("Initial Balance");
    println("acc1 : "+ acc1);
    println("acc2 : "+ acc2);
    acc1.transfer(acc2,500);
    println("\nBalance after transfer of 500 from acc1 to acc2")
    println("acc1 : "+ acc1);
    println("acc2 : "+ acc2);
}

class Account(id: String, n:Int, x: Double){

    val nic = id
    val acc_no = n
    var balance: Double = x;
    def deposit(amnt: Double) = this.balance += amnt;

    def withdraw(amnt: Double) = this.balance -= amnt;
    def transfer(acc: Account, amnt: Double) = 
    {
        this.withdraw(amnt);
        acc.deposit(amnt);
       
    }
    override def toString = "nic: " + nic + " acc_no: " +  acc_no + " bal: " + balance + " ";
}