package ee.itcollage.level11;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        List<Word> ClassifiedWords = new ArrayList<>();

        for (Word palabra : words){
            if(palabra.getWordType()== Word.WordType.NOUN){
                ClassifiedWords.add(palabra);
            }
        }
        return ClassifiedWords;
    }

    public Word getFirstVerb(List<Word> words) {
        Word verb = new Word("", Word.WordType.VERB);
        for(Word word : words){
            if(word.getWordType()== Word.WordType.VERB){
                verb.setWord(word.getWord());
                break;
            }
        }
        return verb;
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        Word everyType = new Word("",type);
        for (Word word : words){
            if(word.getWordType()==type){
                everyType.setWord(word.getWord());
                everyType.setWordType(word.getWordType());
                break;
            }
        }
        return everyType;
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        List <Word> listOfNotNouns = new ArrayList<>();
        for(Word word: words){
            if(word.getWordType()!= Word.WordType.NOUN){
                listOfNotNouns.add(word);
            }
        }
        return listOfNotNouns;
    }

    public List<String> getNounStrings(List<Word> words){
        List<String> listOfNames = new ArrayList<>();
        for(Word word: words){
            if(word.getWordType()==Word.WordType.NOUN){
                listOfNames.add(word.getWord());
            }
        }
        return listOfNames;
    }

    public String getFirstVerbString(List<Word> words) {
        List<String> listOfVerbs = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.VERB) {
                listOfVerbs.add(word.getWord());
            }
        }
        return listOfVerbs.get(0);
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        List<String> listofStrings = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType() == type) {
                listofStrings.add(word.getWord());
                break;
            }
        }
        return listofStrings.get(0);
    }
}
