import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InfectionStatisticsTest {

  @Test
  public void test() throws Exception {
    InfectionStatistics.main(new String[] {"Reno"});
    assertEquals(178, InfectionStatistics.itemCount, 0);
  }
}
