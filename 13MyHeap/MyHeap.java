import java.util.*;

public class MyHeap{
   	private int[] values;
    private int size;
	private boolean isMax;
    
 
     
     public MyHeap(boolean isMax1){
         values = new int[50];
         size = 50;
         isMax = isMax1;   
    	 }
         
	 	MyHeap() {
			MyHeap(true);        
        
	    }
    public String toString(){
        String final1 = "";
        for (int i = 0; i < size; i++){
            final1 += values[i] + " ";
            
            
        }
        return final1;
        
        
    }
    
    public int GetLeftValue(int value){
        return value * 2;
        
    }
    
    public int GetRightValue(int value){
        return (value * 2) +1;
        
    }
    
    public int GetParentValue(int value){
       return value/2; 
        
    }
    
    public boolean CompareNodes(int index1, int index2){
        
        
        
    }
    
    public static void main(String[] args){
        MyHeap heap1 = new MyHeap();
        heap1.add(3);
        heap1.add(5);
        heap1.add(6);
        heap1.add(10);
        System.out.println(heap1);  
        heap1.add(12);
        heap1.add(1);
        
        
        
        
        
    }
    
    public void resize(){
        values = Arrays.copyOf(values, size * 2);
        
    }
        
        
    public String name(){
        return "lanier.benjamin";
    }

    public int remove() {
        
        
        
    }


 remove the root and return the value  O(logn)

public void add(int) -> add the int to the heap  O(logn)
    if (isMax){
        
    } else {
        
        
    }
}



public void add(int) -> add the int to the heap  O(logn)
    if (isMax){
        
    } else {
        
        
    }
}

   public int peek(){
       if (size == 0){
           System.out.print("
         return heap[0];
         }	
}