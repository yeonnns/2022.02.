package summary;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }
    

    int getValue() {
        return this.value;
    }
    
    boolean isOdd(int num) {
    	return num % 2 == 1;
    }
   
    int avg(int[] data) {
    	int total = 0;
    	for(int num: data) {
    		total += num;
    	}
    	return total / data.length;
    } 
    
    int avg(ArrayList<Integer> data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.size();
    }
    
} 

class UpgradeCalculator extends Calculator {
	void minus(int val) {
		this.value -= val;
	}
}

class MaxLimitCalculator extends Calculator {
	void add(int val) {
		this.value += val;
		if(this.value > 100) {
			this.value = 100;
		}
	}
	
}


public class exam2 {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());  
        
        // 최대값 제한
        MaxLimitCalculator cal2 = new MaxLimitCalculator();
        cal2.add(50);  
        cal2.add(130);  
        System.out.println(cal2.getValue());
        
        // 홀짝
        Calculator cal3 = new Calculator();
        System.out.println(cal3.isOdd(3)); 
        System.out.println(cal.isOdd(4));
        
        //int[] 평균
        int[] data1 = {1, 3, 5, 7, 9};
        int result1 = cal.avg(data1);
        System.out.println(result1);
        
        //ArrayList<Integer> 평균
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(2, 2, 10, 10, 10));
        int result2 = cal.avg(data2);
        System.out.println(result2); 
        
    }
}



