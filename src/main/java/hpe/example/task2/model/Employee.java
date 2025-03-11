package hpe.example.task2.model;

public class Employee {
    String id;
    String first_name;
    String last_name;
    String email;
    String title;

    public Employee(String id,String first_name,String last_name,String email,String title){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email=email;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfirstname(){
        return first_name;
    }

    public void setfirstname(String first_name){
        this.first_name = first_name;
    }

    public String getlastname(){
        return last_name;
    }

    public void setlastname(String last_name){
        this.last_name = last_name;
    }

    public String getmail(){
        return email;
    }

    public void setmail(String email){
        this.email = email;
    }

    public String gettitle(){
        return title;
    }

    public void settitle(String title){
        this.title = title;
    }
}
