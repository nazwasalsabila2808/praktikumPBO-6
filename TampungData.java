import java.util.ArrayList;

public class TampungData {
    public static void main(String[] args) {
        // Cara 1: Menggunakan array Object
        Object[] dataArray = {19, 0.2, 'C', "Java", true};
        
        System.out.println("Menggunakan array Object:");
        for (Object item : dataArray) {
            System.out.println(item + " (" + item.getClass().getSimpleName() + ")");
        }
        
        // Cara 2: Menggunakan ArrayList<Object> (lebih fleksibel)
        ArrayList<Object> dataList = new ArrayList<>();
        dataList.add(19);
        dataList.add(0.2);
        dataList.add('C');
        dataList.add("Java");
        dataList.add(true);
        
        System.out.println("\nMenggunakan ArrayList<Object>:");
        for (Object item : dataList) {
            System.out.println(item + " (" + item.getClass().getSimpleName() + ")");
        }
    }
}