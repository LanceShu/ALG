package ALG;

public class 字符串替换 {

    public static void main(String[] args) {
        char[] string = "hello world".toCharArray();
        System.out.println(string.length);
        changeString(string,string.length);
    }

    public static void changeString(char[] string,int usedLength){
        if(string == null || string.length < usedLength){
            return;
        }

        int whiteCount = 0;
        for(int i = 0;i<usedLength;i++){
            if(string[i] == ' '){
                whiteCount++;
            }
        }

        int targetLength = whiteCount * 2 + usedLength;

        int tmp = targetLength;
        if(targetLength < usedLength){
            return;
        }

        if(whiteCount == 0){
            System.out.println(string);
            return;
        }

        usedLength --;
        targetLength --;
        System.out.println("uselength:"+usedLength);
        System.out.println("target:"+targetLength);

        char[] chage = new char[targetLength+1];

        while(usedLength >= 0 && usedLength <= targetLength){
            if(string[usedLength] == ' '){
                chage[targetLength--]='0';
                chage[targetLength--]='2';
                chage[targetLength--]='%';
            }else{
                chage[targetLength--]=string[usedLength];
            }
            usedLength --;
        }

        System.out.println(chage);
    }
}
