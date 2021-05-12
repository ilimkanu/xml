public class Geoplugin {
    private String geoplugin_request;
    private int geoplugin_status;

    public Geoplugin() {
    }

    public Geoplugin(String geoplugin_request, int geoplugin_status) {
        this.geoplugin_request = geoplugin_request;
        this.geoplugin_status = geoplugin_status;
    }

    @Override
    public String toString() {
        return "Geoplugin{" +
                "geoplugin_request='" + geoplugin_request + '\'' +
                ", geoplugin_status=" + geoplugin_status +
                '}';
    }

    public String getGeoplugin_request() {
        return geoplugin_request;
    }

    public void setGeoplugin_request(String geoplugin_request) {
        this.geoplugin_request = geoplugin_request;
    }

    public int getGeoplugin_status() {
        return geoplugin_status;
    }

    public void setGeoplugin_status(int geoplugin_status) {
        this.geoplugin_status = geoplugin_status;
    }
}
