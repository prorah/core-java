package com.corejava.programs;

public abstract class Test {

	public static void main(String[] args) {
		String s="abcabcabcabc";
		String curr_sub_string="";
		String out_sub_string="";
        for(int i=1;i<=s.length()/2;i++){
        	out_sub_string="";
        	curr_sub_string=s.substring(0,i);
            while(out_sub_string.length()<s.length()){
            	out_sub_string+=curr_sub_string;
            }
            if(out_sub_string.equals(s)){
                System.out.println(true);
            }
        }
        //System.out.println(false);
	}
}



