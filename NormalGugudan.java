package kunsan.안창완1501023;

public class NormalGugudan {
	public void InputGuGudan() {
		int Start = 0;
		int End = 0;
		
		System.out.println("5) 99단 단순 찍기");
			
		for(int i=1;i<=9;i++,System.out.println()) {
			for(int j=1;j<=9;j++,System.out.print("\t")) {
				
				System.out.print(i+"*"+j+"="+i*j);
				
			}
		}
	}
}
