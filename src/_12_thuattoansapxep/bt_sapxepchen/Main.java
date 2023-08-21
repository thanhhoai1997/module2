package _12_thuattoansapxep.bt_sapxepchen;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. chạy vòng lặp bên ngoài bắt đầu từ i = 1 đến arr.length\n" +
                " -- khai báo 1 biến j và gán j = i\n" +
                "2. tạo vong lặp while bên trong vòng for với điều kiện chạy là j > 0 && phần tử tại ví trí\n" +
                "thứ j phải bé hơn hoặc bằng( nếu sắp xếp giảm thì ngược lại) phần tử đứng trước nó ( arr[j] <= arr[j-1])\n" +
                "-- nếu điều kiện đúng :\n" +
                " + tạo biến temp để lưu trữ giá trị tại j \n" +
                "+ gán phần tử tại j = phần tử tại j - 1\n" +
                "+ gán phần tử tại j-1 = temp\n" +
                " + mỗi lần thực hiện vòng lặp bên trong thì giảm j đi 1 đơn vị \n" +
                "-- j sẽ giảm đến khi điều kiện vòng lặp sai thì nó sẽ dừng vòng lap \n (nó lấy phần tử tại j ban đầu đó \n" +
                " so sánh với ptu trước nó, nếu bé hơn thì nó tiếp tục chèn đến khi phần tử j đó k còn bé hơn hoặc bằng nữa \n" +
                "thì thoát khỏi vpfng lặp while \n" +
                "3. sau khi thoát khỏi vòng lap while thì mảng của chúng ta đã có 1 mảng con nằm đầu tiên trong mảng đã được\n" +
                " sắp xếp tăng từ 0 đến i ban đầu " +
                "-- sau đó tăng i lên và tiếp tục gán j = i:\n" +
                "+ nếu thỏa ddkien vòng lặp bên trong thì nó tiếp tục thực hiện bước 2\n" +
                "+ còn không thì bỏ qua vòng lap bên trong và tiếp tục tặng i\n" +
                "4. sau khi i chạy đến ptu cuối cùng của mảng thì mảng của ta đã được sắp xếp tăng  "
                );
        // i = 1 , 2 ,3 ,4
        // 1 4 1 6 2 3 8 7 // 1 1 4  6
    }
}
