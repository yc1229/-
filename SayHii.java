public class SayHii{
	public static void main(String[] args){
	sayHii(sum());	
	}
	public static void sayHii(int sum){
		System.out.println("Say hi"+sum);
	}
	public static int sum(){
		int sum=0;
		int i=0;
		for(i=0;i<=100;i++){
			sum +=i;
		}
		return sum;
	}
	
}