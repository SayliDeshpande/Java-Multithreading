package concurrency;

public class TestWithdraw {
      public static void main(String args[]){
            final ConsumerWithdraw c=new ConsumerWithdraw();
            new Thread(){
                public void run(){c.withdraw(15000);}
            }.start();
            new Thread(){
                public void run(){c.deposit(10000);}
            }.start();
      }
}


/*
Output :

going to withdraw...
Less balance; waiting for deposit...
going to deposit...
deposit completed... 
withdraw completed...


*/
