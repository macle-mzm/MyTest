/*
 * 作者:马泽民  创建日期 2006-8-26
 * E_Mail: mazemin@bsw.gov.cn
 *
 * 单位: 北京软件产业促进中心培训学校
 * 网址: http://www.bsw.gov.cn
 */
package unit_2;

/**
 * @author mzm
 *
 * 类名: Demo_2_Change
 * 
 * 演示基本数据类型进行强制转换时，出现的情况
 */
public class Demo_2_Change
{

    public static void main(String[] args)
    {
        int a=128;
        int b=-129;
        int c=255;
        int d=513;
        int e=511;
        
        System.out.println("128:"+(byte)a);
        System.out.println("-129:"+(byte)b);
        System.out.println("255:"+(byte)c);
        System.out.println("513:"+(byte)d);
        System.out.println("511:"+(byte)e);
    }
}
