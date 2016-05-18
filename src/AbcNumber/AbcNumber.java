package AbcNumber;

 class AbcNumber {
    public int convert(String num) {
        int result = 0;
        for(char sym:num.toCharArray()){
            result = result*10 + sym-'a';
        }
    return result;
    }
}
