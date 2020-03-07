package primoprogetto;

public class Main {


	
   /* public static void main(String[] args) {
    	
    	String[] elenco= {"pane","latte","burro","aqua"};
    	
    	for(int i=0;i<elenco.length;i++) 
    		
    	System.out.println(elenco[i]);
    	
    	
    	
    }*/
	
	/*public static void main(String[] args) {
		
		int num1=230;
		int num2=320;
		
		if(num1>=num2) {
		System.out.println("num1 is big");	
		}
		else {
			System.out.println("num2 is big");
		}
	}*/
	
	//Demo switch
	
	/*public static void main(String[] args) {
		
		String scelta = "Sum";
		
		
		switch(scelta){
			case "Sum":
			int result= Main.sum(10, 20);
			System.out.println(result);
			break;
			
			
			
			default:
			System.out.println("Default value to print");
			break;
		}
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}*/
    
	/*public static void main(String[] args) {
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}*/
		public static double calculateDistance(double[] array1, double[] array2)
	    {
	        double Sum = 0.0;
	        for(int i=0;i<array1.length;i++) {
	           Sum = Sum + Math.pow((array1[i]-array2[i]),2.0);
	        }
	        return Math.sqrt(Sum);
	    }
	
}
