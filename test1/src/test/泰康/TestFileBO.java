package test.泰康;

public class TestFileBO {
    private String bussion;
    private String bussion2;
    private String bussion3;

    @Override
    public String toString() {
        return "TestFileBO{" +
                "bussion='" + bussion + '\'' +
                ", bussion2='" + bussion2 + '\'' +
                ", bussion3='" + bussion3 + '\'' +
                '}';
    }

    public String getBussion2() {
        return bussion2;
    }

    public void setBussion2(String bussion2) {
        this.bussion2 = bussion2;
    }

    public String getBussion3() {
        return bussion3;
    }

    public void setBussion3(String bussion3) {
        this.bussion3 = bussion3;
    }

    public String getBussion() {

        return bussion;
    }

    public void setBussion(String bussion) {
        this.bussion = bussion;
    }
}
