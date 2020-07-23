/**
 * @author Liu Awen
 * @create 2018-05-09 22:46
 */
/*
数组的存储：
1、数组下标为什么从0开始？
	下标表示的是这个元素的位置距离首地址的偏移量
2、数组名中存储的是什么
	数组名中存储的是数组在堆中一整块区域的首地址
3、数组的元素如何存储
	在堆中，依次连续的存储的

说明：
数组名，其实也是变量。

回忆：
变量的声明和初始化
	数据类型  变量名 = 变量值;
现在：
	int[] array = {1,3,5,7,9};
	其中的 int[]也是一种数据类型，数组类型，它是一种引用数据类型

	引用，表示引用一个“对象”，引用堆中的一块内存
	Java程序是在JVM中运行，JVM中的内存最最主要的两块区域：栈和堆
	其中的栈就是存储我们的局部变量（现在见到的变量都是局部变量），
		堆中存储的是对象
*/
class Test06_ArraySaveInMemory{
    public static void main(String[] args){
        int[] array = new int[]{1,3,5,7,9};
        //int[] array = {1,3,5,7,9};

        System.out.println(array);//打印数组名
        //结果：[I@1b6d3586   不同的计算机不同时候运行都不一样的
        //这个值是，数组对象的类型@对象的hashCode编码值
        //其中[I，表示int[]类型
        //15db9742是这个数组对象的hashCode编码值，类似于每个人都有一个身份证号
        System.out.println(System.identityHashCode(array));
        //460141958
    }
}