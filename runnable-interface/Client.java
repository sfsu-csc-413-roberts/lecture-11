public class Client {
  public static void main( String[] args ) {
    LetterRunnable a = new LetterRunnable( 'a' );
    LetterRunnable b = new LetterRunnable( 'b' );
    CounterRunnable c = new CounterRunnable();

    new Thread( a ).start();
    new Thread( b ).start();
    new Thread( c ).start();
  }
}