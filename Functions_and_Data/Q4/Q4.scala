//Index No 19000032
object Q4 extends App{

    var bank = List(new Account("98555522", 100, 1234), new Account("21545844", 200, -125), new Account("355458665", 300, 5000), new Account("98555522", 400, 600))
    var acc_with_neg_balance = bank.filter((x) => x.balance < 0)
    var sum_of_accounts = bank.map(x => x.balance).reduce((x,y) => x + y)
    var update_with_interest = bank.map((x) => x.applyInterest())

    println(" === Q4.1 == list of negative balanced accounts ")
    println(acc_with_neg_balance)
    println()
    println(" === Q4.2 == sum of all account balances ")
    println(sum_of_accounts)
    println()
    println(" === Q4.3 == list of accounts with updated balance after interest ")
    println(update_with_interest)
}

 class Account(id: String, n:Int, b: Double)
    {
        val nic = id
        val acc_no = n
        var balance = b 

        def applyInterest(): Account = {
            if(balance > 0 ){
                balance  = balance * 1.05
                return this
            }
            else {
                balance = balance * 1.1
                return this
            }
        }
        override def toString = "nic: " + nic + " acc_no: " +  acc_no + " bal: " + balance + " ";
    }
