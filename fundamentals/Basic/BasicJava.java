import java.util.*;

public class BasicJava {
    public void print1to255(){
        for (int i = 0; i<256; i++){
        }
    } 

System.out.println(i);

}


public void printOdd() {
    for (int i = 0 ; i<256; i++){
        if (i%2==1){
        }
    }
    System.out.println(i);

}


public void printSum(){
    int sum = 0;
    for(int i = 0; i < 256; i++){
        sum += i;
    }
    System.out.println("New number: " + i + " Sum: " + sum);

}


public void iteratingAnArray(int[] myArray){
    for (int i=0;i<myArray.length;i++){
    }
            System.out.println(myArray[i]);

}


public void findMax(int[] arr){
    int max = arr[0];
    for (int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println(max);
}


public void getAverage(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    System.out.println(sum/arr.length);
}


public void arrayOddNumbers(){
    ArrayList<Integer> y = new ArrayList<Integer>();
    for(int i = 1; i < 256; i+=2){
        y.add(i);
    }
    System.out.println(y);
}

public static int GreaterThanY(int[] arr, int y) {
    int count = 0;
    for(int num: arr) {
        if(num > y)
            count++;
    }
    return count;
}




public void squareTheValues(int[] x){
    ArrayList<Integer> m = new ArrayList<Integer>();
    for(int i = 0; i < x.length; i++){
        x[i] = x[i] * x[i];
        m.add(x[i]);
    }
    System.out.println(m);
}


public void eliminateNegativeNumbers(int[] x){
    ArrayList<Integer> newArray = new ArrayList<Integer>();
    for(int i = 0; i < x.length; i++){
        if(x[i] < 0){
            x[i] = 0;
        }
        newArray.add(x[i]);
    }
    System.out.println(newArray);
}


public void maxMinAvg(int[] x){
    ArrayList<Integer> newArray = new ArrayList<Integer>();
    int min = x[0];
    int max = x[0];
    int sum = 0;
    for(int i = 0; i < x.length; i++){
        if(x[i] > max){
            max = x[i];
        }
        if(x[i] < min){
            min = x[i];
        }
        sum += x[i];
    }
    int avg = sum/x.length;
    Collections.addAll(newArray, min, max, avg);
    System.out.println(newArray);
}
