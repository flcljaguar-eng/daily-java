package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable{
	@Override
	public int doJanken() throws IOException {
		int a = (int)(Math.random() * 3);
		
		switch (a) {
		case 0:
			System.out.println("コンピューターはグーを選んだ");
			break;
		
		case 1:
			System.out.println("コンピューターはチョキを選んだ");
			break;
			
		case 2:
			System.out.println("コンピューターはパーを選んだ");
			break;
		
		}

		return a;
	}
	
}
