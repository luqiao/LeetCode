package String;
/*
  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  
 write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;
  otherwise,  it  will  return  false.   

Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
public class canConstruct383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
    	StringBuilder sb=new StringBuilder(magazine);
        for(int i=0;i<ransomNote.length();i++){
        	char tmp=ransomNote.charAt(i);
        	int index=sb.indexOf(String.valueOf(tmp));
        	if(index==-1)
        		return false;
        	sb.deleteCharAt(index);
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r1="a",m1="b";
		String r2="aa",m2="ab";
		String r3="aa",m3="aab";
		System.out.println(canConstruct(r1,m1));
		System.out.println(canConstruct(r2,m2));
		System.out.println(canConstruct(r3,m3));

	}

}
