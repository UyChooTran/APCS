
/**
 * Write a description of class Words here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Word implements Comparable
{   
        public int repeat;
        public String word;
    
        public Word(String str)
        {
            word = str;
            repeat = 1;
        }
        
        public void inc()
        {
            repeat++;
        }
        
        public int getRep()
        {
            return repeat;
        }
        
        public String getWord()
        {
            return word;
        }
        
        public int compareTo(Object wrod)
        {
         Word a = (Word)wrod;
         return this.getWord().compareTo(a.getWord());
        }
        
        public boolean equals(Object wrod)
        {
            Word wrd = (Word) wrod;
            return this.getWord().equals(wrd.getWord());
        }
        
        public boolean equals(int x)
        {
         return getRep() == x;   
        }
        
        public String toString()
        {
            String print = getWord() + " " + getRep() + "\n";
            return print;
        }
        
    }

