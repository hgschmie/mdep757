package mdep757;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = PaulaBean.class)
public class PaulaBean {
    private final String foo;

    public PaulaBean(String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }
}
