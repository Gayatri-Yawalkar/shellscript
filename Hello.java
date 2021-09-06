public class Hello{
	public static void main(String[] args){
		while(true){
			System.out.println("Hello");
			try{				
				Thread.sleep(30000);
			}catch(Exception e){}
		}
	}
}
