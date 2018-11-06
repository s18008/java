class Ex5{

	public double ex5_1(int [] a){
        double goukei =  0;
        for(int i:a){
         goukei += i;
        }
		double heikin = goukei/a.length;
		
		return heikin;
	}
}