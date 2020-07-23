/**
 * @author Liu Awen
 * @create 2018-05-07 17:01
 */
class Test09_Modify2{
    public static void main(String[] args){
        int i = 1;
        int j = 5;
        //j *= i++ + j++; 等加于 j = j * (i++ + j++);
		/*
		第一步：先把j的值“5”放起来

		第二步：i++
		(1)先取i的值“1”，放起来
		(2)i自增，i=2
		第三步：j++
		(1)先取j的值“5”
		(2)在j自增 j = 6
		第四步：求和
		1 + 5 = 6
		第三步：乘
		用“5” * (和) = 5 * 6 = 30
		第四步：赋值，把乘积赋值给j
		*/
        j *= i++ + j++;
        System.out.println("i = " +  i);//2
        System.out.println("j = " +  j);//30
    }
}