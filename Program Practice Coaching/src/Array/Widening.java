package Array;

public class Widening {
public static void main(String[] args) {
	byte b=127;
	short s=9999;
	int x=1000000000;
	float f=1000.2f;
	double l=7894455555258257414.2547538;
	int b1=(int)s;
	int l1=(int)l;      //data loss    convert the data decimal to integer//
	System.out.println(l1);
	System.out.println(b1);
}
}
