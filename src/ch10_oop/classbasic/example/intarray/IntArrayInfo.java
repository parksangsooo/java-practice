package ch10_oop.classbasic.example.intarray;

public class IntArrayInfo {
    /*
    ### 정수배열 정보 클래스

- 배열을 생성자 인자로 받아, 그것의 정보를 필드들로 저장
- 복잡한 과정을 거치는 생성자의 예시
     */
    int count;
    int max;
    int min;
    int sum; // 기본 0
    double average;

    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num;
        }
        // 소수부를 잃지 않도록 먼저 1.0을 곱하여 double로 만듦
        average = 1.0 * sum / nums.length;
    }

}
