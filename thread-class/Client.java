public class Client {
  public static void main( String[] args ) {
    LetterThread a = new LetterThread( 'a' );
    LetterThread b = new LetterThread( 'b' );
    CounterThread c = new CounterThread();

    a.setPriority(Thread.MAX_PRIORITY);
    b.setPriority(5);
    c.setPriority(Thread.MIN_PRIORITY);

    System.out.println(String.format("Min: %d, Max: %d", Thread.MIN_PRIORITY, Thread.MAX_PRIORITY));
    a.start();
    b.start();
    c.start();
  }
}