package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_1268_SearchSuggestionSystem {
    public static void main(String[] args) {
        String[] words = {"mobile", "mouse", "moneyPot", "monitor", "mousepad"};
        String search = "mobile";
        System.out.println(suggestedProducts(words, search));;
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        String prefix = "";

        for (char c : searchWord.toCharArray()) {
            prefix += c;
            List<String> suggestions = new ArrayList<>();
            for (String product : products) {
                if (product.startsWith(prefix)) {
                    suggestions.add(product);
                    if (suggestions.size() == 3) break;
                }
            }
            result.add(suggestions);
        }
        return result;

    }
}
