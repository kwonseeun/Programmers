package array;

public class example05 {
	public static void main(String[] args) 
    {
        // 정렬 할 배열 선언
        int test[] = { 20, 30, 40, 50, 10 };
        int i, j, temp, flag;
        System.out.println("정렬 전");
        for (i = 0; i < 5; i++)     // 정렬 전 배열 출력
        {
            System.out.println((i + 1) + "번째 데이터" + test[i]);
        }
        
       
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("정렬 후");
        for (i = 0; i < 5; i++)     // 정렬 후 배열 
        {
            System.out.println((i + 1) + "번째 데이터" + test[i]);
        }
    }
}
