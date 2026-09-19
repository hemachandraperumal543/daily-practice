class Tester {
    public static String reverseEachWord(String str){
	    String result="";
	    String[] word=str.split(" ");
	    for(int i=0;i<word.length;i++){
	        String reverse="";
	        for(int j=word[i].length()-1;j>=0;j--){
	            reverse=reverse+word[i].charAt(j);
	        }
	        result=result+reverse+" ";
	    }
	    return result.trim();
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}