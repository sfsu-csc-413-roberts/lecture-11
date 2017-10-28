public class AddAPennyThreadSynchronized extends Thread {
  private PiggyBank bank;

  public AddAPennyThreadSynchronized( PiggyBank bank ) {
    this.bank = bank;
  }
  
  private static synchronized void addAPenny( PiggyBank bank ) {
    int newBalance = bank.getBalance() + 1;

    try {
      Thread.sleep( 5 );
    } catch( InterruptedException e ) {
      System.out.println( "Interrupted" );
    }

    bank.setBalance( newBalance );
  }

  public void run() {
    addAPenny( this.bank );
  }
}