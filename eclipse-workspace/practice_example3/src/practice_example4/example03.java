package practice_example4;

public class example03 {
	
	static class Song {
		String title;
		String artist;
		int year;
		String country;
		
		Song(){
			
		}
		Song(String title,String artist,int year,String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
		}
	void show(){
		 System.out.println(year+"�� "+country+"�� "+artist+"�� �θ� "+title);
		}
	}

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen","ABBA",1978,"������");
		song.show();

	}

}
