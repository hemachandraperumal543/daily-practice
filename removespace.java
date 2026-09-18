class Tester{
    public static String removeWhiteSpaces(String str){
        return str.replaceAll("\\s","");
	}
		public static void main(String args[]){
		String str = "Hemachandra Perumal S";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}