import java.util.*;

public class MyHeap{
   	private int[] values;
	private boolean isMax;
    
        
	 	public MyHeap() {
			this(true);        
        
	    }
     
     public MyHeap(boolean isMax1){
         values = new int[50];
         values[0] = 0;
         isMax = isMax1;   
    	 }
  
    
    public String toString(){
        StringBuilder FinalReturn1 = new StringBuilder();
        int size = values[0];
        for (int i = 0; i <= size; i++){
            FinalReturn1.append(" ").append(values[i]);

            
            
        }
        return FinalReturn1.toString();
        
        
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
        if (isMax){
            return values[index1] > values[index2];
        }
        return values[index1] < values[index2];
        
    }
    
    public static void main(String[] args){
        MyHeap heap1 = new MyHeap();
      
        heap1.add(5);
     
        heap1.add(2);
        heap1.add(10);
          heap1.add(3);
        
        
        System.out.println(heap1);  
        heap1.add(12);
        heap1.add(1);
            System.out.println(heap1);
        
        
        
        
    }
    
    
    public void SwapTwoValues(int index1, int index2){
      int TemporaryStorage = values[index1];
      values[index1] = values[index2];
        values[index2] = TemporaryStorage;
        
        
        
        
    }
    
    public void resize(){
        if (values[0] == values.length -1){
        values = Arrays.copyOf(values, values[0] * 2);
        } else if (values[0] < values.length/2 && values[0] > 50){
            values = Arrays.copyOf(values, values[0] / 2);
            
        }
        
    }
        
        
    public String name(){
        return "lanier.benjamin";
    }

        
    public int remove() {
        
        if (values[0] == 0){
            throw new NoSuchElementException();
            
        }
        int TemporaryStorage = values[1];
        values[1] = values[values[0]];
        values[0] = values[0] - 1;
   
    	while ((GetLeftValue(values[1]) <= values[0]) && (CompareNodes(values[1], GetChildofValue(values[1])))) {
	    SwapTwoValues(values[1], GetChildofValue(values[1]));
        }
        
        
        return TemporaryStorage;
        
    }
    
    
	


	public int GetChildofValue(int value) {
	    if ((GetRightValue(value) <= values[0]) && CompareNodes(GetLeftValue(value), GetRightValue(value))){
		return GetRightValue(value);
}

		return GetLeftValue(value);
	}

        
      
   
    
    private void MoveValueUp(int index){
        while (GetParentValue(index) > 0){
            int IndexofParent = GetParentValue(index);
            
        
            if (!CompareNodes(IndexofParent, index)){
                SwapTwoValues(index, IndexofParent);
                
            }
                index = IndexofParent;
        
        
    }
                }




                public void add(int newIndex){
                 
                    values[0]++;
                    values[values[0] + 1] = newIndex;
                    MoveValueUp(values[0] + 1);
                    resize();
   
				}



   public int peek(){
       if (values[0] == 0){
           throw new NoSuchElementException();
       }
         return values[1];
         
}

}