import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    Main ob=new Main();
// UC 9
    @Test
    void checkDeleteOfAnElement() {
        ob.addElements();
        assertEquals(ob.removeElement(40),3);
    }
}
