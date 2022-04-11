import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        int x=10;
        int sum = 0;
        int y=n;
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(20,4,16,37,58,89,145,42));

      
      
      while(y>0){
            while(y>0){
                int z = y%x;
                z=z*z;
                y=y/10;
                sum=sum+z;             
            }       
            if(hashSet.contains(sum)) return false;    
          
            
            if (y==0){
                y=sum;
                sum=0;
            }
          
            if(y==1){
                return true;
            }
        }

        return false;
    }
        
}
