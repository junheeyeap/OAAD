import java.util.*;

/*
 * A, B 두 사람이 볼링을 치고 있습니다. 두 사람은 서로 무게가 다른 볼링공을 고르려고 합니다.
 * 볼링공은 총 N개가 있으며, 각 볼링공마다 무게가 적혀있고, 공의 번호는 1번부터 순서대로 부여됩니다. 또한 같은 무게의 공이 여러개 있을 수 있지만, 서로 다른 공으로 간주합니다
 * 볼링공의 무게는 1부터 M까지의 자연수 형태로 존재합니다.
 *
 * 예를 들어 N이 5이고, M이 3이며 각각의 무게가 차례대로 1, 3, 2, 3, 2일 때, 각 공의 번호가 차례대로 1번부터 5번까지 부여됩니다
 * 이때 두 사람이 고를 수 있는 볼링공 번호의 조합을 구하면 다음과 같습니다
 *
 * [ (1번, 2번), (1번, 3번), (1번, 4번), (1번, 5번), (2번, 3번), (2번, 5번), (3번, 4번), (4번, 5번) ]
 *
 * 결과적으로 두 사람이 공을 고르는 경우의 수는 8가지입니다. N개의 공의 무게가 각각 주어질 때,
 * 두 사람이 볼링공을 고르는 경우의 수를 구하는 프로그램을 작성하세요
 *
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }

        int[] array = new int[11];

        for (int count : data) {
            array[count] += 1;
        }

        int result = 0;
        // 1부터 M까지 해당하는 각 무게에 대하여 처리
        for (int i = 1; i < m + 1; i++) {
            // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            n -= array[i];
            // B가 선택하는 경우의 수와 곱하기
            result += array[i] * n;
        }
        System.out.println(result);
    }

}