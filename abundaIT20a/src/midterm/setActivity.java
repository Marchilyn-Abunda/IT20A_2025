package midterm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class setActivity {

    public static void main(String[] args) {

        List<Integer> number = new LinkedList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(2);
        number.add(1);

        System.out.println(number);

        Set<Integer> noDuplicate = new HashSet<>(number);
        System.out.println(noDuplicate);

    }

}
