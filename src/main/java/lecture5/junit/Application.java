package lecture5.junit;

import org.apache.commons.lang3.StringUtils;

public class Application {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("Empty string is not allowed here!");
        }
        this.name = name;
    }
}
