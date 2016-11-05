package Adapter;

public class CommenTarget implements Target {  	  
    @Override  
    public void request() {  
        System.out.println("普通类。。只有普通功能");         
    }  
}
