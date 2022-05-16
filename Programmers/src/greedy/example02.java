package greedy;

public class example02 {

	/*당신은 음식점의 계산을 도와주는 점원입니다. 카운트에서는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정합니다. 손님에게 거슬러 주어야 할 돈이 N원일 때, 거슬러 주어야 할 동전의 최소 개수를 구하세요.
	 *  단, 거슬로 줘야 할 돈은 N은 항상 10의 배수입니다.**/
	public static void main(String[] args) {
		int n = 1260;
		int [] coins = { 500, 100, 50, 10 };
		int count =0;
		
		for (int coin : coins) {
			count += n/coin;
			n %= coin;
		}
		System.out.println("거슬러줘야 할 동전의 갯수 " + count);
	}

}
