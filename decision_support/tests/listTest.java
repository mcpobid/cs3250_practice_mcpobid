import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class listTest {

    @Test
    public void listOptions(){
        ArrayList<String> options = new ArrayList<>();
        options.add("go to the store");
        options.add("feed dog");
        options.add("vacation");

        String[] expected = {"go to the store", "feed dog", "vacation"};
        assertArrayEquals(expected, options.toArray());
    }

}
