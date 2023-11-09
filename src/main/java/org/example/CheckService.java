package org.example;

public class CheckService {

    public static boolean containsPigDogLetters(String text) {

        if (text.toLowerCase().contains("ы") || text.toLowerCase().contains("э") || text.toLowerCase().contains("ъ"))
            return true;
        return false;
    }

    public static boolean isCorrectAnswer(String response) {

        if (response.toLowerCase().equals("хліб"))
            return true;
        return false;
    }
}
