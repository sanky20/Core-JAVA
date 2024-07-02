class Student{
    String name;
    int roll;
    double per;

    public void Details(){
        System.out.println("Name: "+name);
        System.out.println("Roll No. : "+roll);
        System.out.println("Percentage: "+per+"%");
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1= new Student();
        s1.name="Sanskar";
        s1.roll=1;
        s1.per= 85.33;

        Student s2= new Student();
        s2.name="Anmol";
        s2.roll=2;
        s2.per= 55.8;

        Student s3= new Student();
        s3.name="Abhishek";
        s3.roll=3;
        s3.per= 76.4;

        // s1.Details();
        // s2.Details();
        // s3.Details();


        Student st[]= new Student[3];
         
        // st is an array of objects of Student class and it can store the reference of the objects of Student class only.
        // we have to manually create the objects of Student class and store the reference of those objects in the array st.
        // we cannot directly store the objects of Student class in the array st. 

        st[0]=s1;
        st[1]=s2;
        st[2]=s3;


        for(int i=0;i<st.length;i++)
        {
            st[i].Details();
        }


        



        
    }
    
}
