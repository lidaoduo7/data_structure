/**
 * 
 */
package liduo.data_structure.stack;

/**
 * @author liduo
 *�򵥵�˫����ʵ��Stack,δ�����κΰ�
 */
public class DoubleLinkedStackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.put("abc");//ѹջ
        s.put("def");//ѹջ
        s.put("ghi");
        System.out.println(s.pop());//��ջ
        System.out.println(s.isEmpty());//�ж�ջ�Ƿ�Ϊ��
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
//���ݽṹ
class Stack {  
    private Node root = new Node();
    private Node top = root;
    // ��ջ
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
