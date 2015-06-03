public RunningMedian {
    
    private MyHeap smaller, larger;
    
    public RunningMedian(){
        smaller = new MyHeap(true);
        larger = new MyHeap(false);
        
        
    }

    public String name(){
        return "lanier.benjamin";
    }
    
    public static void main(String args[]){
           RunningMedian RM1 = new RunningMedian();
           RM1.add(7);
           RM1.add(6);
           RM1.add(8);
           RM1.add(4);
           RM1.add(10);
           RM1.add(61);
           RM1.add(2);
           RM1.add(12);
           RM1.add(0);
           RM1.add(9);
           System.out.println(RM1.getMedian() + " " + RM1);
           RM1.add(-1);
           RM1.add(2);
           RM1.add(7);
       	   System.out.println(RM1.getMedian() + " " + RM1);
           RM1.add(14);
	       RM1.add(-3);
           RM1.add(23);
           System.out.println(RM1.getMedian() + " " + RM1);
        
        
    }
    
    public void add(int value){
        if (value < getMedian()){
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
        
        
    }
    
    public String toString(){
        return smaller + " " larger;
    }
    


}