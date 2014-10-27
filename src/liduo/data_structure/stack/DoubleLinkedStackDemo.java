/**
 * 
 */
package liduo.data_structure.stack;

/**
 * @author liduo
 *简单的双链表实现Stack,未引用任何包
 */
public class DoubleLinkedStackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.put("abc");//压栈
        s.put("def");//压栈
        s.put("ghi");
        System.out.println(s.pop());//出栈
        System.out.println(s.isEmpty());//判断栈是否为空
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
//数据结构
class Stack {  
    private Node root = new Node();
    private Node top = root;
    // 出栈
    public Object pop() {
        if(top != null) {
            Object value = top.getValue();
            top = top.getPrevious();
            return value;
        } else {
            return null;
        }
    }
    public void put(Object value) {
        Node n = new Node(top, value);
        top.setNext(n);
        top = n;
    }
    public boolean isEmpty() {
        return top.getPrevious() == null;
    }
}

class Node {
    private Node next;
    private Object value;
    private Node previous;
    
    public Node() {
        
    }
    
    public Node(Node previous, Object value) {
        this.previous = previous;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
}
