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
    private Object obj;

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

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "RespDto{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
