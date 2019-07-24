public class TongDuongCheoChinh {
    public static void main(String[] args) {
        float[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int height = arr.length;
        float sum = 0;
        for (int i = 0; i < height; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tong cac phan tu duong cheo chinh la: " + sum);
    }
}
