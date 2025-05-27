public class Problemsday2{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int  n =sc.nextInt();
        int startIndex = 0;
        int currentIndex = 1;
        int count = 2;
        
        while(count <=n){
        int temp = currentIndex;
        currentIndex =startIndex + currentIndex;
        startIndex = temp;
        count++;
        }

        System.out.println(currentIndex);

       
      
    }

}