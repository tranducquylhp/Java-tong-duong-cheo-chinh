import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int size = scanner.nextInt();
        float[][] arr = new float[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                System.out.println("Nhap phan tu hang "+i+" cot "+j+" = ");
                arr[i][j] = scanner.nextFloat();
            }
        }

        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tong cac phan tu duong cheo chinh la: " + sum);
    }
}
