package com.jetbrains;

class student {
    private int id;
    private String name;
    private double cgpa;
    private String deptrtment;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getDeptrtment() {
        return deptrtment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setDeptrtment(String deptrtment) {
        this.deptrtment = deptrtment;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", deptrtment='" + deptrtment + '\'' +
                '}';
    }
}
public class emp{
    public static void main(String []args)
    {
        student st=new student();

        st.setName("Tasmim sultana");
        st.setCgpa(3.7);
        st.setDeptrtment("Computer Science and engineering");
        st.setId(129);
        System.out.println(st.toString());

    }
}
