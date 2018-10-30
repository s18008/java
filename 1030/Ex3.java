class Ex3{

	public String ex3_0(int n){
       if(n > 0){
        return "その値は正です";
       }else{
        return "その値は０か負です";
       }

	}

	public int ex3_1(int n){
		
		return Math.abs(n);

	}

	public String ex3_2(int a, int b){
        if(a % b == 0){
         return String.format("%sは%sの約数です",b,a);
        }else{
         return String.format("%sは%sの約数ではありません",b,a);
        }
	}

	public String ex3_3(int a, int b){
       if(a > b){
        return String.format("%sの方が大きいです",a);
       }else if(a < b){
        return String.format("%sの方が大きいです",b);
       }else{
        return "同じ値です";
       }
	}

	public String ex3_4(int a){
       if(a < 0){
        return "正でない整数値です";
       }else if(a % 5 == 0){
        return "その値は5で割り切れます";
       }else{
        return "その値は5で割り切れません";
       }
	}

	public String ex3_5(int a){
       if(a < 0){
        return "正でない整数値です";
       }else if(a % 10 == 0){
        return "その値は10の倍数です";
       }else if(a % 10 != 0){
        return "その値は10の倍数ではありません";
       }else{
        return "dummy"; 
       }
	}
	
	public String ex3_6(int a){
        if(a < 0){
         return "正でない整数値です";
        }else if(a % 3 == 0){
        return "その値は3で割り切れます"; 
       }else if(a % 3 == 1){
        return "その値を3で割った余りは1です";
       }else if(a % 3 == 2){
        return "その値を3で割った余りは2です"; 
       }else{
        return "dummy"; 
       }
	}

	public String ex3_7(int a){
        if(a < 0 || a > 100){
         return "範囲(0～100)外の値です";
        }else if(0 <= a && a < 60 ){
         return "不可"; 
        }else if(60 <= a && a < 70){
         return "可"; 
        }else if(70 <= a && a < 80){
         return "良"; 
        }else{
         return "優"; 
        }
	}

	public double ex3_8(double a, double b){
        if(a > b){
         return a; 
        }else{
         return b; 
        }
	}

	public int ex3_9(int a, int b){
        return a - b;
	}

	public String ex3_10(int a, int b){
        if(Math.abs(a - b) >= 11){
         return "それらの差は11以上です"; 
        }else{
         return  "それらの差は10以下です"; 
        }
	}

	public int ex3_11(int a, int b, int c){
       int min = Math.min(a,b);
		return Math.min(min,c);
	}

	public int ex3_12(int a, int b, int c){
		if(a >= b) {
   	     if(b >= c) {
    			return b;
    		}
    		else if(a <= c) {
    			return a;
    		}
    		else {
    			return c;
    		}
    	}
    	else if(a > c) {
    		return a;
    	}
    	else if(b > c) {
    		return c;
    	}
    	else {
    		return b;
    	}
    }
	

	public String ex3_13(int a){
        if(0 >= a || 12 < a){
         return "範囲(1～12)外の値です"; 
        }else if(3 <= a && a <= 5){
         return "春";
	    }else if(6 <= a && a <= 8){
         return "夏"; 
        }else if(9 <= a && a <= 11){
         return "秋"; 
        }else{
         return "冬"; 
        }
}
}
