import java.util.*;
import java.lang.*;
    
public class MyDeque<T>{
    private int Head, Tail, Size;
    private T[] Objects;
    private boolean SizeVar;
    
    public MyDeque(){
      this(true);    
        
        
    }
     @SuppressWarnings("unchecked")
    public MyDeque(boolean b){
        Size = 0;
        Head = 11;
        Tail = 10;
        Objects = (T[]) (new Object[20]);
		SizeVar = b;
    }
    
    
    
    public String name(){
        return "benjamin.lanier";
        
    }
    
   
     @SuppressWarnings("unchecked")
    public void Resize(boolean b){
        T[] NewArray;
        if (b){
             NewArray = (T[]) (new Object[Objects.length * 2]);
            if (Head > Tail){
                for (int i = Head; i < Objects.length; i++){
                    NewArray[i] = Objects[i];
                    
                }
                
                for (int i = 0; i <=Tail; i++){
                    NewArray[i + Objects.length] = Objects[i];
                }
				Tail = Tail + Objects.length;               
                    
            } else{
                 for (int i = Head; i<= Tail; i++){
                    NewArray[i] = Objects[i];
                
            }
            }
            
            
            } else{
            NewArray = (T[]) (new Object[Objects.length/2]);
            int initializer;
                
                if (Head > Tail){
                    initializer = 0;
                    for (int i =Head; i < Objects.length; i++){
                        NewArray[initializer] = Objects[initializer];
                        initializer++;
                        
                    }
                    for (int i = 0; i <=Tail; i++){
                         NewArray[initializer] = Objects[initializer];
                        initializer++;
                    }
                    
                                        
                } else{
                    initializer = 0;
                    for (int i = Head; i <= Tail; i++){
						NewArray[initializer] = Objects[i];
                        initializer++;
                        }
                    
                }
            
            
            Head = 0;
            Tail = initializer - 1;
        }
                        
		Objects = NewArray;    
        
    }
    
    public void addFirst(T data){
        if (isFull()){
            Resize(true);
            
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
            Resize(true);
        }
        Size++;
        Tail++;
        if (Tail > Objects.length -1){
            Tail = 0;
            
        }
        Objects[Tail] = data;
        
    }
    
    public boolean isEmpty(){
        if (Size == 0){
            return true;
        }
        return false;
    }
    
 @SuppressWarnings("unchecked")
 public T removeFirst(){
          if (isEmpty()){
            throw new NoSuchElementException();
            
        }
        Size--;
        if (SizeVar && (Objects.length)/4 >= Size){
            Resize(false);
            
        }
        Object ObjectReturned = (T) Objects[Head];
     Objects[Head] = null;
        Head++;
        if (Head > Objects.length -1){
            Head = 0;
		
        }
            
       return (T)ObjectReturned;
        
    }
    
 @SuppressWarnings("unchecked")
    public T removeLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
            
        }
        
          
        Size--;
        if (SizeVar && (Objects.length)/4 >= Size){
            Resize(false);
            
        }
        Object ObjectReturned = (T)Objects[Tail];
        Objects[Tail] = null;
        Tail--;
        if (Tail < 0){
            Tail = Objects.length -1;
		
        }
            
       return (T) ObjectReturned;
        
        


    }
     @SuppressWarnings("unchecked")
    public T getLast(){
        
               if (Size == 0){
            throw new NoSuchElementException();
            
        }
        
        return (T)Objects[Head];
        
        
        
    }
     @SuppressWarnings("unchecked")
    public T getFirst(){
        if (Size == 0){
            throw new NoSuchElementException();
            
        }
        
        return (T)Objects[Tail];
        
        
    }
    
    public String toString(){
        StringBuilder SB = new StringBuilder();
        SB.append("Head:");
        SB.append(Head);
        SB.append("\n");
        SB.append("Tail:");
        SB.append(Tail);
        
       SB.append("\n[");
      for (int i = 0; i < Objects.length; i++){
          if (Objects[i] != null){
            SB.append(Objects[i] + ",");
          }
        
      }        
            SB.append("]");
        return SB.toString();
        
        
    }
    
    public boolean isFull(){
        for (int i = 0; i < Objects.length; i++){
            if (Objects[i] == null){
                return false;
                
            }
        }
                return true;
                
              
            
        }
        
        
    





}