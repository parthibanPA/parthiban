
public class thiskeyword {
	int a = 8;
	/*int rollno;
	String name;
	float fee;*/
	//this can be used to refer current class instance variable.
	//constructor
	/*thiskeyword(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;*/
		//fee=fee;//the assignment to variable fee has no effect
		//}
	public void zz() {
		System.out.println(this.a);

	}
	public void display(int rollno, String name, float fee){
		System.out.println(rollno+" "+name+" "+fee );
		
	}
public static void main(String[] args) {
		thiskeyword ramobj=new thiskeyword();
		ramobj.zz();
		ramobj.display(111, "ram", 23 );
		ramobj.display(112, "sumit", 500);
		ramobj.display(121, "ram", 300f);
		//thiskeyword samobj=new thiskeyword(112,"sam",6000f);
		//samobj.display();
		}
}

//this can be used to refer current class instance variable.
//this can be used to return the current class instance from the method.
