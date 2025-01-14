package javaprog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Transaction{
  String type;
  int amount;
  
  public Transaction(String type,int amount){
    this.type=type;
    this.amount=amount;
  }
}
class BankD{
  private int curBalance;
  private List<Transaction>transaction;
  private List<Integer>commitBalance;
  
  public BankD(){
    this.curBalance=0;
    this.transaction=new ArrayList<>();
    this.commitBalance= new ArrayList<>();
  }
  
  public void displayBalance(){
    System.out.println("Current Balance:"+ curBalance);
  }
  
  public void credit(int amount){
    curBalance += amount;
    transaction.add(new Transaction("credit", amount));
    System.out.println("Successfully credited Rs"+amount);
  }
  
  public void debit(int amount){
    if(curBalance>=amount){
      curBalance-=amount;
      transaction.add(new Transaction("debit", amount));
      System.out.println("Successfully debited Rs"+ amount);
    }
    else{
      System.out.println("Insufficient balance! Unable to debit Rs"+ amount);
    }
  }
  
  public void abortTrans(int transactionInd){
    if(transactionInd<=transaction.size() &&! isTransactionCommitted(transactionInd-1))
    {
      Transaction transaction = transaction.get(transactionInd -1);
      if("credit".equals(transaction.type)){
        curBalance-= transaction.amount;
      }
      else if("debit".equals(transaction.type)){
        curBalance+=transaction.amount;
      }
      transaction.remove(transactionInd-1);
      System.out.println("Transaction"+transactionInd+"cannot be aborted. Either it dosent exist or has not been commited");
    }
    
  }
  
  public void rollbackToCommit(int commitInd){
    if(commitInd<=commitBalance.size()){
      curBalance=commitBalance.get(commitInd-1);
      transaction=transaction.subList(0,(commitInd));
      System.out.println("Rolled back to commit"+commitInd+"Balance restored to Rs"+curBalance);
    }
    else{
      System.out.println("commit"+commitInd+"does not exist");
    }
  }
  
  public void commit(){
    commitBalance.add(curBalance);
    transaction.add(new Transaction("commit",curBalance));
    System.out.println("committed successfully current balance is Rs"+curBalance);
  }
  
  private boolean isTransactionCommitted(int transactionInd){
    int commitCount=0;
    for(int i =0;i<=transactionInd;i++){
      if("commit".equals(transaction.get(i).type)){
        commitCount++;
      }
    }
    return commitCount>0;
  }
  
  private int findTransactionIndexForCommit(int commitInd){
    int commitCount=0;
    for(int i=0;i<transaction.size();i++){
      if("commit".equals(transaction.get(i).type))
      {
        commitCount++;
      }
      if(commitCount==commitInd){
        return i+1;
      }
    }
    return transaction.size();
  }
}


public class Saimini{
  public static void main(String[]args){
    BankD account = new BankD();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("welcome to the bank account manager");
    while(true){
      System.out.println("\n choose an operation:");
      System.out.println("1.Credit");
      System.out.println("2.Debit");
      System.out.println("3.Display Balance");
      System.out.println("4.Commit");
      System.out.println("5.Abort Transaction");
      System.out.println("6.Rollback to commit");
      System.out.println("7.exit");
      
      int choice= scanner.nextInt();
      
      switch(choice){
          case 1:
          System.out.println("enter amount to credit: Rs");
          int creditAmount=scanner.nextInt();
          account.credit(creditAmount);
          break;
          
          case 2:
          System.out.println("enter amount to debit:Rs");
          int debitAmount=scanner.nextInt();
          account.debit(debitAmount);
          break;
          
          case 3:
          account.displayBalance();
          break;
          
          case 4:
          account.commit();
          break;
          
          case 5:
          System.out.println("enter the transaction number to abort:");
          int abortInd = scanner.nextInt();
          account.abortTrans(abortInd);
          break;
          
          case 6:
          System.out.println("enter the commit number to rollback to:");
          int commitInd= scanner.nextInt();
          account.rollbackToCommit(commitInd);
          break;
          
          case 7:
          System.out.println("thank you for using the bank account manager");
          scanner.close();
          return;
          
        default:
          System.out.println("invalid choice! please try again");
      }
    }
  }
}
      