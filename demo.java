public class demo {
    public String says(){
        return "Hello";
    }
    public int findMax(int arr[]){  
        int max=-10;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }
}