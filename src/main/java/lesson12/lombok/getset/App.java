package lesson12.lombok.getset;

import lombok.SneakyThrows;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductModel model = new ProductModel();
        model.setName("Product 1");
        String name = model.getName();

        String category = model.getCategory();
        System.out.println(model);


//        UserModel userModel = new UserModel("full name", 44, "email", 4l);
//        UserModel userModel2 = new UserModel();
        UserModel userModel3 = new UserModel("Email", 4l);
//        UserModel userModel4 = UserModel.getInstance();
//        String email = userModel.getEmail();
//        String fullName = userModel.getFullName();
//        System.out.println(email.length());

        List<String> addresses = new ArrayList<>() {{
            add("address 1");
            add("address 2");
        }};
        UserModel builtModel = UserModel.builder()
                .age(23)
                .fullName("Full Name")
                .email("email")
                .addresses(addresses)
                .address("address 3")
                .address("address 4")
                .id(11L)
                .build();
        builtModel.getAddresses();


    }

    @SneakyThrows
    public static void createFile() {
        File file = new File("tst.txt");

        file.createNewFile();
    }
}
