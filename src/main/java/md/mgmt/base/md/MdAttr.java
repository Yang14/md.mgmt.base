package md.mgmt.base.md;

/**
 * Created by Mr-yang on 16-1-9.
 * 元数据属性信息
 */
public class MdAttr {

    private String name;
    private byte acl;
    private int size;
    private long createTime;
    private long updateTime;
    private Object otherAttrs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAcl() {
        return acl;
    }

    public void setAcl(byte acl) {
        this.acl = acl;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public Object getOtherAttrs() {
        return otherAttrs;
    }

    public void setOtherAttrs(Object otherAttrs) {
        this.otherAttrs = otherAttrs;
    }

    @Override
    public String toString() {
        return "MdAttr{" +
                "name='" + name + '\'' +
                ", acl=" + acl +
                ", size=" + size +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", otherAttrs=" + otherAttrs +
                '}';
    }
}
