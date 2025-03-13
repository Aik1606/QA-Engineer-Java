package lesson9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TelephoneBook extends HashMap<String, Set<String>> {
    public void add(String lastName, String numberPhone) {
      if (containsKey(lastName)) {
        get(lastName).add(numberPhone);
      } else {
       put(lastName, new HashSet<String>() {{
         add(numberPhone);
       }});
      }

  }

}
