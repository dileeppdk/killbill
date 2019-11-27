
public class Singleton {
	
	static Singleton singletonobj = null;
	
	private Singleton() {		
	}
	
	public static synchronized Singleton getInstance() {		
		if(singletonobj == null) {			
			singletonobj = new Singleton();
		}		
		return singletonobj;		
	}

}
