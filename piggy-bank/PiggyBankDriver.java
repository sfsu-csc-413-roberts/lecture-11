public class PiggyBankDriver {
  public static void main( String[] args ) throws InterruptedException {
    final int count = 100;

    PiggyBank bank = new PiggyBank();
    Thread pennies[] = new Thread[ count ];

    for( int i = 0; i < count; i++ ) {
      pennies[ i ] = new AddAPennyThreadUnsynchronized( bank );
      pennies[ i ].start();
    }

    for( int i = 0; i < count; i++ ) {
      pennies[ i ].join();
    }

    System.out.println( 
      "After adding " + count + " pennies, balance is " + bank.getBalance() 
    );
  }
}