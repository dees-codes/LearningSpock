class GroovyTruthSpec extends spock.lang.Specification {

    //Demonstrating any non 0 number is evaluated to true in groovy.
    //Demonstrating any non-empty list is evaluated to true in groovy.
    def "testing if the Word detector class works right" (){
        when: "sentence is fed into word detector object"
        WordDetector wd = new WordDetector()
        wd.parseText("Understanding is a three edged sword: your side, their side, and the truth")

        then: "Do words exist in the sentence fed and is there any word repetitions?"
        println "Total words found " + wd.wordsFound()
        println "The words are " + wd.getWords()
        wd.wordsFound() //For this test to pass, there must be words in the sentence fed to WordDetector
        println "Array of duplicate words: " + wd.duplicatesFound()
        wd.duplicatesFound() //For this test to pass, the arrayList returned must be non-empty
    }
}