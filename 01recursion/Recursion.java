
public class Recursion {
public String name(){
    return "Lanier,Benjamin";

}

public static void main(String[] args){
    Recursion rec = new Recursion();
    System.out.println(rec.fact(3));
    System.out.println(rec.fib(6));
    System.out.println(rec.sqrt(16));
}

public int fact(int n){
    if (n < 0){
	throw new IllegalArgumentException("Input must be greater than 0");


    }else if (n== 0){
	return 1;
    } else{
	return n * fact(n-1);
    }
}

public int fib(int n){

 if (n < 0){
	throw new IllegalArgumentException("Input must be greater than 0");

 } else if (n == 0){
     return 0;
 }
     else if (n == 1){
	 return 1;
     }
     else {
	 return fib(n-1) + fib(n-2);
     }

}

public double sqrt(double n){

     if (n < 0){
	throw new IllegalArgumentException("Input must be greater than 0");


     } else if (n == 0){

	 return 0;
     } else{
	 return sqrthelper(n, n);
}
}

public double sqrthelper(double n, double guess){
    double a = (n/guess + guess)/ 2.0;
    if (Math.abs(a - guess) < 0.001){
	return a;
}else {
    return sqrthelper(n, a);
}
}
}





