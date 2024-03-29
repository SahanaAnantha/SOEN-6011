import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest {
  LogFunction log = new LogFunction();

  /**
   * Test Method for valid inputs.
   */
  @Test
  public void logTest1() {
    double x = (float) log.calculateLog(32);
    double y = (float) log.calculateLog(2);
    assertEquals(5.0, x / y, 0);
  }

  /**
   * Test Method for valid inputs.
   */
  @Test
  public void logTest2() {
    double x = (float) log.calculateLog(2);
    double y = (float) log.calculateLog(32);
    assertEquals(0.2, x / y, 0);
  }

  /**
   * Test Method for invalid input.
   */
  @Test
  public void logTest3() {
    double x = (float) log.calculateLog(0);
    double y = (float) log.calculateLog(-1);
    assertEquals(-1, x, 0);
    assertEquals(-1, y, 0);
  }


}
