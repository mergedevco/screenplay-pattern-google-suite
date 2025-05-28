package co.mergedev.googlesuite.models;

public class TranslateModel {
    private String word;
    private String sourceLanguage;
    private String resultLanguage;
    private String resultWord;

    public TranslateModel() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getResultLanguage() {
        return resultLanguage;
    }

    public void setResultLanguage(String resultLanguage) {
        this.resultLanguage = resultLanguage;
    }

    public String getResultWord() {
        return resultWord;
    }

    public void setResultWord(String resultWord) {
        this.resultWord = resultWord;
    }
}
