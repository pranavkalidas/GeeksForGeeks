package easy;

import java.util.*;

public class Student {
    private static List<String> std = new ArrayList<String>();

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(int i =0; i<std.size();i++){
            s.append(i).append(": ").append(std.get(i)).append(" ");
        }
        return s.toString();
    }

    public Student(String name) {
      std.add(name);
    }
}

class demo {
    public static void main(String[] args) {
        String[] name = {"Pranav","Arun","Riya"};
        Arrays.stream(name).forEach(x -> {
            Student student = new Student(x);
            System.out.println(student.toString());
        });
    }
}
