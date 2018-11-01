import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Ex4{

	public int [] ex4_1(int [] a){
		Arrays.sort(a);
        return a;

	}

	public int [] ex4_2(int[] a){
        List<Integer> list = new ArrayList<Integer>();
        for(int b : a){
          list.add(b);
        } 
        Collections.sort(list, Collections.reverseOrder());
        for(int i = 0; i < a.length;i++){
          a[i] = list.get(i);
        }
        return a;
	}

	public String [] ex4_3(int [] a){
		String [] hantei = new String[a.length];
        int i = 0;
        for(int b : a){
          if(b > 0){
            hantei[i] = ("正");
            i += 1;
          }else if(b < 0){
            hantei[i] = ("負");
            i += 1;
          }else{
            hantei[i] = ("零");
            i += 1;
          }
        }
		
		return hantei;

	}

	public int ex4_4(int a){
        int Len = String.valueOf(a).length();
		return Len;

	}

	public int ex4_5(int a){
        int sel = 0;
        for(int i = 1; i <= a; i++){
         sel += i;
        }
        return sel;
	}

	public int [] ex4_6(int a){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= a ; i++){
         if(a % i == 0){
          list.add(i);
         }
         }
         int [] ret = new int[list.size()];
         for(int i = 0; i < list.size(); i++){
          ret[i] = list.get(i);
         }
		return ret;

	}

	public boolean ex4_7(int a){
		if(1 == a){
         return false;
        }
        for(int i = 2 ; i <= a; i++){
         if(i == a){
          return true;
         }else if(a % i == 0)
             break;
        }
		return false;

	}

	public int ex4_8(int [] a){
        int sel = 0;
        for(int i: a){
         sel += i;
        }
		return sel;

	}

	public int ex4_9(int [] a){
		double sel = 0;
        double syou;
        for(int i: a){
         sel += i;
        }
        syou = Math.round(sel/a.length);
        int heikin = (int)syou;
		return heikin;

	}
}

