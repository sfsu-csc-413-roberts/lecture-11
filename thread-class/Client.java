public class Client {
  public static void main( String[] args ) {
    LetterThread a = new LetterThread( 'a' );
    LetterThread b = new LetterThread( 'b' );
    CounterThread c = new CounterThread();

    a.start();
    b.start();
    c.start();
  }
}