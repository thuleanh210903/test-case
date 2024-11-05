package org.example;

public class App {
    public int average(int value[], int minmum, int maxmum) {
        int i = 0;
        int inputNumber = 0;
        int validNumber = 0;
        int sum = 0;
        int average; // Khai báo biến average

        while ((value[i] != -999) && (inputNumber < 100)) {
            inputNumber++;
            if ((value[i] >= minmum) && (value[i] <= maxmum)) {
                validNumber++;
                sum = sum + value[i];
            }
            i++; // Di chuyển đến phần tử tiếp theo
        }

        if (validNumber > 0) {
            average = sum / validNumber; // Tính toán trung bình
        } else {
            average = -999; // Nếu không có số hợp lệ
        }

        return average; // Trả về giá trị trung bình
    }
}
