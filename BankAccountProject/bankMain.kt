/*
 * Created by Mark Hozan
 * Bank Assignment for Meta Android Development
 * 2026
 */
 /*
 * Created by Mark Hozan
 * Exercise: Practice using for Meta Android Developer course
 * 2026
 */
import java.util.Scanner
val scanner = Scanner(System.`in`)

fun main(){
  
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println()
    println("  1. Debit")
    println("  2. Credit")
    println("  3. Checking")
    println("  4. Close the Application")
	println()
    print("Enter 1, 2, or 3 and press enter: ")
    val userChoice = scanner.nextLine().toInt()
    val accountType: String? = when(userChoice){
      1 -> "debit"
      2 -> "credit"
      3 -> "checking"
      4 -> null
      else -> null
    }
    println()
    if(accountType != null){
      println("You have created a $accountType account")
      var accountBalance: Int = (0..1000).random()
      println("Current Balance: $accountBalance")
      var money: Int = (0..accountBalance).random()
      accountBalance = withdraw(money, accountBalance)
      println("You've withdrawn \$" + money + ". Your new balance is \$" + accountBalance)
      money = (0..accountBalance).random()
      accountBalance = deposit(money, accountBalance)
      println("You've deposited \$" + money + ". Your new balance is \$" + accountBalance)
    }
    
	
}

fun withdraw(amount:Int, accountBalance: Int): Int{
  return accountBalance - amount
}

fun deposit(amount:Int, accountBalance: Int): Int{
  return accountBalance + amount
}