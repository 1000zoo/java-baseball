package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class GameIO {

    public static String  enterNumber() throws IllegalArgumentException {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        throwErrorIfInvalidNumber(input);
        return input;
    }

    public static String enterOption() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        throwErrorIfInvalidOption(input);
        return input;
    }

    public static void printLog(String log) {
        System.out.println(log);
    }

    public static void throwErrorIfInvalidOption(String option) {
        if (!patternMatcher(option, "[12]")) {
            throw new IllegalArgumentException();
        }
    }

    public static void throwErrorIfInvalidNumber(String number) {
        if (!patternMatcher(number, "[1-9]{3}") || !isAllNumberUnique(number)) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isAllNumberUnique(String number) {
        Set<String> set = new HashSet<>(List.of(number.split("")));
        return set.size() == 3;
    }

    private static boolean patternMatcher(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(str).matches();
    }
}
