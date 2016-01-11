package md.mgmt.base.md;

/**
 * Created by Mr-yang on 16-1-9.
 */
public class ClusterNodeInfo {

    private String ip;
    private Integer port;
    private String distrCode;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDistrCode() {
        return distrCode;
    }

    public void setDistrCode(String distrCode) {
        this.distrCode = distrCode;
    }

    @Override
    public String toString() {
        return "ClusterNodeInfo{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", distrCode='" + distrCode + '\'' +
                '}';
    }
}
