/*
 * 作者:马泽民  创建日期 2006-1-7
 * E_Mail: mazemin@bsw.gov.cn
 *
 * 单位: 北京软件产业促进中心培训学校
 * 网址: http://www.bsw.gov.cn
 */
package unit_2;

/**
 * @author mzm
 * 
 * 类名: Demo_2_Arraycopy
 * 
 * 演示数组拷贝函数arraycopy的使用
 */
public class Demo_2_Arraycopy
{

    public static void main(String[] args)
    {
        int a[] = new int[10];
        int b[] = { 3, 5, 2, 8, 1 };
        System.arraycopy(b, 2, a, 5, 3);
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + ",");
        System.out.println("");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ",");
        System.out.println("");
    }
}
