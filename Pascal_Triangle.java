import java.util.ArrayList;
import java.util.List;
public class Pascal_Triangle {
//    static public List<Integer> getRow1(int rowIndex) {
//        List<Integer>row=new ArrayList<>();
//        row.add(1);
//
//        for (int i=1;i<=rowIndex;i++){
//            for (int j=i-1;j>0;j--){
//                row.set(j,row.get(j)+row.get(j-1));
//            }
//            row.add(1);
//        }
//
//        return row;
//    }
static public List<Integer> getRow1(int rowIndex) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    for(int i = 1 ; i<= rowIndex ; i++){
        for(int j = i-1; j >0 ; j--){
            list.set(j,list.get(j-1) + list.get(j));
        }
        list.add(1);
    }
    return list;
}

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0 ; i <= rowIndex ; i ++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 1 ; j < i ; j ++){
                int value = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                list.add(value);
            }
            if(i > 0){
                list.add(1);
            }
            triangle.add(list);
        }
        return triangle.get(rowIndex );
    }

    public static void main(String[] args) {
        System.out.println(getRow1(7));
    }
}
