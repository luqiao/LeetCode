package test;

public class test231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPowerOfTwo(15));
		System.out.println(String.valueOf(1));
		
		int it=65;
		float fl=65.0f;
		char ch='A';
		System.out.println(it==fl);//true;
		System.out.println(it==ch);//true;
		Integer ina=2;
		Integer inb=2;
		System.out.println(ina==inb);//true;
		//����2�Զ�װ����
		Integer biga=128;
		Integer bigb=128;
		System.out.println(biga=bigb);//false;
		/* java.lang.Integer���Դ����
		 * static final Integer[] cache=new Integer[-(-128)+127+1];
		 * static {
		 *    //ִ�г�ʼ��������-128��127��Integerʵ�������ŵ�cache������
		 *    for(int i=0;i<cache.length;i++)
		 *    	cache[i]=new Integer(i-128);
		 *    }
		 * */
		/*���ԣ�-128-127֮���ͬһ�������Զ�װ���Integerʵ��ʱ����Զ��������cache�����ͬһ������Ԫ�أ���������ȫ�����
		 * ��ÿ�ΰ�һ������-128-127��Χ�ڵ������Զ�װ���Integerʵ��ʱ��ϵͳ�������´���һ��Integerʵ�����������н����false
		 */
		//valueOf()
		//�������new������������Integer������ÿ�η���ȫ�µ�Integer����
		//�������valueOf()����������Integer������Ỻ��÷��������Ķ���
		
		//�����µ�Integer����
		Integer in1=new Integer(6);
		//�����µ�Integer���󣬲�����ö���
		Integer in2=Integer.valueOf(6);
		//ֱ�Ӵӻ�����ȡ��Integer����
		Integer in3=Integer.valueOf(6);
		System.out.println(in1==in2);//false
		System.out.println(in2==in3);//false
		//����Integerֻ����-128-127֮���ֵ
		//���200��Ӧ��Integer����û�б�����
		Integer in4=Integer.valueOf(200);
		Integer in5=Integer.valueOf(200);
		System.out.println(in4==in5);//false
		
		
		
		String str1=new String ("hello");
		String str2=new String ("hello");
		System.out.println(str1==str2);//false;
		System.out.println(str1.equals(str2));//ture;
		//str1��str2�������ͱ�����ͨ��new �ؼ��ִ����String���󣬹ʲ����
		/*("hello"��new String("hello")������
		 * 		��java����ֱ��ʹ�����硰hello�����ַ���ֱ����(�����ڱ���ʱ��ֱ�Ӽ���������ַ���ֵ)ʱ��
		 * 		JVM����ʹ�ó�������������Щ�ַ���
		 * 		��ʹ��new String("hello")ʱ��JVM����ʹ�ó�����������"hello"ֱ�������ٵ���String��Ĺ�����
		 * 		������һ���µ�String�����´����String ���󱻱����ڶ��ڴ��С�
		 * 		Ҳ���ǣ�new String("hello")һ�������������ַ�������)
		 */
		
		
		String s1="xuexijava";
		String s2="xuexi";
		String s3="java";
		//s4������ַ���ֵ�����ڱ���ʱ��ȷ��������s4ֱ�����ó����ص�"xuexi java"
		String s4="xuexi"+"java";
		//s5��s4һ����
		String s5="xue"+"xi"+"java";
		//s6������ַ���ֵ�����ڱ���ʱ��ȷ�����������Բ������ó��������Ϲص��ַ���
		String s6=s2+s3;
		//s7�ڶ������У����ڳ�������
		String s7=new String("xuexijava");
		System.out.println(s1==s4);//true;
		System.out.println(s1==s5);//true;
		System.out.println(s1==s6);//false;
		System.out.println(s1==s7);//false;
		
		//JVM�����ر�֤��ͬ���ַ���ֱ��ֵֻ��һ������������������
		//String�Ѿ���д��Object��equals()������String��equals()�����ж���ȵı�׼��
		//ֻҪ�����ַ������������ַ�������ȣ�ͨ��equals()�ȽϽ�����true
		
		
		
		//��Ŀ
		String s="hello";
		String t="hello";
		char c[]={'h','e','l','l','o'};
		s.equals(t);  //true;
		t.equals(c);  //false;
	//	s==t;         //true;
		t.equals(new String("hello"));//true;
		//t.equals(c)��������instanceof String ��һ���Ͳ���ͨ����Ҳ����char[]ѹ�����ܺ�String�Ƚϣ����Ͳ�ͬ
		
	
	}
	
    public static boolean isPowerOfTwo(int n) {
        int m;
        m=(int)Math.sqrt(n);
        if(m*m==n)
        	return true;
        return false;
    }

}




