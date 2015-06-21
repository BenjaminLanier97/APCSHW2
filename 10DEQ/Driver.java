    public class Driver{


public static void main(String [ ] args){
    long startTime = System.nanoTime();
        MyDeque<Integer> DEQ1 = new MyDeque<Integer>();
        DEQ1.addLast(4);
        DEQ1.addFirst(14);
    
     long endTime = System.nanoTime();
    System.out.println("Total Time:" + (endTime - startTime));
    startTime = System.nanoTime();
    
         System.out.println(DEQ1);
    
    endTime = System.nanoTime();
    System.out.println("Total Time:" + (endTime - startTime));
    
    
        DEQ1.addLast(7);
        DEQ1.addFirst(9);
         System.out.println(DEQ1);
        DEQ1.addFirst(10);
        DEQ1.addLast(3);
        DEQ1.addLast(2);
        DEQ1.addLast(3);
        System.out.println(DEQ1);
    
    startTime = System.nanoTime();
    
        System.out.println(DEQ1.getFirst());
        System.out.println(DEQ1.getLast());
            endTime = System.nanoTime();
    System.out.println("Total Time:" + (endTime - startTime));
    
         System.out.println(DEQ1);
    startTime = System.nanoTime();
    
		System.out.println(DEQ1.removeLast());
    
endTime = System.nanoTime();
    System.out.println("Total Time:" + (endTime - startTime));
    
         System.out.println(DEQ1);
        
        System.out.println(DEQ1.removeFirst());
        
         System.out.println(DEQ1);
        
        
    }
    
    }