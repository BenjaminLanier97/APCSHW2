import java.util.*
    
public class MyDeque<T>{
    private int Head, Tail, Size;
    private Object[] Objects;
    private boolean SizeVar;
    
    public MyDeque(){
      this(true);    
        
        
    }
    
    public MyDeque(boolean b){
        Size = 0;
        head = 11;
        tail = 10;
        Objects = new Objects[20];
		SizeVar = b;
    }
    
    
    
    public String name(){
        return "benjamin.lanier";
        
    }
    
    public void Resize(){
        
        
    }
    
    public void addFirst(T data){
        if (isFull()){
            Resize();
            
        }
        Size++;
        Head--;
        if (Head < 0){
            Head = Objects.length -1;
            
        }
        
	Objects[Head] = data;        
        
    }
    
    public void addLast(T data){
        if (isFull()){
            Resize();
        }
        Size++;
        Tail++;
        if (Tail > Objects.length -1){
            Tail = 0;
            
        }
        Objects[Tail] = data;
        
    }
    
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }
    
    public T removeFirst(){
          if (isEmpty()){
            throw new NoSuchElementException();
            
        }
        Size--;
        if (SizeVar && (Objects.length)/4 >= Size){
            Resize();
            
        }
        Object ObjectReturned = (T) Objects[Head];
        Head++;
        if (Head > Objects.length -1){
            Head = 0;
		
        }
            
       return ObjectReturned;
        
    }
    
    public T removeLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
            
        }
        
          
        Size--;
        if (SizeVar && (Objects.length)/4 >= Size){
            Resize();
            
        }
        Object ObjectReturned = (T) Objects[Tail];
        Tail--;
        if (Tail < 0){
            Tail = Objects.length -1;
		
        }
            
       return ObjectReturned;
        
        


    }
    
    public T getLast(){
        
               if (Size == 0){
            throw new NoSuchElementException();
            
        }
        
        return (T)Objects[Head];
        
        
        
    }
    
    public T getFirst(){
        if (Size == 0){
            throw new NoSuchElementException();
            
        }
        
        return (T)Objects[Tail];
        
        
    }
    
    public String toString(){
        StringBuider SB = new StringBuilder();
        SB.append("Head:");
        SB.append(Head);
        SB.append("/n");
        SB.append("Tail);
        SB.append(Tail);
        
       SB.append("/n{");
      while (int i = 0; i < Objects.length; i ++){
            SB.append(Objects[i] + ",");
        
      }        
            SB.append("}");
        
        
    }
    
    public boolean isFull(){
        while (int i = 0; i < Objects.length; i ++){
            if (Objects[i] = null){
                return false;
                
            }
            else{
                return true;
                
                
            }
            
            
        }
        
        
    }
    
    public static void main(String[] args){
        MyDeque<Integer> DEQ1 = new MyDeque<Integer>();
        DEQ1.addLast(4);
        DEQ1.addFirst(14);
         System.out.println(DEQ1);
        DEQ1.addLast(7);
        DEQ1.addFirst(9);
         System.out.println(DEQ1);
        DEQ1.addFirst(10);
        DEQ1.addLast(3);
        DEQ1.addLast(2);
        DEQ1.addLast(3);
        System.out.println(DEQ1);
        System.out.println(DEQ1.getFirst());
        System.out.println(DEQ1.getLast());
        
         System.out.println(DEQ1);
		System.out.println(DEQ1.removeLast());
        
         System.out.println(DEQ1);
        
        System.out.println(DEQ1.removeFirst());
        
         System.out.println(DEQ1);
        
        
    }




}