package day05.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader{
	public int inputId() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int id = Integer.parseInt(num);
		
		return id;
		
	}

}
