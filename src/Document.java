/**
 * Created by Michael Gugino on 6/13/2018.
 *
 * This class holds the text to be processed, and the functions to do so.
 */
public class Document {

    String text;

    /**
     * Declaration for the class
     * @param text The text to be processed
     */
    public Document(String text){
        this.text = text;
    }

    /**
     * get the text
     */
    String getText(){
        return text;
    }

    /**
     * set the text
     * @param newText new string to set the text to
     */
    void setText(String newText){
        text = newText;
    }
}
