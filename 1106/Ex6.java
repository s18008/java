import java.util.ArrayList;
import java.util.List;

class Ex6{

	public int [] ex6_1(){
		int [] ret = new int[5];
        int count = 0;
	    for(int i = 5;i >= 1;i--){
         ret[count] = i;
         count += 1;
        }
		return ret;
	}

	public double [] ex6_2(){
		String [] Set = new String[5];
        double [] ret = new double[5];
        int count = 0;
	    for(int i = 1;i <= 5;i++){
            ret[count] = Double.parseDouble(String.format("%.1f", 1.1 * i));
            count += 1;
        }
		return ret;
	}

	public int [] ex6_3(int a, int b){
		int [] ret = new int[a];
        for(int i = 0;a > i;i++){
         ret[i] = b;
        }
		
		return ret;
	}

	public int [] ex6_4(int [] a){
		int [] ret = new int[4];
        double heikin = 0;
        int max = a[0];
        int min = a[0];
        for(int i:a){
         if(max <= i){
          max = i;
         }else if(min >= i){
          min = i;
         }
         ret[0] += i;
         heikin += i;
        }
        ret[1] =  (int)Math.round(heikin / a.length);
		ret[2] = max;
        ret[3] = min;
		return ret;
	}

	public int ex6_5(int [] a, int key){
        int sarch = -1;
        for(int i = 0; i < a.length ; i++){
         if(a[i] == key){
          sarch = i;
          break;
         } 
        }
		return sarch;
	}

	public int ex6_6(int [] a, int key){
		int sarch = -1;
        for(int i = 0; i < a.length ; i++){
         if(a[i] == key){
          sarch = i;
         } 
        }
		
		return sarch;
	}

	public int [] ex6_7(int [] a, int idx){
        List<Integer> number = new ArrayList<>();
       for(int i = 0; a.length > i; i++){
         if(i == idx){
          continue;
         }
         number.add(a[i]);
       }
        int [] ret = new int[number.size()];
        for(int i = 0; i < ret.length;i++){
         ret[i] = number.get(i);
	}
         return ret;
    } 

	public int [] ex6_8(int [] a, int idx, int n){
       List<Integer> number = new ArrayList<>();
       int count = 0;
       for(int i = 0; a.length > i; i++){
         if(n == 0 || n + idx > a.length){
          number.add(a[i]);
          continue;
         }
         if(i == idx){
          count = n-1;
          continue;
         }else if(count != 0){
          count -= 1;
          continue;
         }
         number.add(a[i]);
       }
        int [] ret = new int[number.size()];
        for(int i = 0; i < ret.length;i++){
         ret[i] = number.get(i);
	}

		return ret;
	}

	public int [] ex6_9(int [] a, int idx, int x){
       List<Integer> number = new ArrayList<>();
       for(int i = 0; a.length > i; i++){
         if(i == idx){
          number.add(x);
         }
         number.add(a[i]);
       }
        int [] ret = new int[number.size()];
        for(int i = 0; i < ret.length;i++){
         ret[i] = number.get(i);
	}

		return ret;
	}

	public void ex6_10(int [] a, int [] b){
        int [] seta = new int[a.length];
        int [] setb = new int[b.length];
        int count = 0;
        for(int i:a){
         seta[count] = i;
         count += 1;
        }
        count = 0;
        for(int i:b){
         setb[count] = i;
         count += 1;
        }
        if(a.length > b.length){
         for(int i = 0;i < b.length;i++){
          a[i] = setb[i];
          b[i] = seta[i];
         }
        }else{
         for(int i = 0;i < a.length;i++){
          a[i] = setb[i];
          b[i] = seta[i];
         }

        }
        return;
	}



	public int [] ex6_11(int [] a){
		int [] ret = new int[a.length];
         ret = a;

		return ret;
	}

	public int [] ex6_12(int [] a, int x){
        List<Integer> number = new ArrayList<>();
        for(int i = 0; i < a.length ;i++){
         if(a[i] == x){
          number.add(i);
         }
        }
		int [] ret = new int[number.size()];
        for(int i = 0; i < ret.length;i++){
         ret[i] = number.get(i);
        }
		return ret;
	}

	public int [] ex6_13(int [] a, int idx){
        List<Integer> number = new ArrayList<>();
        int count = 0;
        for(int i = 0;i < a.length;i++){
         if(idx != i){
          number.add(a[i]);
         }
        }
        int [] ret = new int[number.size()];
        for(int i = 0; i < ret.length;i++){
         ret[i] = number.get(i);
        }
		return ret;
	}
	
	public int [] ex6_14(int [] a, int idx, int n){
		List<Integer> number = new ArrayList<>();
        int count = 0;
        for(int i = 0;i < a.length;i++){
         if(idx <= i && i <= n){
          continue;
         }
          number.add(a[i]);
        }
        int [] ret = new int[number.size()];
        for(int i = 0; i < ret.length;i++){
         ret[i] = number.get(i);
        }

		
		return ret;
	}
	
	public int [] ex6_15(int [] a, int idx, int x){
		List<Integer> number = new ArrayList<>();
        int count = 0;
        if(idx >= 0){
        for(int i = 0;i < a.length+1;i++){
         if(idx == i){
          number.add(x);
         }else{
          number.add(a[count]);
          count += 1;
        }
        }
        }else{
         number.add(x);
         for(int i = 0;i < a.length;i++){
          number.add(a[count]);
          count += 1;
         }
        }
        int [] ret = new int[number.size()];
        for(int i = 0; i < ret.length;i++){
         ret[i] = number.get(i);
        }
		return ret;
	    }
}
