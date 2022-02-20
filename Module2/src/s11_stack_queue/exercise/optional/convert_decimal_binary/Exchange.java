package s11_stack_queue.exercise.optional.convert_decimal_binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exchange implements IExchange {
    public List<Integer> exchangeBinary(int randomNumber) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> strings = new ArrayList<>();
        while (randomNumber != 0) {
            int count = randomNumber % 2;
            stack.add(count);
            randomNumber = randomNumber / 2;
        }
        int sizeList = stack.size();
        for (int i = 0; i < sizeList; i++) {
            strings.add(stack.pop());
        }
        return strings;
    }

    public int exchangeDecimal(String[] number) {
        Stack<Integer> stack = new Stack<>();
        for (int i = number.length - 1; i >= 0; i--) {
            stack.add((Integer.parseInt(number[i])));
        }
        int numStart = 0;
        while (!stack.isEmpty()) {
            if (stack.peek() == 0) {
                stack.pop();
            } else {
                numStart += Math.pow(2, stack.size() - 1);
                stack.pop();
            }
        }
        System.out.println(numStart);
        return numStart;
    }

    @Override
    public List<String> exchangeHexadecimal(int number) {
        Stack<Integer> stack = new Stack<>();
        List<String> strings = new ArrayList<>();
        while (number != 0) {
            int surplus = number % 16;
            stack.add(surplus);
            number = number / 16;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            switch (stack.peek()) {
                case 10:
                    strings.add("A");
                    break;
                case 11:
                    strings.add("B");
                    break;
                case 12:
                    strings.add("C");
                    break;
                case 13:
                    strings.add("D");
                    break;
                case 14:
                    strings.add("E");
                    break;
                case 15:
                    strings.add("F");
                    break;
                default:
                    strings.add(stack.peek().toString());
            }
            stack.pop();
        }
        return strings;
    }
}
