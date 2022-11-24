import java.util.*;

class Main {
    public static <T> void printList(List<T> list) {
        var iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    // public static void printList(LinkedList<Integer> list) {
    //   var iterator = list.iterator();
    //   while(iterator.hasNext()) {
    //     System.out.print(iterator.next() + " ");
    //   }
    //   System.out.println();
    // }

    // public static void printList(ArrayList<Student> list) {
    //   var iterator = list.iterator();
    //   while(iterator.hasNext()) {
    //     System.out.print(iterator.next() + " ");
    //   }
    //   System.out.println();
    // }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(20);
        list.add(-30);
        list.add(50);
        list.add(45);
        printList(list);
        Collections.sort(list);
        printList(list);
        Collections.reverse(list);
        printList(list);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("영희", 90));
        students.add(new Student("종희", 95));
        students.add(new Student("철수", 70));
        students.add(new Student("의정", 30));
        students.add(new Student("병찬", 80));
        printList(students);
        Collections.sort(students);
        printList(students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}