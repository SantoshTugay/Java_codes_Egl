package interview_prgrams.java.Java8_Samples;


public class LambdaExpression {
	public static void main(String[] args) {
		MyFunctionalInterface functionalInterface = () ->
		{
			return "Welcome To The Java 8 Feature Class";
		};
		System.out.println(functionalInterface.name());
		
		MyFunctionalInterface2 functionalInterface2=(a)->a+5;
		System.out.println(functionalInterface2.incrementNum(10));
		
		MyFunctionalInterface3 res=(s1,s2)->s1+s2;
		System.out.println(res.contacString("The", "Rock"));
	}
}
