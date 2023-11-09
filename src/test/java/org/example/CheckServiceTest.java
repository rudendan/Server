package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CheckServiceTest {

    @Test
    public void containsPigDogLettersWithrussianLettersTest() {

        String word = "Привэт";
        Boolean expect = true;
        Boolean result = CheckService.containsPigDogLetters(word);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void containsPigDogLettersWithoutrussianLettersTest() {

        String word = "Привіт";
        Boolean expect = false;
        Boolean result = CheckService.containsPigDogLetters(word);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void isCorrectAnswerTest() {

        String word = "Хліб";
        Boolean expect = true;
        Boolean result = CheckService.isCorrectAnswer(word);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void isCorrectAnswerNOKTest() {

        String word = "Клубника";
        Boolean expect = false;
        Boolean result = CheckService.isCorrectAnswer(word);

        Assert.assertEquals(expect, result);
    }
}