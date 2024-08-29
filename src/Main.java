public class Main {
    // 입력값
    int[] array = { 180, 120, 140 };
    int height = 190;

    public static void main(String[] args) {
        // 출력
        Main main = new Main();
        int answer = main.solution(main.array, main.height);
        System.out.println(answer);
    }

    // 코드 입력
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }

        return answer;
    }
}
