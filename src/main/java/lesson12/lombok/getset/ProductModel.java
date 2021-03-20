package lesson12.lombok.getset;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(exclude = "price")
@EqualsAndHashCode
public class ProductModel {
    private String name;
    private String category;
    @Setter(AccessLevel.PRIVATE)
    private BigDecimal price;
}
