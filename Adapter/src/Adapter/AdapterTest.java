package Adapter;

public class AdapterTest {
	public static void main(String[] args) {  
        Adapter adapter = new Adapter();  
        adapter.request();  
        CommenTarget aCommenTarget = new CommenTarget();  
        aCommenTarget.request();  
    }
}
