   package atulabs.ie;

   import static org.junit.Assert.assertEquals;

   import org.junit.Test;

   public class AppTest
   {
       @Test
       public void greetReturnsGreeting()
       {
           assertEquals("Hello, Taniya!", App.greet("Taniya"));
       }
   }