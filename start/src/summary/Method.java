package summary;

public class Method {
	int sum(int a, int b) {
		return a + b;
	}
	
	
	void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }
	 
	
	int a;  // 객체변수 a

    void varTest(Method method) {
    	method.a++;
    }
	   
    
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4; 
		
		Method method = new Method();
		int c = method.sum(a, b);
		System.out.println(c);
		
		
		Method method2 = new Method();
		method2.sayNick("angel");
		method2.sayNick("fool");
        
		
		Method method3 = new Method();
		method3.a = 1;
		method3.varTest(method3);
        System.out.println(method3.a);
        
        
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
	}

}


class Updater {
    void update(Counter counter) {
    	counter.count++;
    }
}

class Counter {
    int count = 0;  
}

