package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
        */
        //duplicate Java and Is both used 3 times

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;
        s = st.toLowerCase();
        String words [] = st.split(" ");
        System.out.println("Duplicates");
        for(int i=0; i< words.length; i++) {
            count = 1;
            for(int j=i+1; j<words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j]="0";
                }
            }
        if(count>1 && words[i]!= "0";) {
            System.out.println(words[i];
            }
        }
    }
}
