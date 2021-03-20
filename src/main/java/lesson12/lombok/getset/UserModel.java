package lesson12.lombok.getset;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {
    private String fullName;
    private int age;
    @NonNull
    private String email;
    @NonNull
    private Long id;
    @Singular
    private List<String> addresses;
}
