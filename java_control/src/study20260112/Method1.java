package study20260112;

public class Method1 {

	public static void main(String[] args) {
		//매개변수 순서에 맞춰서 넣어줘야!
		Board board = new Board("점심메뉴는?","박문수",45);
		System.out.println( board );
		
		board.hitUp("이순신");
		System.out.println( board );
		
		board.hitUp("박문수");
		System.out.println( board );
		
		board.updateTitle("김춘추", "저녁은 머먹지?");
		System.out.println( board );
		
		board.updateTitle("박문수", "내일 아침은?");
		System.out.println( board );
	}

}
