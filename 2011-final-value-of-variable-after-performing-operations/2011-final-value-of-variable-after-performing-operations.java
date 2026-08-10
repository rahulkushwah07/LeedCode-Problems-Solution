class Solution {
    public int finalValueAfterOperations(String[] o) {
    int re=0;
    for(int i=0;i<o.length;i++)
    if(o[i].charAt(1)=='+') re++;
    else  re--;
    return re;
    }
}