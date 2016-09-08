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
		//两个2自动装箱了
		Integer biga=128;
		Integer bigb=128;
		System.out.println(biga=bigb);//false;
		/* java.lang.Integer类的源代码
		 * static final Integer[] cache=new Integer[-(-128)+127+1];
		 * static {
		 *    //执行初始化，创建-128到127的Integer实例，并放到cache数组中
		 *    for(int i=0;i<cache.length;i++)
		 *    	cache[i]=new Integer(i-128);
		 *    }
		 * */
		/*所以，-128-127之间的同一个整数自动装箱成Integer实例时，永远都是引用cache数组的同一个数组元素，所以它们全部相等
		 * 但每次把一个不在-128-127范围内的整数自动装箱成Integer实例时，系统总是重新创建一个Integer实例，所以运行结果是false
		 */
		//valueOf()
		//如果采用new构造器来创建Integer对象，则每次返回全新的Integer对象
		//如果采用valueOf()方法来创建Integer对象，则会缓存该方法创建的对象
		
		//生成新的Integer对象
		Integer in1=new Integer(6);
		//生成新的Integer对象，并缓存该对象
		Integer in2=Integer.valueOf(6);
		//直接从缓存中取出Integer对象
		Integer in3=Integer.valueOf(6);
		System.out.println(in1==in2);//false
		System.out.println(in2==in3);//false
		//由于Integer只缓存-128-127之间的值
		//因此200对应的Integer对象没有被缓存
		Integer in4=Integer.valueOf(200);
		Integer in5=Integer.valueOf(200);
		System.out.println(in4==in5);//false
		
		
		
		String str1=new String ("hello");
		String str2=new String ("hello");
		System.out.println(str1==str2);//false;
		System.out.println(str1.equals(str2));//ture;
		//str1和str2是引用型变量，通过new 关键字创造的String对象，故不想等
		/*("hello"和new String("hello")的区别：
		 * 		当java程序直接使用形如“hello”的字符串直接量(包括在编译时就直接计算出来的字符串值)时，
		 * 		JVM将会使用常量池来管理这些字符串
		 * 		当使用new String("hello")时，JVM会先使用常量池来管理"hello"直接量，再调用String类的构造器
		 * 		来创造一个新的String对象，新创造的String 对象被保存在堆内存中。
		 * 		也就是：new String("hello")一共产生了两个字符串对象)
		 */
		
		
		String s1="xuexijava";
		String s2="xuexi";
		String s3="java";
		//s4后面的字符串值可以在编译时就确定下来，s4直接引用常量池的"xuexi java"
		String s4="xuexi"+"java";
		//s5和s4一样的
		String s5="xue"+"xi"+"java";
		//s6后面的字符串值不能在编译时就确定下来，所以不能引用常量池镇南关的字符串
		String s6=s2+s3;
		//s7在堆内容中，不在常量池中
		String s7=new String("xuexijava");
		System.out.println(s1==s4);//true;
		System.out.println(s1==s5);//true;
		System.out.println(s1==s6);//false;
		System.out.println(s1==s7);//false;
		
		//JVM常量池保证相同的字符串直接值只有一个，不会产生多个副本
		//String已经重写了Object的equals()方法，String的equals()方法判断相等的标准：
		//只要两个字符串所包含的字符序列相等，通过equals()比较将返回true
		
		
		
		//题目
		String s="hello";
		String t="hello";
		char c[]={'h','e','l','l','o'};
		s.equals(t);  //true;
		t.equals(c);  //false;
	//	s==t;         //true;
		t.equals(new String("hello"));//true;
		//t.equals(c)这个语句在instanceof String 这一步就不会通过，也就是char[]压根不能和String比较，类型不同
		
	
	}
	
    public static boolean isPowerOfTwo(int n) {
        int m;
        m=(int)Math.sqrt(n);
        if(m*m==n)
        	return true;
        return false;
    }

}




