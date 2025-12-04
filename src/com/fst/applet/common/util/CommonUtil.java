package com.fst.applet.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Vector;

public class CommonUtil {

	/**
	 * 
	 * Data type이 Number 일 경우 true를 return 한다.
	 * 
	 * <pre>
	 * 
	 * [사용 예제]
	 * 
	 * isNumber(1)		===> true
	 * isNumber("A")		===> false
	 * 
	 * </pre>
	 * 
	 * @param value
	 * @return boolean
	 */
	public static boolean isNumber(Object element) 
	{
		if (element instanceof Number)
			return true;
		else
			return false;
	}	
   
	/**
	 * 
	 * Data type이  String 일 경우 true를 return 한다.
	 * 
	 * <pre>
	 * 
	 * [사용 예제]
	 * 
	 * isString("A")		===> true
	 * isString(1)		===> false
	 * 
	 * </pre>
	 * 
	 * @param value
	 * @return boolean
	 */
	public static boolean isString(Object element) 
	{
		if (element instanceof String)
			return true;
		else
			return false;
	}	
	   
	/**
	 * 
	 * 입력한 값이 null 또는 null String 일 경우 true를 return 한다.
	 * 
	 * <pre>
	 * 
	 * [사용 예제]
	 * 
	 * isEmpty("")		===> true
	 * isEmpty("1")		===> false
	 * 
	 * </pre>
	 * 
	 * @param value
	 * @return boolean
	 */
	public static boolean isEmpty(String value) 
	{
		if (value == null || "".equals(value.trim()))
			return true;
		return false;     
	}	

	/**
	 * 
	 * 입력한 Array의 값이 입력한 Key 와 첫번째로 같은 index를 return 한다.
	 * 
	 * <pre>
	 * 
	 * [사용 예제]
	 * 
	 *	String [] a = new String[3];
	 *	a[0] = new String("ccc");
	 *	a[1] = new String("bbb");
	 *	a[2] = new String("aaa");	
	 *	
	 *	searchArray(a,"aaa")	===> 2
	 *
	 *	String [] a = new String[3];
	 *	a[0] = new String("ccc");
	 *	a[1] = new String("bbb");
	 *	a[2] = new String("aaa");	
	 *	
	 *	searchArray(a,"a")	===> -1
	 *
	 * </pre>
	 * 
	 * @param array
	 * @param key
	 * @return int
	 */
	public static int searchArray(Object [] array, Object key) {
		if (key==null || array == null)
			return -1;
		for (int i = 0; i < array.length; i++) {
			if (key.equals(array[i]))
				return i;
		}
		return -1;
	}	

	/**
	 * 
	 * Object의 Array 를 복제(clone)하여 새로운 Instance를 만들어 Return한다.
	 *
	 * @param objects
	 * @return java.lang.Object[]
	 */
    public static Object[] clone(Object objects[])
    {
        int length = objects.length;
        Class c = ((Object) (objects)).getClass().getComponentType();
        Object array = Array.newInstance(c, length);
        for(int i = 0; i < length; i++)
            Array.set(array, i, clone(objects[i]));

        return (Object[])array;
    }

	/**
	 * 
	 * Object 를 복제(clone)하여 새로운 Instance를 만들어 Return한다.
	 * 
	 * <pre>
	 * 
	 * 일반적으로  java.lang.Object.clone() 함수를 사용하여 Object를 clone() 하면 
	 * Object 내에 있는 Primitive type이 아닌 Object field들은 복제가 되지 않고 같은 Object의  reference를 갖게 된다.
	 * 그러나 이 Method는 각 field의 동일한 Object를 새로 만들어 복제(clone)한다.
	 * 
	 * </pre>
	 * 
	 * @param object
	 * @return java.lang.Object
	 */
    public static Object clone(Object object)
    {
        Class c = object.getClass();
        Object newObject = null;
        try
        {
            newObject = c.newInstance();
        }
        catch(Exception e)
        {
            return null;
        }
        Field field[] = c.getFields();
        for(int i = 0; i < field.length; i++)
            try
            {
                Object f = field[i].get(object);
                field[i].set(newObject, f);
            }
            catch(Exception exception) { }

        return newObject;
    }

	/**
	 * 
	 * Vector내의 Object 를 복제(clone)하여 새로운 Instance를 만들어 Return한다.
	 * 
	 * <pre>
	 * 
	 * 일반적으로 Vector Object를 clone() 하면 
	 * Vector내의 Element Object는 새로 생성되는 것이 아니라 같은 Element Object를 reference하는 Vector를 생성하게 된다. 
	 * 왜냐하면, 동일한 Object에 대한 reference만 새로 생성되기 때문이다.
	 * 그러나 이 Method는 Vector내의 모든 Element Object를 새로 만들어 복제(clone)한다.
	 * 
	 * </pre>
	 *
	 * @param objects
	 * @return java.util.Vector
	 */
    public static Vector clone(Vector objects)
    {
        Vector newObjects = new Vector();
        Object o;
        for(Enumeration e = objects.elements(); e.hasMoreElements(); newObjects.addElement(clone(o)))
            o = e.nextElement();

        return newObjects;
    }

	/**
	 * 
	 * Object 의 reference, member, method 모두 복제(clone)하여 Return한다.
	 * 
	 * 일반적으로 clone()은 reference만 복제(clone)하지만 
	 * 이 Mothod는 reference만 복제(clone)하지 않고 member, method를 모두 복제(clone)한다
	 *
	 * @param o
	 * @return java.lang.Object
	 */
    public static Object deepClone(Object o)
    {
        try
        {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(b);
            out.writeObject(o);
            ByteArrayInputStream bi = new ByteArrayInputStream(b.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bi);
            return in.readObject();
        }
        catch(Exception e)
        {
            System.out.println("exception:" + e.getMessage());
        }
        return null;
    }


	/**
	 * 
	 * Object 내에 있는 모든 java.lang.String형의 field 변수 중 null 값으로 된 field를 길이가 0 인 blank string("")으로 초기화 시켜준다
	 * 
	 * @param o
	 */
    public static void fixedNull(Object o)
    {
        if(o == null)
            return;
        Class c = o.getClass();
        if(c.isPrimitive())
            return;
        Field fields[] = c.getFields();
        
        for(int i = 0; i < fields.length; i++)
            try
            {
                Object f = fields[i].get(o);
                Class fc = fields[i].getType();
                if(fc.getName().equals("java.lang.String"))
                    if(f == null)
                        fields[i].set(o, "");
                    else
                        fields[i].set(o, f);
            }
            catch(Exception exception) { }

    }

	/**
	 * 
	 * Object 내에 있는 모든 java.lang.String 뿐만 아니라 Array, Object 의 field 변수 중 null 값으로 된 field를 길이가 0 인 blank string("")으로 초기화 시켜준다
	 * 
	 * <pre>
	 * 
	 * Object 내에 있는 java.lang.String field 뿐만 아니라 Array, Object 가 있으면 
	 * 재귀적으로 쫒아 가서 String형을 blank string("")으로 만들어 준다.
	 * 만약 Array나, Vector가 null일 경우 Instance화는 하지 않는다.
	 * 재귀적으로 추적되는 만큼, 부모와 자식간에 서로 양방향 reference를 갖고 있으면 절대 안된다. 
	 * Stack Overflow를 내며 JVM을 내릴 것이다.
	 * 
	 * </pre>
	 * 
	 *  @param o
	 */
    public static void fixedNullAll(Object o)
    {
        if(o == null)
            return;
        Class c = o.getClass();
        if(c.isPrimitive())
            return;
        if(c.isArray())
        {
            int length = Array.getLength(o);
            for(int i = 0; i < length; i++)
            {
                Object element = Array.get(o, i);
                fixedNullAll(element);
            }

        } else
        {
            Field fields[] = c.getFields();
            for(int i = 0; i < fields.length; i++)
                try
                {
                    Object f = fields[i].get(o);
                    Class fc = fields[i].getType();
                    if(!fc.isPrimitive())
                        if(fc.getName().equals("java.lang.String"))
                        {
                        	System.out.println(f);
                            if(f == null)
                                fields[i].set(o, "");
                            else
                                fields[i].set(o, f);
                        } else
                        if(f != null)
                        	fixedNullAll(f);
                }
                catch(Exception exception) { }

        }
    }

	/**
	 * 
	 * Object 내에 있는 모든 java.lang.String형의 field 변수 중 
	 * null 값으로 된 field는 길이가 0 인 blank string("")으로 초기화 시켜주고 
	 * 정상적인 String이 대입되어 있으면 trim()를 시켜준다.
	 * 
	 * @param o
	 */
    public static void fixedNullAndTrim(Object o)
    {
        if(o == null)
            return;
        Class c = o.getClass();
        if(c.isPrimitive())
            return;
        Field fields[] = c.getFields();
        for(int i = 0; i < fields.length; i++)
            try
            {
                Object f = fields[i].get(o);
                Class fc = fields[i].getType();
                if(fc.getName().equals("java.lang.String"))
                    if(f == null)
                    {
                        fields[i].set(o, "");
                    } else
                    {
                        String item = trim((String)f);
                        fields[i].set(o, item);
                    }
            }
            catch(Exception exception) { }

    }

	/**
	 * 
	 * Object 내에 있는 모든 java.lang.String 뿐만 아니라 Array, Object 의 field 변수 중 
	 * null 값으로 된 field는 길이가 0 인 blank string("")으로 초기화 시켜주고
	 * 정상적인 String이 대입되어 있으면 trim()를 시켜준다.
	 * 
	 * @param o
	 */
    public static void fixedNullAndTrimAll(Object o)
    {
        if(o == null)
            return;
        Class c = o.getClass();
        if(c.isPrimitive())
            return;
        if(c.isArray())
        {
            int length = Array.getLength(o);
            for(int i = 0; i < length; i++)
            {
                Object element = Array.get(o, i);
                fixedNullAndTrimAll(element);
            }

        } else
        {
            Field fields[] = c.getFields();
            for(int i = 0; i < fields.length; i++)
                try
                {
                    Object f = fields[i].get(o);
                    Class fc = fields[i].getType();
                    if(!fc.isPrimitive())
                        if(fc.getName().equals("java.lang.String"))
                        {
                            if(f == null)
                            {
                                fields[i].set(o, "");
                            } else
                            {
                                String item = trim((String)f);
                                fields[i].set(o, item);
                            }
                        } else
                        if(f != null)
                        	fixedNullAndTrimAll(f);
                }
                catch(Exception exception) { }

        }
    }

	/**
	 * 
	 * 에러 발생시 StackTrace를 String으로 Return한다
	 * 
	 * @param e
	 * @return java.lang.String
	 */
    public static String getStackTrace(Throwable e)
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(bos);
        e.printStackTrace(writer);
        writer.flush();
        return bos.toString();
    }

    public static String trim(String s)
    {
        int st = 0;
        char val[] = s.toCharArray();
        int count = val.length;
        int len;
        for(len = count; st < len && (val[st] <= ' ' || val[st] == '\u3000'); st++);
        for(; st < len && (val[len - 1] <= ' ' || val[len - 1] == '\u3000'); len--);
        return st <= 0 && len >= count ? s : s.substring(st, len);
    }
    
    public static String getMessage(String strMessage, Object message) {
    	StringBuffer sbfMessage = new StringBuffer(); 
    	String REPLACE_CHAR = "{MESSAGE}";
    	
    	if (message instanceof String) {
    		sbfMessage.append(strMessage.replaceAll(REPLACE_CHAR, (String)message));
    	}
    	
    	return sbfMessage.toString();
    }
    
}
