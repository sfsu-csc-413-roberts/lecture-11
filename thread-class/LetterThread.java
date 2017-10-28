public class LetterThread extends Thread {
  private char character;

  public LetterThread( char character ) {
    this.character = character;
  }

  public void run() {
    for( int counter = 0; counter < 100; counter++ ) {
      System.out.print( this.character + " " );
    }
  }
}