   public class Driver{
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
    }