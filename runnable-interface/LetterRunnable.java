public class LetterRunnable implements Runnable {
  private char character;

  public LetterRunnable( char character ) {
    this.character = character;
  }

  public void run() {
    for( int counter = 0; counter < 100; counter++ ) {
      System.out.print( this.character + " " );
    }
  }
}