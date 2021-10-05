 class StackByArray{
 int array[],
capacity,
top;
 StackByArray(int c)
{
 capacity = c;
 array = new int[ capacity] ;
 top = 0; }
 boolean isEmpty()
{
 return (top == 0);
}
 boolean isFull()
{
 return (top == capacity);
}
 void push (int
value) {
 if (!isFull())
{
 array[top] = value;
 top++; }
}
 int pop()
{
 if (!isEmpty())
{
 return array[--top];
}
 else
 return array[ top] ; }
}
 public String toString()
{
 String tempStr;
 tempStr = "Top = " + top + "\n";
 for (int i = top - 1; i >= 0; i--)
{
 tempStr = tempStr + array[i] + "\n";
}
 return tempStr;
}
}
 public class ArrayDemo{
 public static void main(String[] args){
 StackByArray myStack = new StackByArray(5);
 int tempValue;
 myStack.push(5);
 myStack.push(7);
 myStack.push(9);
 System.out.println(myStack);
 while (!myStack.isEmpty())
{
 tempValue = myStack.pop();
 System.out.println(myStack); }
}
}