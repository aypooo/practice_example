
public class Exercise6_05 {
	public static void main(String[] args) {
		Student1 s = new Student1("ȫ�浿",1,1,100,60,76);
		
		System.out.println(s.info());

	}

}

class Student1 extends Student {
	
	public Student1(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage(); 
}

}