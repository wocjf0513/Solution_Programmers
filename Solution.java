import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int x,y,z;
        int len;
        
        len=commands.length;
        int[] answer=new int[len];
        
        for(int k=0; k<len; k++){
        ArrayList<Integer> list=new ArrayList<Integer>();
            x=commands[k][0];
            y=commands[k][1];
            z=commands[k][2];
            System.out.print(x+" "+y+" "+z+" ");
            for(int i=x-1; i<y; i++){
                list.add(array[i]);
            }
            Collections.sort(list);
            
            answer[k]=list.get(z-1);
        }
        return answer;
    }
}