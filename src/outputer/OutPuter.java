package outputer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class OutPuter {
    public static String formData(String head, HashSet set) {
        StringBuilder sb = new StringBuilder();

        System.out.println(head);
        AtomicInteger count = new AtomicInteger(1);
        for (Object s : set) {

            sb.append(count.getAndIncrement()).append(") ").append(s).append("\n");
        }
        return sb.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
