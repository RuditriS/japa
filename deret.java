public class deret
{
public static void main (String args[]){
fibonacci f = new fibonacci ();
System.out.println ("Deret Fibonacci  :");
for (int i=0; i<10; i++){
System.out.println (f.HitungDeret (i)+" ");

}
System.out.println ("...");
}
	public int HitungDeret (int x){
	if(x==0){
	return x;
	}
	else if (x==1){
	}
	else { 
	return 
	HitungDeret (x-1)+HitungDeret (x-2);
	}
	}

}