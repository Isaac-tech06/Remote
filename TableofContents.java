import java.util.LinkedList;
public class TableofContents{

    public static LinkedList<String>ThinkingJava = new LinkedList<String>();

    public static void main(String[] args) {
        ThinkingJava.add("Preface");
        ThinkingJava.add("Chapter 1: Computer Programming");
        ThinkingJava.add("Chapter 2: variables and operators");
        ThinkingJava.add("Chapter 3: Input and Output");
        ThinkingJava.add("Chapter 4: Methods and Testing");
        ThinkingJava.add("Chapter 5: Conditionals and Logic");
        ThinkingJava.add("Chapter 6: Loops and Strings");
        ThinkingJava.add("Chapter 7: Arrays and References");
        ThinkingJava.add("Chapter 8: Recursive Methods");
        ThinkingJava.add("Chapter 9: Immutable objects");
        ThinkingJava.add("Chapter 10: Mutable Objects");
        ThinkingJava.add("Chapter 11: Designing Classes");
        ThinkingJava.add("Chapter 12: Arrays of Objects");
        ThinkingJava.add("Chapter 13: Objects of Arrays");
        ThinkingJava.add("Chapter 14: Extending Classes");
        ThinkingJava.add("Chapter 15: Arrays of Arrays");
        ThinkingJava.add("Chapter 16: Reusing Classes");
        ThinkingJava.add("Chapter 17: Advanced Topics");
        ThinkingJava.add("Apendix A: Tools");
        ThinkingJava.add("Appendix B: Javadoc");
        ThinkingJava.add("Appendix C: Graphics");
        ThinkingJava.add("Appendix D: Debugging");
        ThinkingJava.add("Index");

        System.out.println("First print: ");
        for(String chap: ThinkingJava){
            System.out.println(chap);
        }
        ThinkingJava.removeFirst();
        ThinkingJava.removeLast();
        System.out.println();
        System.out.println("Second print: ");
        for (String chap: ThinkingJava){
            System.out.println(chap);
        }
        ThinkingJava.add(17, "Java Ponies: A New Data Structure");
        System.out.println();
        System.out.println("Last print: ");
        for (String chap: ThinkingJava){
            System.out.println(chap);
        }
    }

}