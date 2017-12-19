package ALG;

import java.util.Stack;

public class 两栈实现队列 {

    public static void main(String[] args) {

        MList<Integer> integerMList = new MList<>();
        for(int i = 0;i<10;i++){
            integerMList.appendTail(i);
        }

        for(int i = 0;i<integerMList.size();i++){
            System.out.print(integerMList.getTail());
        }

    }

    static class MList<T>{

        private Stack<T> stack1 = new Stack<>();

        private Stack<T> stack2 = new Stack<>();

        private int length;

        public MList(){

        }

        public void appendTail(T t){
            stack1.add(t);
        }

        public T getTail(){

            if(stack2.isEmpty()){

                length = stack1.size();
                while(!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }
            }

            if(stack2.isEmpty()){
                throw new RuntimeException("No more elements");
            }

            return stack2.pop();

        }

        public int size(){
           if(stack1.size() != 0){
               return stack1.size();
           }else{
               return length;
           }
        }

    }

}
