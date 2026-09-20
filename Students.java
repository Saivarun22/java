class Student{
     int age ;
     String name;
     Double Percentage;

     public void Display(){
        System.out.println("Enter Student Name"+name);
        System.out.println("Enter Student age"+age);
        System.out.println("Enter Student Percentage"+Percentage);

     }
     @Override 
     public String toString(){
        return "Student [age = " + age +" name = "+name +" Percentage = "+Percentage+" ]";
     }
   }

     public class Students{
        public static void main (String args[]){

            Student stdarr[]=new Student[4];
             stdarr[0]=new Student();
             stdarr[1]=new Student();
             stdarr[2]=new Student();
             stdarr[3]=new Student();

            stdarr[0].age=14;
            stdarr[1].age=15;
            stdarr[2].age=16;
            stdarr[3].age=18;

            stdarr[0].name="varun";
            stdarr[1].name="kiran";
            stdarr[2].name="ram";
            stdarr[3].name="ganesh";

            
            stdarr[0].Percentage=89.9;
            stdarr[1].Percentage=85.9;
            stdarr[2].Percentage=82.9;
            stdarr[3].Percentage=80.9;
          

            for(Student arr : stdarr){
                System.out.println(arr);
            }

        }
     }
 
