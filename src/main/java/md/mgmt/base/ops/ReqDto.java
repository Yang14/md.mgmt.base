package md.mgmt.base.ops;

/**
 * Created by Mr-yang on 16-1-9.
 */
public class ReqDto {

    /**
     * 操作类型
     */
    private Integer opsType;
    /**
     * 操作内容
     */
    private String opsContent;

    public Integer getOpsType() {
        return opsType;
    }

    public void setOpsType(Integer opsType) {
        this.opsType = opsType;
    }

    public String getOpsContent() {
        return opsContent;
    }

    public void setOpsContent(String opsContent) {
        this.opsContent = opsContent;
    }

    @Override
    public String toString() {
        return "ReqDto{" +
                "opsType=" + opsType +
                ", opsContent='" + opsContent + '\'' +
                '}';
    }
}
