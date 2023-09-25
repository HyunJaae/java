package me.hyeonjae;

import java.util.Arrays;

class Outcome {

    public static boolean isOutcomeSafe(PredictedOutcome prediction) {
        return switch (prediction) {
            case COMPANY_WILL_GO_BUST -> false;
            case COMPANY_WILL_MAKE_A_PROFIT -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Arrays.stream(PredictedOutcome.values()).forEach(p -> System.out.println(isOutcomeSafe(p)));
    }
}
