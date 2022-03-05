package Comparison;

public class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final String email;
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }

        if (obj instanceof Student){
            Student other = (Student) obj;
            if (this.getId() == other.getId()){
                return true;
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        int myHash = (int) Math.pow(this.name.hashCode(), id);
        return myHash;
    }


    // By convention, returns:
    // -1
    // 0
    // 1

    @Override
    public int compareTo(Student o){
        if (this.id > o.id ){
            return 1;
        }
        else if (this.id < o.id ){
            return -1;
        }
        else{
            return 0;
        }

    }


}


