public class CounterThread extends Thread {
  public void run() {
    for( int counter = 1; counter <= 100; counter++ ) {
      System.out.print( counter + " " );
    }
  }
}