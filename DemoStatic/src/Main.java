public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.getId();
        dog.prime = 300; // sử dụng thuộc tính thương phải thông qua đối tượng

        Animal.Name = "Chó bec"; // sử dụng thuộc tính static

        dog.eat(); //sử dụng phương thức tường

        Animal.sound(); // sử dựng phương thức static

        System.out.println("ID : " + dog.getId() + " Giá : " + dog.prime + " Tên : " + Animal.Name);

        //Public có phạm vi truy cập lớn nhất có thể truy cập ở khắp mọi nơi
        //Private có phạm vi truy cập nhỏ nhất  chỉ cho phép truy cập nội bo của một class
        //Dafault có phạm vi truy cập chỉ nằm trong nội bộ package
        //Protected là phạm vi truy cập có thể từ trong và ngoài package, nhưng phải thông qua tính kế thừa


    }
}
