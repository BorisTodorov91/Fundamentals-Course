package ObjectAndClass.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputData = scanner.nextLine();

        String[] command = inputData.split(", ");
        String name = command[0];
        String content = command[1];
        String author = command[2];

        Article article = new Article(name,content,author);
     //   List<Article> articleList = new ArrayList<>();
        int numOfCommand = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfCommand; i++) {
            String inputCommand = scanner.nextLine();

            String[] token = inputCommand.split(": ");

            String nameOfComand = token[0];

            switch (nameOfComand){
                case "Edit":
                    String newContent = token[1];
                    article.setContent(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = token[1];
                    article.setAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = token[1];
                   article.setName(newTitle);
                    break;
            }
        }
       // articleList.add(article);
        //articleList.forEach(System.out::println);
        System.out.println(article);
    }


}
