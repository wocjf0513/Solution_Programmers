
class Solution8 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
    
        answer=n-lost.length;
    
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++)
            {
                if(lost[i]==reserve[j])
                {
                    lost[i]=-10;
                    reserve[j]=-20;
                    answer++;
                    break;
                }
            }
        }
//lost�� reserve�� ������, lost�� reserve �迭���� ���� �ϰ� answer ���� �ϳ� �÷��ش�.
        for(int i:reserve){
        	for(int j=0; j<lost.length; j++)
        	{
        		if(i==lost[j]-1) {
        			answer++;
        			lost[j]=-10;
        			break;
        		}
        		if(i==lost[j]+1) {
        			answer++;
        			lost[j]=-10;
        			break;
        		}
        	}
        }
            
        return answer;
    }

    public static void main(String args[]) {
    	System.out.print(
    	    	solution(5,new int[] {2,4},new int[] {3}));
    }
}