package md.mgmt.base.ops;

/**
 * Created by Mr-yang on 16-1-9.
 */
public class RespDto {

    /**
     * 操作成功与否
     */
    private Boolean success;
    /**
     * 操作返回的消息
     */
    private String msg;
    /**
     * 操作返回的对象
     */
    private String objStr;

    public RespDto() {
    }

    public RespDto(Boolean success, String msg, String objStr) {
        this.success = success;
        this.msg = msg;
        this.objStr = objStr;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getObjStr() {
        return objStr;
    }

    public void setObjStr(String objStr) {
        this.objStr = objStr;
    }

    @Override
    public String toString() {
        return "RespDto{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", objStr='" + objStr + '\'' +
                '}';
    }
}
