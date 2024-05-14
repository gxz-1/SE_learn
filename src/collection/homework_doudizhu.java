package collection;

import java.util.ArrayList;
import java.util.Collections;

public class homework_doudizhu {

	public static void main(String[] args) {
		// 准备牌
		ArrayList<String> poker = new ArrayList<String>();
		String[] colors = { "♠", "♥", "♣", "♦" };
		String[] num = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };
		poker.add("大王");
		poker.add("小王");
		for (String s : num) {
			for (String c : colors) {
				poker.add(c + s);
			}
		}

		// 洗牌 使用Colletion的静态方法void shuffle(List<?>list)进行洗牌
		Collections.shuffle(poker);

		// 发牌
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		for (int i = 0; i < 51; i++) {
			int temp = i % 3;
			switch (temp) {
			case 0:
				player1.add(poker.get(i));
				break;
			case 1:
				player2.add(poker.get(i));
				break;
			case 2:
				player3.add(poker.get(i));
				break;
			}
		}

		// 看牌
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);

	}

}
