class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int extra__space=0;
        char[]arr = moves.toCharArray();
        for(int i=0;i< arr.length;i++){
            char c = arr[i];
            if(c=='U'){
                y++;
            }else if ( c== 'D'){
                y--;
            }else if( c== 'L'){
                x--;
            }else if( c=='R'){
                x++;
            }else if( c=='_'){
                extra__space++;
            }
        }
        return Math.abs(x)+ Math.abs(y)+ extra__space;
    }
}
