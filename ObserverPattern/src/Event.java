import java.lang.reflect.Method;

/**
 * @author Cool-Coding 2017/7/10
 * 事件类
 */
public class Event {
    private Object   object;//对象
    private String   methodName;//方法名
    private Object[] params;//参数数组
    private Class[]  paramTypes;//参数类型

    public Event(Object object,String methodName,Object... params){
        this.object=object;
        this.methodName=methodName;
        this.params=params;
        contractParamTypes();
    }

    private void contractParamTypes(){
        this.paramTypes=new Class[params.length];
        for(int i=0;i<params.length;i++){
            this.paramTypes[i]=params[i].getClass();
        }
    }

    public void invoke() throws Exception{
        //object我写成了Object,导致异常
        Method method=object.getClass().getMethod(methodName,paramTypes);
        if (method==null) {
            System.out.println("没有获取到方法:"+methodName);
            return;
        }
        method.invoke(object,params);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }


}
