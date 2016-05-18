package SetZero;

class SetZero {
    public int set(int num, int i) {
        String bin = Integer.toBinaryString(num);
        char[] numArray = bin.toCharArray();
        if(i <= numArray.length) {
            numArray[numArray.length - i] = '0';
        }
        int result = 0;
        for(char sym:numArray){
            result = result*2 + sym - '0';
        }
        return result;
    }
}
