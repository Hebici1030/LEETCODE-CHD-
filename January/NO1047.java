package January;

public class NO1047 {
	public String removeDuplicates(String S) {
        char[] temp = S.toCharArray();
        int index =-1;
        for(int i=0;i<S.length();++i)
        {
            if(index>=0&&temp[index]==S.charAt(i))
            {
                --index;
            }else
            {
                ++index;
                temp[index]=S.charAt(i);
            }
        }
    }
}
