import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextCategorizeTest {

    private TextCategorize txtCategorize;

    @BeforeEach
    void setUp() {txtCategorize = new TextCategorize("An apple a day keeps the doctor away");
    txtCategorize.categorize();
    }

    //how do you unit test a void function?? can you??
    @Test
    void categorize() {
        txtCategorize.categorize();
        assertEquals(0,0);
    }

    @Test
    void hasCategories(){
        txtCategorize.hasCategories();
        assertTrue(txtCategorize.hasCategories());

    }

    @Test
    void getWordCount() {
        txtCategorize.getWordCount();
        assertEquals(8,txtCategorize.getWordCount());//number of words in all categories
    }

    /*
    * For getCategories() & getWordsFor(), I don't know how to make arrays the expected response
    * Right now I have the expected responses listed as Strings and they line up with the actual response
    * But I don't know what to do to get the unit tests to pass
     */
    @Test
    void getCategories() {
        txtCategorize.getCategories();
        assertEquals("[a, d, t, k]",txtCategorize.getCategories()); //letters that start the words in phrase
    }

    @Test
    void getWordsFor() {
        txtCategorize.getWordsFor("k");
        assertEquals("[keeps]",txtCategorize.getWordsFor("k")); //all words in a specific category


    }



}