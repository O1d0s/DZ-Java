package DZ6;

import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Set<notebook> set = new HashSet<>();
        set.add(new notebook("Notebook 1", 8, "Windows11", 700, "HP"));
        set.add(new notebook("Notebook 2", 16, "Windows10", 990, "Asus"));
        set.add(new notebook("Notebook 3", 32, "MacOs", 1500, "MacBook"));
        set.add(new notebook("Notebook 4", 64, "linux", 900, "Lenovo"));
        set.add(new notebook("Notebook 5", 16, "Windows10", 870, "Lenovo"));

        operations operation = new operations(set);
        operation.start();
    
    }

    
}
