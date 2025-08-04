package TNSIF;


public class typecasting {
public static void main(String[] args) {
	//widening  //implicit type casting
	byte b=10;
	int l=b;
	System.out.println(l);
	float f=22.14f;
	double d=f;
	System.out.println(d);
	
	char ch='A';
	int i=ch;
	
	//narrowing //explicit type casting
	double fl=10.52f;
	long ll=(long)fl;
	System.out.println(ll);
	
	int i2=130;
	byte bl=(byte)i2;
	System.out.println(bl);
}
}
