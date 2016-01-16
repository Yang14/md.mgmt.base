package md.mgmt.base.md;

/**
 * Created by Mr-yang on 16-1-9.
 */
public class ExactCode {

    /**
     * 分布编码
     */
    private Long distrCode;
    /**
     * 文件编码
     */
    private String fileCode;

    public ExactCode() {
    }

    public ExactCode(Long distrCode, String fileCode) {
        this.distrCode = distrCode;
        this.fileCode = fileCode;
    }

    public Long getDistrCode() {
        return distrCode;
    }

    public void setDistrCode(Long distrCode) {
        this.distrCode = distrCode;
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    @Override
    public String toString() {
        return "ExactCode{" +
                "distrCode='" + distrCode + '\'' +
                ", fileCode='" + fileCode + '\'' +
                '}';
    }
}
