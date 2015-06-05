public class RunningMedian {
    
    private MyHeap smaller, larger;
    
    public RunningMedian(){
        smaller = new MyHeap(true);
        larger = new MyHeap(false);
        
        
    }

    public String name(){
        return "lanier.benjamin";
    }
    
    public static void main(String [ ] args){
           RunningMedian RM1 = new RunningMedian();
                   RM1.add(4);
                System.out.println(RM1.GetMedian() + "    Median " + RM1);
           RM1.add(6);
                System.out.println(RM1.GetMedian() + "    Median " + RM1);
           RM1.add(8);
                System.out.println(RM1.GetMedian() + "    Median " + RM1);
         System.out.println(RM1.GetMedian() + "    Median " + RM1);
           RM1.add(4);
           RM1.add(10);
         System.out.println(RM1.GetMedian() + "    Median " + RM1);
           RM1.add(61);
           RM1.add(2);
           RM1.add(12);
           RM1.add(9);
           System.out.println(RM1.GetMedian() + "    Median " + RM1);
           RM1.add(7);
       	   System.out.println(RM1.GetMedian() + "   Median      " + RM1);
           RM1.add(14);
           RM1.add(23);
           System.out.println(RM1.GetMedian() + "   Median     " + RM1);
        
        
    }
    
    public void add(int value){
        if ((larger.size() == 0 && smaller.size() == 0) || value < GetMedian()){
				smaller.add(value);
        } else{
				larger.add(value);
        }            
          Rebalance();
        
    }
    
    public void Rebalance(){
        int SizeDifference = larger.size() - smaller.size();
        if (SizeDifference > 1){
            smaller.add(larger.remove());
            
        } else if (SizeDifference < -1){
            larger.add(smaller.remove());
            
        }
        
        
    }
    
    public double GetMedian(){
      if (smaller.size() == 0){
            return larger.peek();
        }else if (larger.size() == 0){
            return smaller.peek();
              
            } else if ((larger.size() + smaller.size()) % 2 == 0){
            return ((smaller.peek() + larger.peek()) / 2.0);
       
        }else if (smaller.size() > larger.size()){
				return smaller.peek();            
        } else {
            return larger.peek();
        }
    }
        
            
            
                
          
            
    
    public String toString(){
        return smaller + " " + larger;
    }
    


}