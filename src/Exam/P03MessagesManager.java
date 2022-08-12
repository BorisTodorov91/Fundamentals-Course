package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03MessagesManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> userSentMessages = new HashMap<>();
        HashMap<String, Integer> userReceivedMessages = new HashMap<>();

        String inputCon = scanner.nextLine();

        while (!inputCon.equals("Statistics")) {
            String[] tokensType = inputCon.split("=");

            switch (tokensType[0]) {
                case "Add":
                    String username = tokensType[1];
                    int sentMessage = Integer.parseInt(tokensType[2]);
                    int receivedMessage = Integer.parseInt(tokensType[3]);

                    if (!userSentMessages.containsKey(username)) {
                        userSentMessages.put(username, sentMessage);
                        userReceivedMessages.put(username, receivedMessage);
                    }
                    break;
                case "Message":
                    String sender = tokensType[1];
                    String receiver = tokensType[2];

                    if (userSentMessages.containsKey(sender) && userReceivedMessages.containsKey(receiver)) {
                        userSentMessages.put(sender, userSentMessages.get(sender) + 1);
                        userReceivedMessages.put(receiver, userReceivedMessages.get(receiver) + 1);

                        if (userSentMessages.get(sender) + userReceivedMessages.get(sender) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", sender));
                            userSentMessages.remove(sender);
                            userReceivedMessages.remove(sender);
                        }

                        if (userSentMessages.get(receiver) + userReceivedMessages.get(receiver) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", receiver));
                            userSentMessages.remove(receiver);
                            userReceivedMessages.remove(receiver);
                        }
                    }
                    break;
                case "Empty":
                    String usernameEmpty = tokensType[1];

                    if ("All".equals(usernameEmpty)) {
                        userSentMessages.clear();
                        userReceivedMessages.clear();
                    } else {
                        userSentMessages.remove(usernameEmpty);
                        userReceivedMessages.remove(usernameEmpty);
                    }
                    break;
            }

            inputCon = scanner.nextLine();
        }


        System.out.printf("Users count: %d%n", (userSentMessages.size() + userReceivedMessages.size()) / 2);

        userReceivedMessages.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed().thenComparing(Map.Entry::getKey))
                .forEach(e -> {
                    int sentAndReceivedMessages = userSentMessages.get(e.getKey())
                            + userReceivedMessages.get(e.getKey());
                    System.out.printf("%s - %d%n", e.getKey(), sentAndReceivedMessages);
                });
    }
}
