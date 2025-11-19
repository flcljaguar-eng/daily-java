/*問題

パッケージ名 day04
クラス名 Lesson6.java

以下の手順に沿ってコンソールに表示を行いなさい
 
 ・String型配列を定義し"鈴木" "田中" "佐藤"を代入します
 ・for文を用い、配列から上記の文字列を取り出し、","を加えた上で一つの文字列変数に代入します。→String型に文字列連結させる
 ・ただし、最後の要素の後には","をつけないでください。
 ・for文から抜けた後、上記文字列変数を出力して下さい

 【出力例】
カンマ区切りで配列を出力します
鈴木,田中,佐藤
*/

package day04;

public class Lesson6 {

	public static void main(String[] args) {
		/*ここから記入*/
		String[] s1 = { "鈴木", "田中", "佐藤"};
		String a = "";
		
		for (int i=0 ; i<s1.length ; i++ ) {
			a += s1[i];
			
			if (i != s1.length - 1) {
				a += ",";
			}
		}
		System.out.println(a);
	}

}
