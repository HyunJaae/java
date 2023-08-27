package study.java.java8.example;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class BadReadability {

    /**
     * 팀
     */
    class T {
        Set<String> pns = new HashSet<>(); // 팀에 속한 선수의 이름
        Optional<Integer> s = Optional.of(0); // 팀의 점수

        /**
         * @param n 플레이어 이름
         * @return 플레이어가 팀에 속해 있는 경우
         */
        boolean f(String n) {
            return pns.contains(n);
        }

        /**
         * @return 팀의 점수
         */
        Optional<Integer> getS() {
            return s;
        }

        /**
         * @param ts 모든 팀의 리스트
         * @param n 플레이어의 이름
         * @return 플레이어가 속해 있는 팀의 점수
         */
        Optional<Integer> s(List<T> ts, String n) {
            for (T t : ts) {
                if (t.f(n)) {
                    return t.getS();
                }
            }
            return Optional.empty();
        }
    }
}
