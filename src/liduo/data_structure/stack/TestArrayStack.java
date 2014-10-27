/**
 * 
 */
package liduo.data_structure.stack;

/**
 * @author liduo
 *栈的数组实现的测试类
 */
public class TestArrayStack
{
public static void main(String[] args)
   {
   ArrayStack theStack = new ArrayStack(10);  // make new stack
   theStack.push(20);               // push items onto stack
   theStack.push(40);
   theStack.push(60);
   theStack.push(80);

   while( !theStack.isEmpty() )     // until it's empty,
      {                             // delete item from stack
      long value = theStack.pop();
      System.out.print(value);      // display it
      System.out.print(" ");
      }  // end while
   System.out.println("");
   }  // end main()
}  // end class StackApp
