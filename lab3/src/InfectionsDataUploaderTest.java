import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InfectionsDataUploaderTest {

  @Test
  public void test() throws Exception {
    InfectionsDataUploader.main(new String[0]);
    assertEquals(1000, InfectionsDataUploader.numItemsAdded, 0);
  }
}
