public class Student implements Comparable<Student> {
    // Comparable을 상속 받으면 스트링 타입도 정렬 등의 비교 가능한 형태가 됨
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name=name;
        this.score=score;
    }

    public String toString() {
        return name + ":" + score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        // if(score > o.score) {
        //   return 1;
        // }
        // else if(score < o.score) {
        //   return -1;
        // }
        // else {
        //   return 0;
        // }
        return score - o.score;
    }
}