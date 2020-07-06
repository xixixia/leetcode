package demo;

public class Demo1103 {

    public static void main(String[] args) {
        int candies = 7;
        int num_people = 4;
        int[] ints = distributeCandies(candies, num_people);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] nums = new int[num_people];
        int count = 1;
        int i = 0;
        while (candies > 0) {
            if (i == num_people) {
                i = 0;
            }
            nums[i] += count < candies ? count : candies;
            candies -= count < candies ? count : candies;
            i++;
            count++;
        }
        return nums;
    }
}
