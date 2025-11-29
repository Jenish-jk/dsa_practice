package LeetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class L_950_RevalCardsIncreasingOrder {
    public static void main(String[] args) {
        int [] deck = {13, 11, 17, 2, 3, 5};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            if (!dq.isEmpty()) {
                dq.addFirst(dq.removeLast());
            }
            dq.addFirst(deck[i]);
        }

        int[] result = new int[n];
        int idx = 0;
        for (int num : dq) {
            result[idx++] = num;
        }

        return result;
    }
}
