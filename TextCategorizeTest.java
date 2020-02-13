import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextCategorizeTest {

    private TextCategorize txtCategorize;

    @BeforeEach
    void setUp() {txtCategorize = new TextCategorize("An apple a day keeps the doctor away");
    txtCategorize.categorize();
    }

    //i still don't understand how to test this function
    @Test
    void categorize() {
        txtCategorize.categorize();
        assertEquals(0,0);
    }

    @Test
    void hasCategories(){
        assertTrue(txtCategorize.hasCategories());
    }

    @Test
    void getWordCount() {
        assertEquals(8,txtCategorize.getWordCount());//number of words in all categories
    }

    @Test
    void getCategories() {
        String[] ideal = {"a","d","t","k"};
        String[] actually = txtCategorize.getCategories().toArray(new String[0]);
        assertArrayEquals(ideal,actually); //letters that start the words in phrase

    }

    @Test
    void getWordsFor() {
        String[] ideal = {"keeps"};
        String[] actually = txtCategorize.getWordsFor("k").toArray(new String[0]);
        assertArrayEquals(ideal,actually); //all words in a specific category
    }



}