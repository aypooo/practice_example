
public class Exercise6_05 {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);
		
		System.out.println(s.info());

	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;	
	
	public Student() {
		
	}	
	public Student(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math;
	}
	
}
