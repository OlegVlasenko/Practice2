package CountBits;

class CountBits {
    public int count(int num) {
        int result = 0;
        for(char sym:Integer.toBinaryString(num).toCharArray()){
            if( sym =='1') result+=1;
        }
        return result;
    }
}
