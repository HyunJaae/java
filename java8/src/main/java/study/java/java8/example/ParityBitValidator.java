package study.java.java8.example;

public class ParityBitValidator {

    public static void main(String[] args) {
        int idToCheck = 0b1001001010101101; // 여기에 확인하고 싶은 16비트 ID를 2진수로 입력해주세요
        boolean isValid = isIdValid(idToCheck);

        if (isValid) {
            System.out.println("유효한 ID입니다.");
        } else {
            System.out.println("유효하지 않은 ID입니다.");
        }
    }

    public static boolean isIdValid(int id) {
        System.out.println("id = " + id);
        int parityBit = (id >> 15) & 1; // 최상위 비트(패리티 비트)
        System.out.println("parityBit = " + parityBit);
        int dataBits = id & 0x7FFF;     // 하위 15비트(데이터 비트)
        System.out.println("dataBits = " + dataBits);

        // 15비트 값의 1비트 개수를 세는 함수
        int setBitsCount = countSetBits(dataBits);
        System.out.println("setBitsCount = " + setBitsCount);

        // 패리티 비트와 데이터 비트의 1비트 개수가 일치하는지 검사
        return (setBitsCount % 2) == parityBit;
    }

    public static int countSetBits(int value) {
        int count = 0;
        while (value > 0) {
            count += value & 1;
            value >>= 1;
        }
        return count;
    }
}
