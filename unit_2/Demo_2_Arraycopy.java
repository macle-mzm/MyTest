/*
 * ����:������  �������� 2006-1-7
 * E_Mail: mazemin@bsw.gov.cn
 *
 * ��λ: ���������ҵ�ٽ�������ѵѧУ
 * ��ַ: http://www.bsw.gov.cn
 */
package unit_2;

/**
 * @author mzm
 * 
 * ����: Demo_2_Arraycopy
 * 
 * ��ʾ���鿽������arraycopy��ʹ��
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
