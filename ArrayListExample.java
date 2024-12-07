import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Time Complexity: O(1) - Thêm phần tử vào cuối danh sách
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // Time Complexity: O(1) - Truy cập phần tử
        int value = list.get(500000);

        // Time Complexity: O(n) - Tìm kiếm phần tử
        boolean contains = list.contains(999999);

        // Time Complexity: O(n) - Xóa phần tử
        list.remove(Integer.valueOf(500000));

        // Space Complexity: O(n) - Dung lượng bộ nhớ
        System.out.println("List containing  " + list.size() + " elements.");
    }
}

