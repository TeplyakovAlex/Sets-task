package task02;

import outputer.OutPuter;

import java.util.HashSet;

public class Task02 {
    public static void main(String[] args) {

        String title = " Initial data: ";
        HashSet<String> set = getInitData();
        OutPuter.getOutput(OutPuter.formData(title, set));

        title = " Update data: ";

        OutPuter.getOutput(OutPuter.formData(title, UpdateData(set)));
    }

    private static HashSet<String> getInitData() {
        HashSet<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");
        return set;
    }


    private static HashSet<String> UpdateData(HashSet<String> set){
        set.removeIf(str -> str.contains("kiwi"));
        return set;
    }
}
