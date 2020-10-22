
public class Counter {
	public static void main(String[] args) throws InterruptedException {
		try {
			int id = Integer.parseInt(args[0]);
			int i = Integer.parseInt(args[1]);
			System.out.println(count(id,i));
		} catch(Exception e) {
			System.out.println("error");
		}
	}
	
	public static String count(int id,int i) {
		try {
			int s = id + i;
			return "Procesacabat" + s;
		}catch (Exception e) {
			return "error";
		}
	} 
}