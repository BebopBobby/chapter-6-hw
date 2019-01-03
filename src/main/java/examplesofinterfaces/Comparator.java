package examplesofinterfaces;

import java.util.Arrays;

public interface Comparator<T> {
    int compare(T first, T second);
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

class main{
    public static void main(String[] args) {
        Comparator<String> comp = new LengthComparator();

        if (comp.compare(words[i], words[j]) > 0){
            System.out.println("bluh");
        }

        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, new LengthComparator());
    }
}
