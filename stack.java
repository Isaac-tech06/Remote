import java.util.ArrayList;

public class stack<e>{
    public ArrayList<e> list;

    public stack(){
        list = new ArrayList<>();
    }
    public void push(e something){
        list.add(something);
        }
    public e pop(){
        return list.remove(list.size() - 1);
        }
    public e peek(){
        return list.get(list.size()-1);
        }
    public int size(){
        return list.size();
        }
    public void print(){
        System.out.println(list);
        }

    public static void main(String[] args) {
        stack<String> stackNew = new stack<>();
        stackNew.push("Hola");
        stackNew.push("Adios");
        stackNew.print();
        System.out.println(stackNew.peek());
        System.out.println(stackNew.pop());
        System.err.println(stackNew.size());
        stackNew.print();
        }
}
