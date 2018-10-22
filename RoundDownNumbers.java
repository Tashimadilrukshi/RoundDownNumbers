import java.util.Scanner;
class RoundDownNumbers
{
    static int n;
    
    
    static int[] roundDownNumbers(int arr[]){
        
        int[] newArr = new int[n];
        for(int i=0; i<arr.length; i++){
           
                newArr[i]=arr[i];
                
                //to roundDown numbers
                
                if((newArr[i]%10)<5){
                       while((newArr[i]%10)!=0){
                            newArr[i]--;
                       }
                       arr[i]=newArr[i];
                }
        }
        
        
        return arr;
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
         int[] arr = new int[n];
        
        //get values to the array
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        roundDownNumbers(arr);
         System.out.println("RoundDown numbers are :-");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        
        
    }
}
